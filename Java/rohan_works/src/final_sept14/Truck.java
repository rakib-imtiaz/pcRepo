package final_sept14;

public class Truck extends Apple implements Roamable {
	
	

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String color, int yearMade, String model) {
		super(color, yearMade, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("A Truck has ten wheels");
	}

	@Override
	public void HowToRoam() {
		System.out.println("A Truck roams in the terrain");

	}
	
	@Override
	public boolean equals(Apple obj) {
		
		if(this.getModel().equals(obj.getModel()))
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Truck [toString()=" + super.toString() + ", getColor()=" + getColor() + ", getYearMade()="
				+ getYearMade() + ", getModel()=" + getModel() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
