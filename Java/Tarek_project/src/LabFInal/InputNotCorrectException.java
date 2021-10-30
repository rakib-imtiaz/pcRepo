package LabFInal;


public class InputNotCorrectException extends Exception {

	private double calories;

	

	public InputNotCorrectException(double  a) {
		super();
		this.calories = a;
	}


	@Override
	public String toString() {
		return "InputNotCorrectException : " +"is less than 0]";
	}

}
