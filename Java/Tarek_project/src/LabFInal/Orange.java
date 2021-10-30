package LabFInal;

public class Orange extends Fruit implements Food {
	
		
	

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, int calories, String gram) {
		super(color, calories, gram);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return "California";
	}

	@Override
	public String getHabitat() {
		// TODO Auto-generated method stub
		return "“Tropical”";
	
	}

	public boolean equals(Orange obj) {
		
		if(this.getGram().equals(obj.getGram()))
			return true;
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Orange [getOrigin()=" + getOrigin() + ", getHabitat()=" + getHabitat() + ", getColor()=" + getColor()
				+ ", getCalories()=" + getCalories() + ", getGram()=" + getGram() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

	
}
