package quiz;

public class Circle extends Shape {

	private int circleId;
	private static int circleCounter=0;
	double radius;

	public Circle(double dimension1, double dimension2) {
		super(dimension1, dimension2);
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super(radius, radius);
		this.radius = radius;
		circleCounter++;

	}

	public int getCircleId() {
		return circleId;
	}

	public void setCircleId(int circleId) {
		this.circleId = circleId;
		circleCounter++;

	}

	public int getCircleCounter() {
		return circleCounter;
	}

	public void setCircleCounter(int circleCounter) {
		this.circleCounter = circleCounter;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getName()
	{
		return "Circle";
		
	}
	
	public double getArea()
	{
		return 3.1416*radius*radius;
		
	}

	@Override
	public String toString() {
		return "Circle [circleId=" + circleId + ", circleCounter=" + circleCounter + ", radius=" + radius + "]";
	}
	

}
