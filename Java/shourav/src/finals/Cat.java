package finals;


public class Cat extends Animal implements Feedable {

	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String color, int size, String species) {
		super(color, size, species);
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
		return this.getSpecies().contentEquals(obj.getSpecies()));
	}
	
	

}
