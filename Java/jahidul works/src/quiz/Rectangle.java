package quiz;

public class Rectangle  extends Shape{

	private int rectangleID;
	private static int rectangleCounter=0;
	private int side1,side2;
	
	
	public int getRectangleID() {
		return rectangleID;
	}


	public void setRectangleID(int rectangleID) {
		this.rectangleID = rectangleID;
		rectangleCounter++;
	}


	public int getRectangleCounter() {
		return rectangleCounter;
	}


	public void setRectangleCounter(int rectangleCounter) {
		this.rectangleCounter = rectangleCounter;
	}


	public int getSide1() {
		return side1;
	}


	public void setSide1(int side1) {
		this.side1 = side1;
	}


	public int getSide2() {
		return side2;
	}


	public void setSide2(int side2) {
		this.side2 = side2;
	}


	public String getName()
	{
		return "Rectangle";
		
	}
	
	public double getArea()
	{
		return side1*side2;
		
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [rectangleID=" + rectangleID + ", rectangleCounter=" + rectangleCounter + ", side1=" + side1
				+ ", side2=" + side2 + "]";
	}


	public Rectangle(double dimension1, double dimension2) {
		super(dimension1, dimension2);
		rectangleCounter++;
		// TODO Auto-generated constructor stub
	}
	

}
