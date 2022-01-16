package mid_215;


import java.util.Scanner;

public class Cube {
	
	private double side=1.0;
	public Cube() {
		// TODO Auto-generated constructor stub
	}
	public Cube(double side) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public double printVolume()
	{
		
		return Math.pow(side, 3);
	}
	
	public String display()
	{
		return "Side : "+this.side+"\n"+"Volume: "+this.printVolume();
	}
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter three sides : ");
		int a=in.nextInt();
		
		int b=in.nextInt();
		int c=in.nextInt();
		
		Cube cube1 = new Cube(a);		
		Cube cube2 = new Cube(b);		
		Cube cube3 = new Cube(c);
		
		System.out.println("Total volume: "+cube1.printVolume()+cube2.printVolume()+cube3.printVolume()
		);
		
	}

}
