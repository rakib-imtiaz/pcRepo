package viva_Assignment;

public class InvalidDateException extends Exception {

	String Exception;

	public InvalidDateException() {
		super();
	}

	public InvalidDateException(String s) {
		super();
		this.Exception = s;
	}

	@Override
	public String toString() {
		return "InvalidDateException [Exception:=" + Exception + "]";
	}

}
