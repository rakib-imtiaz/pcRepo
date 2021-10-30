package mid;

public class Purchase {
	
	private String transactionID;
	private String customerID;
	private String productID;
	private double priceOfProduct;
	public String getTransactionID() {
		return transactionID;
	}
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public double getPriceOfProduct() {
		return priceOfProduct;
	}
	public void setPriceOfProduct(double priceOfProduct) {
		this.priceOfProduct = priceOfProduct;
	}
	public Purchase(String transactionID, String customerID, String productID, double priceOfProduct) {
		super();
		this.transactionID = transactionID;
		this.customerID = customerID;
		this.productID = productID;
		this.priceOfProduct = priceOfProduct;
	}
	
public Purchase() {
	
}
@Override
public String toString() {
	return "Purchase [transactionID=" + transactionID + ", customerID=" + customerID + ", productID=" + productID
			+ ", priceOfProduct=" + priceOfProduct + "]";
}



}
