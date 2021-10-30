package labtask12;

public class FullTimeEmployee extends Employee {
	private double basic;
	private double allowance;
	public FullTimeEmployee(String person, int age, String address, String department, String designation, double basic,
			double allowance) {
		super(person, age, address, department, designation);
		this.basic = basic;
		this.allowance = allowance;
	}
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
	
	public double salary()
	{
		
		double basic=this.basic;
		double allowance=this.allowance;
		
		return basic+((allowance/100)*basic);
	}
	@Override
	public String toString() {
		return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + ", getBasic()=" + getBasic()
				+ ", getAllowance()=" + getAllowance() + ", salary()=" + salary() + ", getDepartment()="
				+ getDepartment() + ", getDesignation()=" + getDesignation() + ", printEmployee()=" + printEmployee()
				+ ", getPerson()=" + getPerson() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", printPerson()=" + printPerson() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
