package FinalExam;

public class Hammer  extends Tool{

	private double power;

	
	
	public Hammer(int length, double power) {
		super(length);
		this.power = power;
	}



	void display()
	{
		System.out.println("power :" +this.power);
	}
	
}
