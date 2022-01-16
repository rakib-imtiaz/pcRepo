package lab8Assingment;

public class Rectangle extends GeometricObject {
	
	private double width;
	private double height;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}


	public Rectangle(double width, double height,String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	

	public double getPerimeter() {
		return 0;
	}
	
	public double getArea() {
		return 0;
	}
	
	
	
	

}
