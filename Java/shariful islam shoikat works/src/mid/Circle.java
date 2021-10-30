package mid;

public class Circle {

	private Point center;
	private double radius;
	
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	
	double getDistance(Circle c)
	{
		double a=Math.pow(c.x-c.y,2);
		double b=Math.pow(this.x-this.y,2);
		double sum=Math.sqrt(a+b);
		return x;
		
		
	}


	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}


	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}


	public public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	double get Area()
	{
		return 3.1416*radius*radius;
		
	}


	

	

}
