package nov16;

public class PartTimeEmployee extends Employee {

	private double hours;
	private double rate;

	public PartTimeEmployee(double hours, double rate) {
		super();
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

	public double salary() {

		return this.hours * this.rate;

	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hours=" + hours + ", rate=" + rate + ", getHours()=" + getHours() + ", getRate()="
				+ getRate() + ", salary()=" + salary() + ", getDepartment()=" + getDepartment() + ", getDesignation()="
				+ getDesignation() + ", toString()=" + super.toString() + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", getAge()=" + getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
