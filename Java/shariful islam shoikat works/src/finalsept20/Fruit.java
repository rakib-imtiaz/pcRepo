package finalsept20;

public abstract class Fruit implements Edible {
	
	private double weight;
	private String color;
	
	
	public Fruit(double weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Fruit [weight=" + weight + ", color=" + color + "]";
	}
	
	
	
	

}
