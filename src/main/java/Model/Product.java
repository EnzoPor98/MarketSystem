package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    private String name;
    private int cost;
    private String categ;
    private int stock;

    @Temporal(TemporalType.DATE)
    private Date date;

    // *************************************************************************
    // *********************************************************** CONSTRUCTORS.
    // *************************************************************************
    public Product() {
    }

    public Product(int id, String name, int cost, String categ, int stock, Date date) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.categ = categ;
        this.stock = stock;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCateg() {
        return categ;
    }

    public void setCateg(String categ) {
        this.categ = categ;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
