package shoykotIslam;

import java.util.Scanner;

public class Task1_2013928642 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("N terms: ");
		int n = input.nextInt();

		System.out.println("value of  a : ");
		int a = input.nextInt();

		double sum = 0;

		for (int i = 0; i < n; i++) {

			sum = sum + (Math.pow(i, i) / Math.pow(a, i + 1));

		}

		System.out.println("Sum :  " + sum);

	}

}
