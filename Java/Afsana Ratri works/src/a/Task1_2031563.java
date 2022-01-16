package a;

import java.util.Scanner;

public class Task1_2031563 {
	
	public static void main(String[] args) {
		System.out.println(" n: ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		double s=0;
		for(int i=1;i<=n;i++)
		{
			s=s+(i/i+1);
			
		}
		
		
		System.out.println("sum : "+s);
		
		
	}

}
