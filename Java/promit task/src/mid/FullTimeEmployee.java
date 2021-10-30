package mid;

public class FullTimeEmployee extends Employee{
	private double basicPay;
	private double medicalAllowance ;
	private double houseRent;
	@Override
	public double salary() {
		
		
		return basicPay+medicalAllowance+houseRent;
		
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getMedicalAllowance() {
		return medicalAllowance;
	}
	public void setMedicalAllowance(double medicalAllowance) {
		this.medicalAllowance = medicalAllowance;
	}
	
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	public FullTimeEmployee(double basicPay, double medicalAllowance, double houseRent) {
		super();
		this.basicPay = basicPay;
		this.medicalAllowance = medicalAllowance;
		this.houseRent = houseRent;
	}
	public double getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(double houseRent) {
		this.houseRent = houseRent;
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [basicPay=" + basicPay + ", medicalAllowance=" + medicalAllowance + ", houseRent="
				+ houseRent + "]";
	}
	
	
	
	
}
