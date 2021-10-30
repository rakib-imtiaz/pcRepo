package Final_CSE215;

public class ThresholdDiscount implements Discountable{
	
	private double threshold;
	private double discount;
	public ThresholdDiscount(double threshold, double discount) {
		super();
		this.threshold = threshold;
		this.discount = discount;
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
		
		if(price>100)
		{
			return discount=discount+price*.10;
		}
		else {
			return price;
		}
	}
	
	

}
