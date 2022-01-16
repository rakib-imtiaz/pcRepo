package asd;

public class Pineapple extends Fruit implements Cookable {

	

	
	public Pineapple(String fruitname, String color) {
		super(fruitname, color);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Pineapple [getFruitname()=" + getFruitname() + ", getColor()=" + getColor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void howToCook() {
		System.out.println("cooking is possible");
		
	}

	@Override
	public void taste() {
		System.out.println("sour taste");
		
	}


}
