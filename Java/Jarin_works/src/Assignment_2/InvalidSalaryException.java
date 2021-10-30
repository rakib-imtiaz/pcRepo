package Assignment_2;

public class InvalidSalaryException extends Exception{

	private double salary;

	public InvalidSalaryException(int salary) {
		super();
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "InvalidSalaryException [salary=" + salary + "]";
	}
	


}
