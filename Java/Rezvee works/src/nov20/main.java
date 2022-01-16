package nov20;

import java.util.Scanner;

public class main {

	/*
	 * 
	 * task 1
	 * */
	public static void main(String[] args) {

		int i = 0;
		int n = 100;

		System.out.println("1 to 100 even: ");
		
		i=0;
		while (i < n) {

			if (i % 2 == 0) {

				System.out.println(i);
			}
			i++;

		}
		System.out.println("1 to 100 odd: ");
		
		i=0;
		while (i < n) {
			
			if (i % 2 != 0) {
				
				System.out.println(i);
			}
			i++;
			
		}
		
		int sum=0;
		
		i=0;
		while (i < n) {
			
			if (i % 2 == 0) {
				sum=sum+i;
			}
			i++;
			
		}
		System.out.println("even avrg: "+sum/100.0);
		 sum=0;
		
		i=0;
		while (i < n) {
			
			if (i % 2 != 0) {
				sum=sum+i;
			}
			i++;
			
		}
		System.out.println("odd avrg: "+sum/100.0);
		i=0;
		Scanner in = new Scanner(System.in);
		
		while (i < 10) {
			
			int input=in.nextInt();
			sum=sum+input;
			i++;
			
		}
		System.out.println("sum of 10 numbers"+sum);

		System.out.println("Enter 10 numbers");

		
		i=0;
		while (i < 10) {
			
			int input=in.nextInt();
			if(input%2==0)
			sum=sum+input;
			i++;
			
		}
		System.out.println("even sum  avrg of 10  numbers"+sum/10);
		
		
		i=0;
		
		System.out.println("Enter 10 numbers");
		while (i < 10) {
			
			int input=in.nextInt();
			if(input%2!=0)
				sum=sum+input;
			i++;
			
		}
		System.out.println("odd sum  avrg of 10  numbers"+sum/10);
		
		
		
		System.out.println("enter n: ");
		 n=in.nextInt();
		
		 i=0;
		
		while(i<n)
		{
			if(i%2==0)
			sum=sum+i;
			
		}
	
		System.out.println("sum"+sum);

		
		
		System.out.println("enter n: ");
		n=in.nextInt();
		
		i=0;
		double series=0;
		while(i<n)
		{
			series=series+Math.pow(i, 2);
			
		}
	
		System.out.println("sum"+series);

		
		/*
		 * 
		 * task 2
		 * */
		System.out.println("enter n: ");
		n=in.nextInt();
		
		// 1/2 * 1^3 + 8/4 * 2^3  + 27/6  * 3^3
		i=0;
		series=0;
		while(i<n)
		{
			series=series+((Math.pow(i, 3)/2*i)*Math.pow(i, 3));
			
		}
		
		System.out.println("sum"+series);
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
