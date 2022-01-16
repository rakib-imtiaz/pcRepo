package asd;

public class Pear extends Fruit implements Cookable {

	public Pear(String fruitname, String color) {
		super(fruitname, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pear [getFruitname()=" + getFruitname() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void howToCook() {
		System.out.println("Cant cook");

	}

	@Override
	public void taste() {
		System.out.println("Sweet taste");

	}

}
