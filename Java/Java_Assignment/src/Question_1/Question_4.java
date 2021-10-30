package Question_1;

import java.util.*;


public class Question_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Using recursive method: ");
		for (int i = 0; i < 3; i++) {

			int input = scan.nextInt();
			double sum = 0;
			double first, second, third;

			first = recursiveSeries(input - 5) + recursiveSeries(input - 4) + recursiveSeries(input - 3);
			second = recursiveSeries(input - 4) + recursiveSeries(input - 3);
			third = Math.abs((recursiveSeries(input - 2) - recursiveSeries(input - 1)));
			sum = (first / second) * third;
			
			System.out.println("N ("+input+")="+(int) Math.ceil(sum));
		}


		System.out.println("Using iterative method: ");
		for(int i=0;i<3;i++)
		{
			int input=scan.nextInt();
			System.out.println("N ("+input+")="+iterativeSeries(input));
		}
		

		

	}

	
	public static int iterativeSeries(int number) {
		
		double sum =0;
		double first, second, third;
		
		
			
			first = n(number - 5) + n(number - 4) + n(number - 3);
			second = n(number - 4) + n(number - 3);
			third = Math.abs((n(number - 2) - n(number - 1)));
			sum = (first / second) * third;
			

		return (int) Math.ceil(sum);

	}

	public static int n(int number) {
		if (number == 1) {
			return -5;
		} else if (number == 2) {
			return -3;
		}

		else if (number == 3) {
			return -1;
		}

		else if (number == 4)

		{
			return 0;
		}

		else if (number == 5) {

			return 5;
		}
		else {
		{
			return iterativeSeries(number);
		}
		}

	}

	public static int recursiveSeries(int number) {
		

		if (number == 1) {
			return -5;
		} else if (number == 2) {
			return -3;
		}

		else if (number == 3) {
			return -1;
		}

		else if (number == 4)

		{
			return 0;
		}

		else if (number == 5) {

			return 5;
		}
		else {
		{
			return n(number);
		}
		}


	}

}
