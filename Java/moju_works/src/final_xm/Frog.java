package final_xm;


public class Frog  extends Amphibian {
	private String Name;
	private String species;
	private String type;
	private boolean position;
	
	
	public String getName() {
		return Name;
	}
	public Frog() {
		this.species="Amphibian";
		
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isPosition() {
		return position;
	}
	public void setPosition(boolean position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Frog [Name=" + Name + ", species=" + species + ", type=" + type + ", position=" + position + "]";
	}
	
	
		

}
