package lab8Assingment;

import java.util.Date;

public class Triangle extends GeometricObject {

	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	public Triangle() {
		super();
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	public double getArea() {

		double s = (this.side1 + this.side2 + this.side3) / 2;

		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));

		return area;
	}

	@Override
	public String toString() {
		return "Triangle : side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
	}
	
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle(12,34,45);
		triangle.setColor("red");
		triangle.setFilled(true);
		//Date date = new Date();
	
		System.out.println(triangle);
		System.out.println("Area: "+triangle.getArea());
		System.out.println("perimeter: "+triangle.getPerimeter());
		System.out.println("Color: "+triangle.getColor());
		System.out.println("Filled: "+triangle.isFilled());
		System.out.println("Date created: "+triangle.getDateCreated().getDate());
		
		
		
	}

}
