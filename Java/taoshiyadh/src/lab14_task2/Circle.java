package lab14_task2;

public class Circle implements GeometricObject {

	protected double radius = 1.0;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius * radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}
