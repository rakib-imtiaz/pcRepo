package labtask13;

public class Circle extends Shape {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.1416 * radius * radius;
	}

	@Override
	public double getperimeter() {
		return 2 * 3.1416 * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
