package lab8;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		Area area = new Area();

		Scanner scan = new Scanner(System.in);

		System.out.println("Press (1) for calculating Rectangle Area");
		System.out.println("Press (2) for calculating Square Area");
		System.out.println("Press (3) for calculating Circle Area");

		int option = scan.nextInt();
		int length;
		int breadth;
		int radius;
		switch (option) {

		case 1: {
			System.out.println("Enter length: ");
			length = scan.nextInt();
			System.out.println("Enter breadth: ");
			breadth = scan.nextInt();
			System.out.println("rectangle area: " + area.RectangleArea(length, breadth));
			break;
		}
		case 2: {
			System.out.println("Enter side: ");
			length = scan.nextInt();
			System.out.println("Square area: " + area.squareArea(length));
			break;
		}
		case 3: {
			System.out.println("Enter radius: ");
			radius = scan.nextInt();
			System.out.println("circle area: " + area.CircleArea(radius));
			break;
		}
		}

	}
}
