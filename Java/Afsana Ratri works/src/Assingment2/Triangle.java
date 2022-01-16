package Assingment2;

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

		double area = (this.side1 + this.side2 + this.side3) / 2;

		return Math.sqrt(area * (area - this.side1) * (area - this.side2) * (area - this.side3));

	}

	@Override
	public String toString() {
		return "Triangle : side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
	}

	public static void main(String[] args) {

		Triangle triangle = new Triangle(45, 234, 345);

		triangle.setFilled(true);
		triangle.setColor("Violet");

		System.out.println("Area of Triangle		:" + triangle.getArea());
		System.out.println("perimeter of Triangle	:" + triangle.getPerimeter());
		System.out.println("Color of Triangle		:" + triangle.getColor());
		System.out.println("IsFilled				:" + triangle.isFilled());

	}

}
