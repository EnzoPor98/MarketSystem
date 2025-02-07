package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProdCart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Product prod;

    @Basic
    private int amount;

    @ManyToOne
    private Cart cart;

    // *************************************************************************
    // *********************************************************** CONSTRUCTORS.
    // *************************************************************************
    public ProdCart() {
    }

    public ProdCart(int id, Product prod, int amount, Cart cart) {
        this.id = id;
        this.prod = prod;
        this.amount = amount;
        this.cart = cart;
    }

    // *************************************************************************
    // ****************************************************** GETTERS & SETTERS.
    // *************************************************************************
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProd() {
        return prod;
    }

    public void setProd(Product prod) {
        this.prod = prod;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
