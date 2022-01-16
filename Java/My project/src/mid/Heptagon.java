
public class Heptagon {
	private double side;
	
	public static  int numOfHeptagon=0;
	
	public Heptagon(double side) {
		super();
		this.side = side;
		numOfHeptagon++;
		
	}
	
	public Heptagon() {
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	
	public double getArea()
	{
		
		double denom=7.0/4.0 ;
		double nom=denom*Math.pow(this.side, 2)*(1/Math.tan(180/7));
		return denom/nom;
		
		
	}
	public double getPerimeter()
	{
		
		double premeter=this.side*7;
		return premeter;
		
	}
	
	

}
