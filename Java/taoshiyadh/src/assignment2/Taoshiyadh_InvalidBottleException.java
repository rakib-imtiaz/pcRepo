package assignment2;

//section_1
public class Taoshiyadh_InvalidBottleException extends Exception {

	private int numOfBottle;

	public Taoshiyadh_InvalidBottleException(int no_bottle) {
		super();
		this.numOfBottle = no_bottle;
	}

	@Override
	public String toString() {
		return "InvalidBottleException [(0<No of bottle<200)" + "Bottle number: " + numOfBottle + "]";
	}

}
