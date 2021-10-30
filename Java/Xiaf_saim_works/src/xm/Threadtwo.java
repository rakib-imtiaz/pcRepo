package xm;

public class Threadtwo extends Thread{
	
	int n;
	
	public Threadtwo(int n) {
		
	this.n=n;
			
			
		
	}
	@Override
	
	public void run() {
		
		System.out.println("This is factorial Thread");
		
		int sum=1;
		while(n!=0)
		{
			sum=sum*n;
			n--;
			
		}
		System.out.println(sum);
		
		
	}
	
	

}
