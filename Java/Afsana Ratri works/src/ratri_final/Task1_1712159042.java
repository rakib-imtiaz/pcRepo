package ratri_final;

import java.util.Scanner;

public class Task1_1712159042 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("enter n : ");
		int n=in.nextInt();
		
		System.out.println("enter a : ");
		int a=in.nextInt();
		double sum=1;
		int count=1;
		
		for(int i=0;i<n;i++)
		{
		
			if(i%2!=0)
			sum=sum+(i/Math.pow(a, count));
			count++;
			
		}
		
		
		System.out.println("Sum :  "+sum);

	}

}
