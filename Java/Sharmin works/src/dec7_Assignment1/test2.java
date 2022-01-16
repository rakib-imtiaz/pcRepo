package dec7_Assignment1;

public class test2 {
	public static void main(String[] args) {
		
		Circle sss = new Circle(5.0);
		System.out.println("Radius: "+sss.radius);
		System.out.println("Area: "+sss.getArea());
		System.out.println("perimeter: "+sss.getPerimeter());
		System.out.println();
		
		ResizeableCircle as = new ResizeableCircle(6.0);
		System.out.println("Radius : "+as.radius);
		System.out.println("Area : "+as.getArea());
		System.out.println("Perimeter : "+as.getPerimeter());
		System.out.println();
		
		as.resize(-50);
		System.out.println("Radius : "+as.radius);
		System.out.println("Area : "+as.getArea());
		System.out.println("Perimeter : "+as.getPerimeter());
		System.out.println();
		
	}

}
