package viva_assignment;

public class InvalidBottleException extends Exception {

	private int numOfBottle;

	

	public InvalidBottleException(int  no_bottle) {
		super();
		this.numOfBottle = no_bottle;
	}


	@Override
	public String toString() {
		return "InvalidBottleException [(0<No of bottle<200)" + "Bottle number: "+numOfBottle + "]";
	}

}
