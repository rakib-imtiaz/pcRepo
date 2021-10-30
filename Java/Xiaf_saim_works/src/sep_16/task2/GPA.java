package sep_16.task2;

import java.util.Scanner;

public class GPA {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter GPA: ");
		double gpa = scan.nextDouble();

		System.out.println("Enter age: ");
		int age = scan.nextInt();

		try {

			if (age > 40) {

				throw new AgeOutOfRangeException(age);
			}
			if (gpa > 4 || gpa < 2.5) {
				throw new LowGpaException();
			} else {

				System.out.println("Your application is accepted and is under study");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
