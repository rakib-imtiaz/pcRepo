package mid;

public class Point {

	private int x;
	private int y;
	
	public Point() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	double getDistance(Point p)
	{
		
		
	}


	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}
