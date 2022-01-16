package labfinal;

public class InvalidWeightException extends Exception {
	private double weight;

	public InvalidWeightException(double  weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "weight is : "+weight+" you have to pay full amount" ;
	}

}
