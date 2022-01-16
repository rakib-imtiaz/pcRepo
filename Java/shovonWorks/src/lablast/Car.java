package lablast;

public class Car extends Vehicle implements Runnable {

	public Car(String color, int iDnumber, String model) {
		super(color, iDnumber, model);
	}

	public boolean equals(Car obj) {
		return this.getModel().equals(obj.getModel());
	}

	@Override
	public void HowToRun() {
		System.out.println("A car runs with diesel”");

	}

	@Override
	void wheels() {
		System.out.println("A car has four wheels”");
	}

}
