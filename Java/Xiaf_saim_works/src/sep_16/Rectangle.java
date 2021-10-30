package sep_16;

public class Rectangle extends Shape {
	
	private double length;
	private double width;
	
	
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	double getArea() {
		return width*length;
	}
	
	@Override
	double getPerimeter() {
		return 2*(length+width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + ", filled=" + filled
				+ ", \ngetLength()=" + getLength() + ", getWidth()=" + getWidth() + ", getArea()=" + getArea()
				+ ", getPerimeter()=" + getPerimeter() + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
				+"]";
	}

	
	
	
	

}
