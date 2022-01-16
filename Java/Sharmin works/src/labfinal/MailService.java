package labfinal;

public class MailService implements Courier{
	
	private double postFee;
	private String deliveryAddress;
	
	public MailService() {
		// TODO Auto-generated constructor stub
	}

	public MailService(double postFee, String deliveryAddress) {
		super();
		this.postFee = postFee;
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public void payment() {
		
		double fee=postFee+postFee*0.15;
		
		System.out.println("Total : "+fee);
		
	}
	

	public double getPostFee() {
		return postFee;
	}

	public void setPostFee(double postFee) {
		this.postFee = postFee;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public void displayinfo() 
	{
		payment();
		
		System.out.println("Address : "+this.deliveryAddress);
		
		
	}
	

}
