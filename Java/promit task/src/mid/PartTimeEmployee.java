package mid;

public class PartTimeEmployee extends Employee{
	private double basicpay;

	@Override
	public String toString() {
		return "PartTimeEmployee [basicpay=" + basicpay + "]";
	}

	public double getBasicpay() {
		return basicpay;
	}

	public PartTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}

	public PartTimeEmployee(double basicpay) {
		super();
		this.basicpay = basicpay;
	}

	@Override
	double salary() {
		
		return basicpay;
		
		
	}

}
