package shoykotIslam;


public class Cat extends Animal implements Feedable {

	public Cat(String color, int size, String species) {
		super(color, size, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void HowToFeed() {
		System.out.println("“Cat uses paws to feed");
	}


	@Override
	public String toString() {
		return "Cat [toString()=" + super.toString() + ", getColor()=" + getColor() + ", getSize()=" + getSize()
				+ ", getSpecies()=" + getSpecies() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	void food() {
		System.out.println("A Cat eats fish");

		
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getSpecies().equals(((Animal) obj).getSpecies());
	}
	
	

}
