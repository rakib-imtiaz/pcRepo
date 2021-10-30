package LabFInal;


public class Apple extends Fruit implements Food{
	


	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, int calories, String gram) {
		super(color, calories, gram);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return "Temperate";
	}

	public boolean equals(Apple obj) {
		
		if(this.getGram().equals(obj.getGram()))
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Apple [getOrigin()=" + getOrigin() + ", getHabitat()=" + getHabitat() + ", getColor()=" + getColor()
				+ ", getCalories()=" + getCalories() + ", getGram()=" + getGram() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "japan";
	}
	
	
	

	
}
