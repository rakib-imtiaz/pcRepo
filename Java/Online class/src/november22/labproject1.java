package november22;

import java.util.Scanner;

public class labproject1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[][] = { { 99, 42, 74, 83 }, { 57, 81, 69, 67 }, { 88, 61, 79, 84 }, { 93, 75, 78, 87 } };

		double sum = 0.0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {

				sum = sum + num[i][j];
			}

		}

		double k = sum / 4.00;

		System.out.println("Class Total:" + sum + "\nClass Average: " + k);

	}

}