package sep_16;

public class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	public double getRadius() {
		return radius;
	}

	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return 3.1416*radius*radius;
	}

	@Override
	double getPerimeter() {
		return 2*3.1416*radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + ", getRadius()=" + getRadius()
				+ ",\n getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + ", getColor()=" + getColor()
				+ ", isFilled()=" + isFilled() +"]";
	}



}
