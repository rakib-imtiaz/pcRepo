package quiz;

public class Cellphone {

	private final int SHORT = 10;
	private final int MEDIUM = 20;
	private final int LONG = 30;
	private double call_duration;
	private static int numberOfcall = 0;

	public Cellphone() {
		numberOfcall++;

		// TODO Auto-generated constructor stub
	}

	public Cellphone(double call_duration) {

		super();
		this.call_duration = call_duration;
		numberOfcall++;

	}

	public double getCall_duration() {
		return call_duration;
	}

	public void setCall_duration(double call_duration) {
		this.call_duration = call_duration;
	}

	public static int getNumberOfcall() {
		return numberOfcall;
	}

	public static void setNumberOfcall(int numberOfcall) {
		Cellphone.numberOfcall = numberOfcall;
	}


	void makeCall() {
		System.out.println("making call: "+this.call_duration);
		
		
	}

	void endCall() {
		System.out.println("ending call: "+this.call_duration);

		

	}

}
