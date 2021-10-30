package assignment34;

public class Rectangle_1912488 extends Shape_1912488{
	
	
	protected double length;
	protected double width;
	
	public Rectangle_1912488(boolean filled, String color,double length,double width) {
		super(filled, color);
		
		this.color=color;
		this.filled=filled;
		this.length=length;
		this.width=width;
	}

	@Override
	public String toString() {
		return "Rectangle  [Color=" + color + "Is filled=" + filled +"Length : "+length+ "  Width :  "+width+ "]";
	}
	
	double getArea()
	{
		return length*width;
		
		
	}
	
	
	
	double getPerimeter()
	{
		return 2*(length+width);
		
		
	}
	
	
	
	
	
	
	
	
	

}