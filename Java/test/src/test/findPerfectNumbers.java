package test;

import java.util.Scanner;

public class findPerfectNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = input.nextInt();

		for (int i = 2; i < n; i++) {
			
			int flag=find_perfect_number(i);
			if (flag==1) {
				System.out.print(i+" ");
			}

		}

	}

	public static int find_perfect_number(int n) {
		int var = 0,i=0;

		for ( i = 1; i < n; i++) {
			if (n % i == 0)
				var = var + i;
		}

		if (var == n)
			return 1;
		else
			return 0;

	}

}