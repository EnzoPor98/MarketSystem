package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Sale implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private Cart cart;

    @ManyToOne
    private Customer cust;

    @Basic
    private String payMet;
    private int cost;

    @Temporal(TemporalType.DATE)
    private Date date;

    // *************************************************************************
    // *********************************************************** CONSTRUCTORS.
    // *************************************************************************
    public Sale() {
    }

    public Sale(int id, Cart cart, Customer cust, String payMet, int cost, Date date) {
        this.id = id;
        this.cart = cart;
        this.cust = cust;
        this.payMet = payMet;
        this.cost = cost;
        this.date = date;
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

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public String getPayMet() {
        return payMet;
    }

    public void setPayMet(String payMet) {
        this.payMet = payMet;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
