package final_jan13;

public class Rectangle implements CalcArea{

	@Override
	public double calcArea(double x, double y) {
		return x*y;
	
	}

	@Override
	public double calcPerimeter(double x, double y) {
		return 2*(x+y);
	}

	@Override
	public double calcArea(double r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcPerimeter(double r) {
		// TODO Auto-generated method stub
		return 0;
	}

}
