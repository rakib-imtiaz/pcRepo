package assignment34;
import java.util.Scanner;

public class ShapeDriver_1912488 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
//		shape

		System.out.println("Enter the color of Shape: ");
		String color = scan.next();

		System.out.println("Is the Square filled?\nTrue or false?:");
		boolean bool = scan.hasNextBoolean();
		System.out.println(bool);

		Shape_1912488 shape = new Shape_1912488(bool, color);

		String s = scan.next();
		
//		Rectangle

		System.out.println("Enter the color of Rectangle :");
		color = scan.next();

		System.out.println("Is the Square filled?\nTrue or false?");
		bool = scan.hasNext();

		s = scan.next();

		System.out.println("Length: ");
		double length = scan.nextDouble();

		System.out.println("Width: ");
		double width = scan.nextDouble();

		Rectangle_1912488 rectangle = new Rectangle_1912488(bool, color, length, width);

//		square
		
		System.out.println("Enter the color of square");
		color = scan.next();

		System.out.println("Is the Square filled?\nTrue or false?");
		bool = scan.hasNext();
		s = scan.next();

		System.out.println("Length of Side: ");
		double side_length = scan.nextDouble();

		Square_1912488 square = new Square_1912488(bool, color, side_length);

		System.out.println(shape);
		System.out.println(rectangle);
		System.out.println(square);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Area of the square with side length of " + square.length + " is : " + square.getArea());
		System.out.println("Area of the Rectangle  with side lengths of " + rectangle.length + " and " + rectangle.width
				+ " is : " + rectangle.getArea());
		System.out.println(
				"perimeter of the square with side length of " + square.length + " is : " + square.getPerimeter());
		System.out.println("perimeter of the square  with side lengths of " + rectangle.length + " and "
				+ rectangle.width + " is : " + rectangle.getPerimeter());

	}

}
