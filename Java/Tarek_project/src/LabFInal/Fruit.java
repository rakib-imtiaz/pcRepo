package LabFInal;

public abstract class Fruit {
	
	  private  String  color;
	  private double     calories;
	  private String  gram;
	  
	
	  public Fruit() {
		super();
	}


	public Fruit(String color, int calories, String gram) {
		super();
		this.color = color;
		this.calories = calories;
		this.gram = gram;
	}
	
	

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getCalories() {
		return calories;
	}


	public void setCalories(double calories) throws InputNotCorrectException {
		test(calories);
	}


	public String getGram() {
		return gram;
	}


	public void setGram(String gram) {
		this.gram = gram;
	}


	public  void test(double calories) throws InputNotCorrectException
	{
		if(calories<0)
		{
			throw new InputNotCorrectException(calories);
		}
		else {
			this.calories=calories;
			
		}
		
		
	}


	
	
	public  abstract String getHabitat() ;


	@Override
	public String toString() {
		return "Fruit [color=" + color + ", calories=" + calories + ", gram=" + gram + "]";
	}
	
	


	
}
