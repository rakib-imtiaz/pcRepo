package finalxm;

public class MultiProgrammingDemo {
	
	public static void main(String[] args) {
		
		ThreadOne obj1 = new ThreadOne();
		
		obj1.start();
		
		Threadtwo obj2 = new Threadtwo();
		
		obj2.start();
		
		
		
	}

}
