package lab_task_8;

public class Rectangle {

	private int width;
	private int length;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public double getArea(Rectangle r) {

		return width * length;
	}
}
