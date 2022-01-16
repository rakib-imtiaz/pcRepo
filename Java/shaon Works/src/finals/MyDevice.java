package finals;

public abstract class MyDevice {
	private String networks[];
	private double price;
	
	public MyDevice() {
		// TODO Auto-generated constructor stub
	}
	public MyDevice(String[] networks, double price) {
		super();
		this.networks = networks;
		this.price = price;
	}
	public String[] getNetworks() {
		return networks;
	}
	public void setNetworks(String[] networks) {
		this.networks = networks;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract void portable();
	
	

}
