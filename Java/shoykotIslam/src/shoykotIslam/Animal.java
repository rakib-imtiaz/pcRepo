package shoykotIslam;

public abstract class Animal {
	
	private String color;
	private int size;
	private String species;
	
	
	abstract void food();
	
	public Animal(String color, int size, String species) {
		super();
		this.color = color;
		this.size = size;
		this.species = species;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + ", size=" + size + ", species=" + species + "]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	
	

}
