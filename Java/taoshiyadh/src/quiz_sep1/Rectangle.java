package quiz_sep1;

public class Rectangle extends Shape {
	private int rectangleId;
	private static int rectangleCounter;

	public Rectangle(double side1, double side2) {
		super(side1, side2);
		rectangleCounter++;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public void setSide1(double side1) {
		rectangleCounter++;

		super.setDimension1(side1);

		
	}

	public void setSide2(double side2) {
		super.setDimension2(side2);
		
	}

	public double getSide1() {
		return super.getDimension1();
	}

	public double getSide2() {
		return super.getDimension2();
	}

	public int getRectangleId() {
		rectangleId = rectangleCounter;
		return rectangleId;

	}

	public static int getRectangleCounter() {
		return rectangleCounter;
	}

	public String getName() {
		return "Rectangle";
	}

	public double getArea() {
		return  this.getSide1() * this.getSide2();
	}

	@Override
	public String toString() {
		return "Rectangle [rectangleId=" + rectangleId + "]";
	}

}
