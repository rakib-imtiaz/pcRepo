import java.util.Scanner;

public class test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println(" side 1: ");
		double side1 = input.nextDouble();

		System.out.println(" side 2: ");
		double side2 = input.nextDouble();

		System.out.println(" side 3: ");
		double side3 = input.nextDouble();

		if (isValid(side1, side2, side3)) {
			double area = area(side1, side2, side3);
			System.out.println("The area of triangle is " + area);
		} else {

			System.out.println("Not valid triangle");
		}

	}

	static boolean isValid(double side1, double side2, double side3) {
		if (side1 + side2 >= side3 || side1 + side3 >= side2 || side2 + side3 >= side1) {
			return true;

		} else {
			return false;
		}

	}

	static double area(double side1, double side2, double side3) {

		double s = (side1 + side2 + side3) / 2.0;

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

}
