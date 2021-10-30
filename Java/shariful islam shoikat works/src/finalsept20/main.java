package finalsept20;


public class main {
	
	static double root(double x)
	{
		
		
		return Math.sqrt(x);
		
		
	}
	
	public static void main(String[] args) {
		
		int a=-5;
		
		if(a<0)
		{
			
			throw new IllegalArgumentException();
		}
		
		else {
			
			System.out.println(root(a));
		}
		
	}
			
	}
	

