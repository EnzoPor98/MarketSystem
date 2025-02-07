package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @OneToOne(mappedBy = "cart")
    private Sale sale;

    @OneToMany(mappedBy = "cart")
    private List<ProdCart> prodList;

    @Basic
    private int totalCost;

    @ManyToOne
    private Customer customer;

    @Basic
    private String payMet;

    @Temporal(TemporalType.DATE)
    private Date date;
    
    // *************************************************************************
    // *********************************************************** CONSTRUCTORS.
    // *************************************************************************
    public Cart() {
    }

    public Cart(int id, Sale sale, List<ProdCart> prodList, int totalCost, Customer customer, String payMet, Date date) {
        this.id = id;
        this.sale = sale;
        this.prodList = prodList;
        this.totalCost = totalCost;
        this.customer = customer;
        this.payMet = payMet;
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

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPayMet() {
        return payMet;
    }

    public void setPayMet(String payMet) {
        this.payMet = payMet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<ProdCart> getProdList() {
        return prodList;
    }

    public void setProdList(List<ProdCart> prodList) {
        this.prodList = prodList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
