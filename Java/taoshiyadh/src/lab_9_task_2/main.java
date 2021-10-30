package lab_9_task_2;

public class main {
	
	public static void main(String[] args) {
		
		Point p = new Point();
		p.setX(5);
		p.setY(6);
		Point q = new Point(3,4);
		
		Line a = new Line(p,q);
		
		System.out.println("Length: "+ a.getLength());
		
		Line b = new Line(0,0,3,4);
		
		System.out.println("Length: "+ b.getLength());
		
		
	}

}
