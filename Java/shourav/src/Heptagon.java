
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
	
	public static void main(String[] args) {
		
		
		int[][] array = {{1, 2}, {3, 4}, {4, 5}};

		int mul = 1;

		for(int i = 0; i < array.length; i++)

		    mul *= array[i][1];

		System.out.println(mul);

	}
	

}
