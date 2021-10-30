package LabFInal;

import java.util.Scanner;

public class Task1_1822172642 {
	
	public static void main(String[] args) {
		

		double equation=0;
		int  n;
		System.out.println("N:  ");

		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
		
		
		for(int i=1;i<=n;i++)
		{
			equation=equation+(1.0/1+Math.sqrt(i+1));
		}
		
		System.out.println("Summation: "+equation);
		
		
		
	}

}
