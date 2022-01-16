package lab14_task2;

public class test2 {
	public static void main(String[] args) {
		
		Circle c = new Circle(5.0);
		System.out.println("Radius: "+c.radius);
		System.out.println("Area: "+c.getArea());
		System.out.println("perimeter: "+c.getPerimeter());
		System.out.println();
		
		ResizeableCircle rc = new ResizeableCircle(6.0);
		System.out.println("Radius : "+rc.radius);
		System.out.println("Area : "+rc.getArea());
		System.out.println("Perimeter : "+rc.getPerimeter());
		System.out.println();
		
		rc.resize(-50);
		System.out.println("Radius : "+rc.radius);
		System.out.println("Area : "+rc.getArea());
		System.out.println("Perimeter : "+rc.getPerimeter());
		System.out.println();
		
	}

}
