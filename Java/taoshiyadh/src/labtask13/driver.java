package labtask13;

public class driver {

	public static void main(String[] args) {
		
		
		System.out.println("Rectangle: ");
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(100);
		rectangle.setWidth(200);
		rectangle.setFilled(false);
		rectangle.setColor("black");

		System.out.println("Rectangle Area: " + rectangle.getArea());
		System.out.println("Rectangle perimeter" + rectangle.getperimeter());


		Circle circle = new Circle();
		circle.setRadius(12);
		circle.setColor("white");
		circle.setFilled(true);
		System.out.println("Color: "+circle.getColor());
		System.out.println("Area" + circle.getArea());
		System.out.println("Circle perimeter" + circle.getperimeter());

		
	}

}
