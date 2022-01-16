package final_jan13;

import lab3.main;
import labfinal.Thread2;

public class Rahim implements Runnable {

	int a,b;
	static int count=0;
	
	@Override
	public void run() {
	
		for(int p=0;p<500;p++)
		{
			synchronized(this)
			{
				a=20;b=20;
			}
			System.out.println(a);
			System.out.println(b);
			//System.out.println(count);
			//count++;
			// TODO Auto-generated method stub
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		Rahim run = new Rahim();
		Thread j1 = new Thread(run);
		Thread j2 = new Thread(run);
		j1.start();
		j2.start();
		
		
	}

}
