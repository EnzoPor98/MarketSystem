package MarketSystem;

/**
 * @author Enzo Portillo.
 */
public class Product {

    private String id;
    private String name;
    private String price;
    private String amount;
    private String stock;
    private int totalPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id.trim();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price.replace("$", "").trim();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount.trim();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock.trim();
    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    public String getTotalPrice() {
        totalPrice = Integer.parseInt(amount) * Integer.parseInt(price);
        return Integer.toString(totalPrice);
    }

    public void setTotalPrice(){
        
    }
}
