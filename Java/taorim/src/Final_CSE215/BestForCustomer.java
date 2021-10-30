package Final_CSE215;

public class BestForCustomer implements Discountable{
	
	private double percentage;
	private double threshold;
	private double discount;
	
	
	public BestForCustomer() {
		super();
	}


	public BestForCustomer(double percentage, double threshold, double discount) {
		super();
		this.percentage = percentage;
		this.threshold = threshold;
		this.discount = discount;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public double getThreshold() {
		
		return threshold;
	}


	public void setThreshold(double threshold) {
		this.threshold = threshold;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	@Override
	public double discountedPrice(double price) {
		
		double sum=price+price*discount/100.0;
		
		
		return 0;
	}
	
	
	

}
