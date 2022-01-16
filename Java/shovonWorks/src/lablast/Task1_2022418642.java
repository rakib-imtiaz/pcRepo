package lablast;

import java.util.Scanner;

public class Task1_2022418642 {

	public static void main(String[] args) {

		int a = 5;
		int n = 4;

		System.out.println("Series sum :  " + getSum(n, a));

	}

	static double getSum(int n, int a) {
		double series = 1;
		int iteration = 1;
		int i = 0;
		while (i < n) {

			if (i % 2 != 0) {
				series = series + (i / Math.pow(a, iteration));
				iteration++;
			}
			i++;

		}
		return series;

	}

}
