package final_sept14;

public class Apple extends Vehicle implements Roamable{
	

	
	

	@Override
	public void wheels() {
		
		System.out.println("A car has four wheels");
		
	}
	
	@Override
	public boolean equals(Apple obj) {
		
		if(this.getModel().contentEquals(obj.getModel()))
			return true;
		else {
			return false;
		}
	}

	@Override
	public void HowToRoam() {
		// TODO Auto-generated method stub
		System.out.println("A car roams in the road");
		
	}

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, int yearMade, String model) {
		super(color, yearMade, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [getColor()=" + getColor() + ", getYearMade()=" + getYearMade() + ", getModel()=" + getModel()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

	
}
