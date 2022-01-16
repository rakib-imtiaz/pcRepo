package final_jan13;

public class Triangle implements CalcArea {

	@Override
	public double calcArea(double x, double y) {
		
		
		return pi*x*y;
	}

	@Override
	public double calcPerimeter(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcArea(double r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcPerimeter(double r) {
		// TODO Auto-generated method stub
		return 2*pi*r;
	}

}
