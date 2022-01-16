package shoykotIslam;

public class Cow extends Animal implements Feedable {

	public Cow(String color, int size, String species) {
		super(color, size, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void HowToFeed() {
		System.out.println("Cow uses long neck to feed");

	}

	@Override
	void food() {
		System.out.println("A Cow eats grass");

	}
	

	@Override
	public boolean equals(Object obj) {
		return this.getSpecies().equals(((Animal) obj).getSpecies());
	}

	@Override
	public String toString() {
		return "Cow [toString()=" + super.toString() + ", getColor()=" + getColor() + ", getSize()=" + getSize()
				+ ", getSpecies()=" + getSpecies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
