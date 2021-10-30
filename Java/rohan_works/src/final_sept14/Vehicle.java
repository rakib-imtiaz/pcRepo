package final_sept14;

public abstract class Vehicle {
	
	  private  String  color;
	  private int  yearMade;
	  private String  model;
	  
	
	  public Vehicle() {
		super();
	}


	public Vehicle(String color, int yearMade, String model) {
		super();
		this.color = color;
		this.yearMade = yearMade;
		this.model = model;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getYearMade() {
		return yearMade;
	}


	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	


	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", yearMade=" + yearMade + ", model=" + model + "]";
	}


	public  abstract void wheels() ;


	public boolean equals(Apple obj) {
		// TODO Auto-generated method stub
		return false;
	}
}
