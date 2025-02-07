package Controller;

import Controller.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Model.Cart;
import Model.ProdCart;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdCartJpaController implements Serializable {

    public ProdCartJpaController() {
        this.emf = Persistence.createEntityManagerFactory("MarketSystem_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(ProdCart prodCart) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cart cart = prodCart.getCart();
            if (cart != null) {
                cart = em.getReference(cart.getClass(), cart.getId());
                prodCart.setCart(cart);
            }
            em.persist(prodCart);
            if (cart != null) {
                cart.getProdList().add(prodCart);
                cart = em.merge(cart);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(ProdCart prodCart) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ProdCart persistentProdCart = em.find(ProdCart.class, prodCart.getId());
            Cart cartOld = persistentProdCart.getCart();
            Cart cartNew = prodCart.getCart();
            if (cartNew != null) {
                cartNew = em.getReference(cartNew.getClass(), cartNew.getId());
                prodCart.setCart(cartNew);
            }
            prodCart = em.merge(prodCart);
            if (cartOld != null && !cartOld.equals(cartNew)) {
                cartOld.getProdList().remove(prodCart);
                cartOld = em.merge(cartOld);
            }
            if (cartNew != null && !cartNew.equals(cartOld)) {
                cartNew.getProdList().add(prodCart);
                cartNew = em.merge(cartNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = prodCart.getId();
                if (findProdCart(id) == null) {
                    throw new NonexistentEntityException("The prodCart with id " + id + " no longer exists.");
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
            ProdCart prodCart;
            try {
                prodCart = em.getReference(ProdCart.class, id);
                prodCart.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The prodCart with id " + id + " no longer exists.", enfe);
            }
            Cart cart = prodCart.getCart();
            if (cart != null) {
                cart.getProdList().remove(prodCart);
                cart = em.merge(cart);
            }
            em.remove(prodCart);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<ProdCart> findProdCartEntities() {
        return findProdCartEntities(true, -1, -1);
    }

    public List<ProdCart> findProdCartEntities(int maxResults, int firstResult) {
        return findProdCartEntities(false, maxResults, firstResult);
    }

    private List<ProdCart> findProdCartEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(ProdCart.class));
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

    public ProdCart findProdCart(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(ProdCart.class, id);
        } finally {
            em.close();
        }
    }

    public int getProdCartCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<ProdCart> rt = cq.from(ProdCart.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
