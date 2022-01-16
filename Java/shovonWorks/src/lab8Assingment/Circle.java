package lab8Assingment;

public class Circle  extends GeometricObject{
	
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius,String color, boolean filled) {
		
		super(color, filled);
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return radius;
	}
	
	public double getDiameter() {
		return radius;
	}
	
	public void printCircle()
	{
		
		
	}

	
	

}
