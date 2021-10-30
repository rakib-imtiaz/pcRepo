package mid;

public class Point {
	private int x;
	private int y;
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
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	double ditsnace(Point a,Point b)
	{
		
		double sum=(Math.sqrt((Math.pow((a.x-b.x),2)+(Math.pow((a.y-b.y),2)));
		return sum;
		
	}

}

 
