package labtask13;

public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double getArea() {
		return length*width;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	@Override
	public double getperimeter() {
		return 2+(length+width);
	}
	
	

}
