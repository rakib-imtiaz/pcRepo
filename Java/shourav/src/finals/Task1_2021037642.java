package finals;

import java.util.Scanner;

public class Task1_2021037642 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("N ");
		int n = in.nextInt();

		System.out.println("A: ");
		int a = in.nextInt();

		CalcSummationOfSeries(n, a);

	}

	static void CalcSummationOfSeries(int n, int a) {

		double calSeries = 0;
		int i = 0;
		while (i < n) {

			calSeries = calSeries + (Math.pow(i, i) / Math.pow(a, i + 1));
			i++;

		}

		System.out.println("Sum :  " + calSeries);

	}

}
