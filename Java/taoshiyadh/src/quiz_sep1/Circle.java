package quiz_sep1;

public class Circle extends Shape {
	private int circleId;
	private double radius;
	private static int circleCounter;

	
	public Circle(double d1, double d2) {
		super(d1, d2);
		// TODO Auto-generated constructor stub
	}
	
	

	public Circle(int circleId) {
		super();
		this.circleId = circleId;
	}



	public Circle(double radius) {
		this.radius = radius;
		circleCounter++;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		circleCounter++;

	}

	public int getCircleId() {
		circleId = circleCounter;
		return circleId;
	}

	public static int getCircleCounter() {
		return circleCounter;

	}

	public String getName() {
		return "Circle";
	}

	public double getArea() {
		return getRadius() * getRadius() * 3.14;
	}

	@Override
	public String toString() {
		return "Circle [circleId=" + circleId + ", radius=" + radius + "]";
	}

}