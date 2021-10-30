package xm;

public class InvalidRadius extends Exception {

	private int radius;

	

	public InvalidRadius(int  radius) {
		super();
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "InvalidRadius " + "is negative: "+radius + "]";
	}

}
