package dec24_assignment;

public class InvalidBMIException extends Exception{
	private double bmi;

	public InvalidBMIException(double  bmi) {
		super();
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "InvalidBMIException: Your BMI isnt  in the Healthy range";
	}

}
