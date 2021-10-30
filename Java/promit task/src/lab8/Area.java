package lab8;

public class Area extends Shape{

	@Override
	public double RectangleArea(int a, int b) {
		
		return a*b;
	}

	@Override
	public double squareArea(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public double CircleArea(int a) {
		// TODO Auto-generated method stub
		return 3.1416*a*a;
	}

}
