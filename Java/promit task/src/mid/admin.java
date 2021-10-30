
public class admin {
	private double basicPay;
	private double medicalAllowance ;
	private double houseRent;
	private double basicpay;
	private double overtime;
	private int roomNumber;
	private String Department;
	
	public admin(double basicPay, double medicalAllowance, double houseRent, double basicpay2, double overtime,
			int roomNumber, String department) {
		super();
		this.basicPay = basicPay;
		this.medicalAllowance = medicalAllowance;
		this.houseRent = houseRent;
		basicpay = basicpay2;
		this.overtime = overtime;
		this.roomNumber = roomNumber;
		Department = department;
	}
	
void printEmployee(Employee e)
	
	{
	
	String name= e.getName();
	String id= e.getId();
		
		System.out.println(name);
		System.out.println(id);
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
	public double getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(double houseRent) {
		this.houseRent = houseRent;
	}
	public double getBasicpay() {
		return basicpay;
	}
	public void setBasicpay(double basicpay) {
		this.basicpay = basicpay;
	}
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public String toString() {
		return "admin [basicPay=" + basicPay + ", medicalAllowance=" + medicalAllowance + ", houseRent=" + houseRent
				+ ", basicpay=" + basicpay + ", overtime=" + overtime + ", roomNumber=" + roomNumber + ", Department="
				+ Department + "]";
	}
	
	
	
}
