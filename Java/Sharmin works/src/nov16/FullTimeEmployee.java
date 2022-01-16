package nov16;

import jdk.jfr.Percentage;

public class FullTimeEmployee extends Employee{
	private double basic;
	private double allowance;
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getAllowance() {
		return allowance;
	}
	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	public FullTimeEmployee(double basic, double allowance) {
		super();
		this.basic = basic;
		this.allowance = allowance;
	}
	
	public FullTimeEmployee() {
		// TODO Auto-generated constructor stub
	}
	public double salary() {
		
		double Percentage=this.allowance/100.0;
		
		
		double salary=basic+basic*Percentage;
		
		return salary;
		
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + ", getBasic()=" + getBasic()
				+ ", getAllowance()=" + getAllowance() + ", salary()=" + salary() + ", getDepartment()="
				+ getDepartment() + ", getDesignation()=" + getDesignation() + ", toString()=" + super.toString()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	

}
