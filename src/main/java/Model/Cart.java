package Model;

import java.util.List;

public class Cart {
    private int id;
    private List<Product> prodList;
    private List<Double> subTotalList;
    private int totalCost;

    // *************************************************************************
    // *********************************************************** CONSTRUCTORS.
    // *************************************************************************
    public Cart() {
    }

    public Cart(int id, List<Product> prodList, List<Double> subTotalList, int totalCost) {
        this.id = id;
        this.prodList = prodList;
        this.subTotalList = subTotalList;
        this.totalCost = totalCost;
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

    public List<Product> getProdList() {
        return prodList;
    }

    public void setProdList(List<Product> prodList) {
        this.prodList = prodList;
    }

    public List<Double> getSubTotalList() {
        return subTotalList;
    }

    public void setSubTotalList(List<Double> subTotalList) {
        this.subTotalList = subTotalList;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
}
