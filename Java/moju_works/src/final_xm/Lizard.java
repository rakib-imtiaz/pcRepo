package final_xm;

public class Lizard implements ReptileInterface{
	
	private String name;
	private String species;
	private int age;
	public Lizard() {
		this.species="Lizard";
	}
	@Override
	public void setName(String name) {
		this.name=name;
		
	}
	@Override
	public String getname() {
		return this.name;
	}
	@Override
	public String toString() {
		return "Lizard [name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	@Override
	public void setAge(int age) {
		this.age=age;
		
	}
	@Override
	public int getAge() {
		return this.age;
	}
	@Override
	public void setSpecies(String species) {
		this.species=species;
		
	}
	@Override
	public String getSpecies() {
		return this.species;
	}
	
}
