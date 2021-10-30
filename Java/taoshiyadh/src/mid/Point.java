package mid;

public class Point {
	private double x;
	private double y;

	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	double ditsnace(Point a)
	{
		double part1=Math.pow((a.x-this.x),2);
		double part2=Math.pow((a.y-this.y),2);
		
		double sum=Math.sqrt(part1+part2);
		return sum;
		
	}
	static Point  midpoint(Point a,Point b)
	{
		double new_x=(a.x+b.x)/2.0;
		double new_y=(a.y+b.y)/2.0;
		
		Point p = null;
		p.setX(new_x);
		p.setY(new_y);
		
		return p;

		
		
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
