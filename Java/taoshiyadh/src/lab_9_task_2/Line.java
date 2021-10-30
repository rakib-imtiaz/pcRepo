package lab_9_task_2;

public class Line {
	
	private Point start;
	private Point end;
	
	Line()
	{
		
	}
	Line(int x1,int x2,int y1,int y2)
	{
		start.setX(x1);
		start.setY(y1);

		end.setX(x2);
		end.setY(y2);
	}
	Line(Point start,Point end)
	{
		this.start=start;
		this.end=end;
		
	}
	public Point getStart() {
		return start;
	}
	public void setStart(Point start) {
		this.start = start;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	
	public double getLength()
	{
		double calc_length=Math.pow(end.getX()-start.getX(),2)+Math.pow(end.getY()-start.getY(),2);	
		return calc_length;
	}

}
