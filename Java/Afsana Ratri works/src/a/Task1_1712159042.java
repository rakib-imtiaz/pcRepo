package a;

import java.util.Scanner;

public class Task1_1712159042 {
	public static void main(String[] args) {
		
		
		System.out.println("Enter n: ");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(i/i+1);
			
		}
		
		
		System.out.println("sum : "+sum);
		
		
	}
	

}
