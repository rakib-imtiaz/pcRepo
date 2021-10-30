package quiz_sep1;

public class driver {

	public static void main(String[] args) {
		Circle object1 = new Circle();
		object1.setRadius(20);
		Circle object2 = new Circle();
		object2.setRadius(100);
		System.out.println("NUmber of rectangle: "+Rectangle.getRectangleCounter());

		Rectangle object3 = new Rectangle();
		object3.setSide1(30);
		object3.setSide2(40);

		Rectangle object4 = new Rectangle(12, 24);

		System.out.println("number of circle "+Circle.getCircleCounter());

		System.out.println("Circle1 area "+object1.getArea());
		System.out.println(object1);

		System.out.println("Circle2 area "+object2.getArea());
		System.out.println(object2);

		System.out.println("Rec1 area "+object3.getArea());
		System.out.println(object3);

		System.out.println("rec2 area "+object4.getArea());
		System.out.println();

	}

}