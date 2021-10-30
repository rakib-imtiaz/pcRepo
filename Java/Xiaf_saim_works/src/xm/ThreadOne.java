package xm;

public class ThreadOne extends Thread{
	
	int n;
	
	public ThreadOne(int n) {
		
	this.n=n;
			
			
		
	}
	@Override
	
	public void run() {
		
		System.out.println("This is divisor Thread");
		for(int i=0;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
				
			}
			
			
		}
		
		
	}
	
	

}
