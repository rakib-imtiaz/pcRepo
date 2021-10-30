package lab8;

public abstract class Shape {
	private double area;
	
	public Shape() {
		super();
	}
	@Override
	public String toString() {
		return "Shape [area=" + area + "]";
	}
	public Shape(double area) {
		super();
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public abstract double RectangleArea(int a,int b);
	public abstract double squareArea(int a);
	public abstract double CircleArea(int a);
	

}
