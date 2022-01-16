package lablast;

public class Cycle extends Vehicle implements Runnable {

	
	public Cycle(String color, int iDnumber, String model) {
		super(color, iDnumber, model);
		// TODO Auto-generated constructor stub
	}
	public boolean equals(Vehicle obj) {
		if (this.getModel().equals(obj.getModel()))
			return true;
		else {
			return false;
		}
	}
	 public boolean equals(Cycle obj) {
	        return this.getModel().equals(obj.getModel());
	    }

	@Override
	public void HowToRun() {
		System.out.println("A cycle runs with energy");

	}

	@Override
	void wheels() {
		System.out.println("A Cycle has two wheels”");

	}

}
