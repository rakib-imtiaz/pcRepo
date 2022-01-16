package asd;

public abstract class Fruit {
	
	private String fruitname;
	private String color;

	public Fruit(String fruitname, String color) {
		super();
		this.fruitname = fruitname;
		this.color = color;
	}
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public abstract void taste();
	

}
