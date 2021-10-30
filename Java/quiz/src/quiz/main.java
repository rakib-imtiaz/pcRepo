package quiz;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: \n");
		int n=scan.nextInt();
		double sum=1;
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
			{
				sum=sum+Math.pow(2, i);
			}
			else
			{
				sum=sum-Math.pow(2, i);
			}
			
			
		}
		
		System.out.println("Sum is :  "+sum);
		
	}

}
