package little_works;

import java.util.Scanner;

public class CheckArmstrongNumber {
	public static void main(String[] args) {

		int number, remainder, sumation = 0, temp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scan.nextInt();
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			number = number / 10;
			sumation = sumation + (remainder * remainder * remainder);
		}
		if (temp == sumation) {
			System.out.println(temp + " is an Armstrong Number.");
		} else {
			System.out.println(temp + " is not an Armstrong Number.");
		}

	}

}
