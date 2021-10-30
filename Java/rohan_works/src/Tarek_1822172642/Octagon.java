package Tarek_1822172642;

public class Octagon {
	private double side;
	public static int numberOfOctagon;

	public Octagon() {
	}

	public Octagon(double side) {
		this.side = side;
		numberOfOctagon++;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getArea() {
		return (2 + (4 / Math.sqrt(2))) * Math.pow(side, 2);
	}

	public double getPerimeter() {

		double perimter = side * 8;
		return perimter;

	}
}