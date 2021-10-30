package little_works;

public class Rectangle {
	
	 int sideA;
	 int sideB;
	 
	 Rectangle(int sideA,int sideB)
	 {
		 this.sideA=sideA;
		 this.sideB=sideB;
		 
	 }
	
	 
	 Rectangle(int side)
	 {
		 this.sideA=side;
		 this.sideB=side;
		 
	 }
	 
	
	public double Area()
	{
		return sideA*sideB;
	}
	
	
	public double perimeter()
	{
		return 2*(sideA+sideB);
	}
	
	public static void main(String[] args) {
		
		
		Rectangle obj1= new Rectangle(4,5);
		Rectangle obj2= new Rectangle(5,8);
		Rectangle obj3= new Rectangle(5,5);
		Rectangle obj4= new Rectangle(5);
		
		System.out.println("Area1      : "+obj1.Area());
		System.out.println("perimeter1 : "+obj1.perimeter());
		System.out.println();
		
		System.out.println("Are21      : "+obj2.Area());
		System.out.println("perimeter2 : "+obj2.perimeter());
		System.out.println();
		
		System.out.println("Area3      : "+obj3.Area());
		System.out.println("perimeter3 : "+obj3.perimeter());
		System.out.println();
		
		System.out.println("Area4      : "+obj4.Area());
		System.out.println("perimeter4 : "+obj4.perimeter());
		System.out.println();
		
		
	}
	

}
