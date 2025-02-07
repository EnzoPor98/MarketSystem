package Controller;

import Controller.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Model.Cart;
import Model.Sale;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SaleJpaController implements Serializable {

    public SaleJpaController() {
        this.emf = Persistence.createEntityManagerFactory("MarketSystem_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Sale sale) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cart cart = sale.getCart();
            if (cart != null) {
                cart = em.getReference(cart.getClass(), cart.getId());
                sale.setCart(cart);
            }
            em.persist(sale);
            if (cart != null) {
                Sale oldSaleOfCart = cart.getSale();
                if (oldSaleOfCart != null) {
                    oldSaleOfCart.setCart(null);
                    oldSaleOfCart = em.merge(oldSaleOfCart);
                }
                cart.setSale(sale);
                cart = em.merge(cart);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Sale sale) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sale persistentSale = em.find(Sale.class, sale.getId());
            Cart cartOld = persistentSale.getCart();
            Cart cartNew = sale.getCart();
            if (cartNew != null) {
                cartNew = em.getReference(cartNew.getClass(), cartNew.getId());
                sale.setCart(cartNew);
            }
            sale = em.merge(sale);
            if (cartOld != null && !cartOld.equals(cartNew)) {
                cartOld.setSale(null);
                cartOld = em.merge(cartOld);
            }
            if (cartNew != null && !cartNew.equals(cartOld)) {
                Sale oldSaleOfCart = cartNew.getSale();
                if (oldSaleOfCart != null) {
                    oldSaleOfCart.setCart(null);
                    oldSaleOfCart = em.merge(oldSaleOfCart);
                }
                cartNew.setSale(sale);
                cartNew = em.merge(cartNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = sale.getId();
                if (findSale(id) == null) {
                    throw new NonexistentEntityException("The sale with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sale sale;
            try {
                sale = em.getReference(Sale.class, id);
                sale.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The sale with id " + id + " no longer exists.", enfe);
            }
            Cart cart = sale.getCart();
            if (cart != null) {
                cart.setSale(null);
                cart = em.merge(cart);
            }
            em.remove(sale);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Sale> findSaleEntities() {
        return findSaleEntities(true, -1, -1);
    }

    public List<Sale> findSaleEntities(int maxResults, int firstResult) {
        return findSaleEntities(false, maxResults, firstResult);
    }

    private List<Sale> findSaleEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Sale.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Sale findSale(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Sale.class, id);
        } finally {
            em.close();
        }
    }

    public int getSaleCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Sale> rt = cq.from(Sale.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
