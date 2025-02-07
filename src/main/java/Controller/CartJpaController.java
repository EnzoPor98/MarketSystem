package Controller;

import Controller.exceptions.NonexistentEntityException;
import Model.Cart;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Model.Sale;
import Model.ProdCart;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CartJpaController implements Serializable {

    public CartJpaController() {
        this.emf = Persistence.createEntityManagerFactory("MarketSystem_PU");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cart cart) {
        if (cart.getProdList() == null) {
            cart.setProdList(new ArrayList<ProdCart>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Sale sale = cart.getSale();
            if (sale != null) {
                sale = em.getReference(sale.getClass(), sale.getId());
                cart.setSale(sale);
            }
            List<ProdCart> attachedProdList = new ArrayList<ProdCart>();
            for (ProdCart prodListProdCartToAttach : cart.getProdList()) {
                prodListProdCartToAttach = em.getReference(prodListProdCartToAttach.getClass(), prodListProdCartToAttach.getId());
                attachedProdList.add(prodListProdCartToAttach);
            }
            cart.setProdList(attachedProdList);
            em.persist(cart);
            if (sale != null) {
                Cart oldCartOfSale = sale.getCart();
                if (oldCartOfSale != null) {
                    oldCartOfSale.setSale(null);
                    oldCartOfSale = em.merge(oldCartOfSale);
                }
                sale.setCart(cart);
                sale = em.merge(sale);
            }
            for (ProdCart prodListProdCart : cart.getProdList()) {
                Cart oldCartOfProdListProdCart = prodListProdCart.getCart();
                prodListProdCart.setCart(cart);
                prodListProdCart = em.merge(prodListProdCart);
                if (oldCartOfProdListProdCart != null) {
                    oldCartOfProdListProdCart.getProdList().remove(prodListProdCart);
                    oldCartOfProdListProdCart = em.merge(oldCartOfProdListProdCart);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cart cart) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cart persistentCart = em.find(Cart.class, cart.getId());
            Sale saleOld = persistentCart.getSale();
            Sale saleNew = cart.getSale();
            List<ProdCart> prodListOld = persistentCart.getProdList();
            List<ProdCart> prodListNew = cart.getProdList();
            if (saleNew != null) {
                saleNew = em.getReference(saleNew.getClass(), saleNew.getId());
                cart.setSale(saleNew);
            }
            List<ProdCart> attachedProdListNew = new ArrayList<ProdCart>();
            for (ProdCart prodListNewProdCartToAttach : prodListNew) {
                prodListNewProdCartToAttach = em.getReference(prodListNewProdCartToAttach.getClass(), prodListNewProdCartToAttach.getId());
                attachedProdListNew.add(prodListNewProdCartToAttach);
            }
            prodListNew = attachedProdListNew;
            cart.setProdList(prodListNew);
            cart = em.merge(cart);
            if (saleOld != null && !saleOld.equals(saleNew)) {
                saleOld.setCart(null);
                saleOld = em.merge(saleOld);
            }
            if (saleNew != null && !saleNew.equals(saleOld)) {
                Cart oldCartOfSale = saleNew.getCart();
                if (oldCartOfSale != null) {
                    oldCartOfSale.setSale(null);
                    oldCartOfSale = em.merge(oldCartOfSale);
                }
                saleNew.setCart(cart);
                saleNew = em.merge(saleNew);
            }
            for (ProdCart prodListOldProdCart : prodListOld) {
                if (!prodListNew.contains(prodListOldProdCart)) {
                    prodListOldProdCart.setCart(null);
                    prodListOldProdCart = em.merge(prodListOldProdCart);
                }
            }
            for (ProdCart prodListNewProdCart : prodListNew) {
                if (!prodListOld.contains(prodListNewProdCart)) {
                    Cart oldCartOfProdListNewProdCart = prodListNewProdCart.getCart();
                    prodListNewProdCart.setCart(cart);
                    prodListNewProdCart = em.merge(prodListNewProdCart);
                    if (oldCartOfProdListNewProdCart != null && !oldCartOfProdListNewProdCart.equals(cart)) {
                        oldCartOfProdListNewProdCart.getProdList().remove(prodListNewProdCart);
                        oldCartOfProdListNewProdCart = em.merge(oldCartOfProdListNewProdCart);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cart.getId();
                if (findCart(id) == null) {
                    throw new NonexistentEntityException("The cart with id " + id + " no longer exists.");
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
            Cart cart;
            try {
                cart = em.getReference(Cart.class, id);
                cart.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cart with id " + id + " no longer exists.", enfe);
            }
            Sale sale = cart.getSale();
            if (sale != null) {
                sale.setCart(null);
                sale = em.merge(sale);
            }
            List<ProdCart> prodList = cart.getProdList();
            for (ProdCart prodListProdCart : prodList) {
                prodListProdCart.setCart(null);
                prodListProdCart = em.merge(prodListProdCart);
            }
            em.remove(cart);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cart> findCartEntities() {
        return findCartEntities(true, -1, -1);
    }

    public List<Cart> findCartEntities(int maxResults, int firstResult) {
        return findCartEntities(false, maxResults, firstResult);
    }

    private List<Cart> findCartEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cart.class));
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

    public Cart findCart(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cart.class, id);
        } finally {
            em.close();
        }
    }

    public int getCartCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cart> rt = cq.from(Cart.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
