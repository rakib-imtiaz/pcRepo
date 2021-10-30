package xm;

import java.util.Scanner;

public class threadsmain {
	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:  ");
		int n=scan.nextInt();
		
		if(n%2==0)
		{
			ThreadOne obj1 = new ThreadOne(n);
			
			obj1.start();
			
		}
		else {
			
			Threadtwo obj2 = new Threadtwo(n);
			
			obj2.start();
		}
		
	
		
		
		
		
		
	}

}
