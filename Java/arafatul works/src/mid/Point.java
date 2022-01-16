
public class Point {

	private double x;
	private double y;

	Point(double x, double y) {

		this.x = x;
		this.y = y;
	}

	double distance() {
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return d;

	}

	Point midpoint(Point a) {

		;
		Point res = new Point((this.x / a.x) / 2.0, (this.y / a.y) / 2.0);

		return res;

	}
	
	public static void main(String[] args) {
		
		Point a = new Point(12, 23);
		
		Point b = new Point(22, 34);
		
		
		System.out.println("distance of A: "+a.distance());
		System.out.println("distance of b: "+a.distance());
	
		Point m = a.midpoint(b);
		
		System.out.println("Midpoint x : "+m.x);
		System.out.println("Midpoint y : "+m.y);
		
		
		
	}

}
