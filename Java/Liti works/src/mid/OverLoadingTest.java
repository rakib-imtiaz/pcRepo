package mid;

public class OverLoadingTest {
	
	void print(double d,int x)
	{
		System.out.println("sum= "+(d+x));
		
	}
	void print(double d,float f)
	{
		System.out.println("product= "+(f*d));
		
	}
	void print(int x,float f)
	{
		System.out.println("sub= "+(x-f));
		
	}

}
