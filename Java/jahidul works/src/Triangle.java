
public class Triangle extends Shape{
	
	private int base;
	private int height;

	
	
	
	





	public Triangle(int base, int height,String color) {
		super(color);
		this.base = base;
		this.height = height;
	}








	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + "]";
	}








	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return .5*base*height;
	}
	
	
	
	
	

}
