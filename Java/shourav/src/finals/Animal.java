package finals;

public abstract class Animal {
	
	private String Color;
	private int sizes;
	private String species;
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String color, int size, String species) {
		super();
		this.Color = color;
		this.sizes = size;
		this.species = species;
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		this.Color = color;
	}
	public int getSize() {
		return sizes;
	}
	public void setSize(int size) {
		this.sizes = size;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	

	abstract void food();
	
	
	@Override
	public String toString() {
		return "Animal [color=" + Color + ", size=" + sizes + ", species=" + species + "]";
	}
	
	

}
