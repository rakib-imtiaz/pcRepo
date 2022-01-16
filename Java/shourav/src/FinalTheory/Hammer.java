package FinalTheory;

class Hammer extends Tool {
	private double power;

	public Hammer() {
		// TODO Auto-generated constructor stub
	}
	Hammer(int length, double power) {
		super(length);
		this.power = power;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public void display() {
		super.display();
		System.out.println("Power of Hammer:" + power);
	}
}