package mid;

public class Overdemo {
	
	public static void func1(int x,double y)
	{
		
	}
	public  void func1(double x,double y)
	{
		
	}
	
	public static void main(String[] args) {
		
		Overdemo od = new Overdemo();
		od.func1(2, 2.25);
		Overdemo.func1(2.3, 1);
		
	}

}
