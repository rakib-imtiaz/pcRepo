package lab_9_task_2;

public class Point extends Line{
	private int x;
	private int y;
	
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	
	Point()
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
