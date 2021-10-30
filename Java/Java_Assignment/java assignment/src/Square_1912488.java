
public class Square_1912488  extends  Rectangle_1912488{
	
	public double side_length;

	public Square_1912488(boolean filled, String color, double side_length) {
		super(filled, color,side_length,side_length);
		
		this.side_length=side_length;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Square [Color=" + color + "Is filled=" + filled +"Length of Side: "+side_length+ "]";
	}




	@Override
	double getArea() {
		
		return side_length*side_length;
	}




	@Override
	double getPerimeter() {
		
		return 4*side_length;
		
		
	}
	

	

}
