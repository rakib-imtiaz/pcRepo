
public class DemoClass {
	
	private static final double pi=3.1416;
	
	
	
	class inner{
		
		void CalculateArea(double radius)
		{
			double area =pi*radius*radius;
			System.out.println("Area "+area);
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		DemoClass d = new DemoClass();
		
		DemoClass.inner inner = new DemoClass().new inner();
		
		inner.CalculateArea(5.0);
		
		
	}


}
