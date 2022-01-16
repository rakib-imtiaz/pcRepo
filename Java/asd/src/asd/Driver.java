package asd;

public class Driver {

	public static void main(String[] args) {

		Pineapple pineFruit = new Pineapple("Pineapple,", "yellow");
		Pear peareFruit = new Pear("pear,", "red");

		pineFruit.howToCook();
		pineFruit.taste();

		peareFruit.howToCook();
		peareFruit.taste();
	}

}
