package quiz_aug1;


public class Product {

    private String productName;
    private int price;
    private int quantity;
    private int productID;

    public Product() {

    }
    
    public Product(String productName, int price, int quantity, int productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
   /*Getters and Setters*/
    public String getProductName(){
        return productName;
    }
   
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getProductID(){
        return productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

  

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    

    @Override
    public String toString() {
        return "Product[" + "productName=" + productName + ", price=" + price + ", quantity=" + quantity + ", productID=" + productID + "]";
    }
    

}
