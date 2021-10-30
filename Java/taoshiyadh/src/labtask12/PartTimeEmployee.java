package labtask12;

public class PartTimeEmployee extends Employee{
	
	private double hours;
	private double rate;
	public PartTimeEmployee(String person, int age, String address, String department, String designation, double hours,
			double rate) {
		super(person, age, address, department, designation);
		this.hours = hours;
		this.rate = rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double salary()
	{
		
		return this.rate*this.hours;
		
	}
	@Override
	public String toString() {
		return "PartTimeEmployee [hours=" + hours + ", rate=" + rate + ", getHours()=" + getHours() + ", getRate()="
				+ getRate() + ", salary()=" + salary() + ", getDepartment()=" + getDepartment() + ", getDesignation()="
				+ getDesignation() + ", printEmployee()=" + printEmployee() + ", getPerson()=" + getPerson()
				+ ", getAge()=" + getAge() + ", getAddress()=" + getAddress() + ", printPerson()=" + printPerson()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
