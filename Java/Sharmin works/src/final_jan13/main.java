package final_jan13;

public class main {

	public static void main(String[] args) {

		Rectangle a = new Rectangle();
		System.out.println(a.calcArea(20));
		System.out.println(a.calcPerimeter(20));

		Triangle t = new Triangle();

		System.out.println(a.calcArea(3.2));
		System.out.println(t.calcPerimeter(23));

		square s = new square();
		System.out.println(s.calcArea(23));
		System.out.println(s.calcPerimeter(23));
	}
}
