package quiz;

public class Driver {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(3.4);
		Circle c2 = new Circle(4.5);
		
		Rectangle r1 = new Rectangle(12, 23);
		Rectangle r2 = new Rectangle(34, 34);
		
		System.out.println(c1.getCircleCounter());
		System.out.println(c2.getCircleCounter());
		
		System.out.println(r1.getRectangleCounter());
		System.out.println(r2.getRectangleCounter());
		
		
		
	}

}
