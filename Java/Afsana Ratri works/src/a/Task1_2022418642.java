package a;

import java.util.Scanner;

public class Task1_2022418642 {
	public static void main(String[] args) {
		
		
		System.out.println("N: ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		
		
		System.out.println("sum : "+calc(n));
		
		
	}
	
	public static double calc(int n)
	{
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i/i+1);
			
		}
		
		return sum;
		
	}
	

}
