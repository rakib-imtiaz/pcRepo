package final_sept12;

public class IllegalArgumentException extends Exception{
private double salary;

	

	public IllegalArgumentException(int  salary) {
		super();
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "IllegalArgumentException : yearly salary cannot be negative";
	}

}
