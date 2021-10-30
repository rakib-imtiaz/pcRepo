package User;

import java.util.Scanner;

public class Question4 {
	static String studentId;
	static String stduentname;

	public static void main(String[] args) {

		int studentAge;
		Scanner input = new Scanner(System.in);
		System.out.print("Name:");
		stduentname = input.nextLine();
		System.out.print("Id:");
		studentId = input.nextLine();
		System.out.print("Age:");
		studentAge = input.nextInt();

		if (studentAge >= 20) {
			System.out.println("----------------------------------------------");

			System.out.println("\tReported ID:" + stduentname + "->" + studentId);
			System.out.println("----------------------------------------------");

		} else {
			System.out.println(" \tSorry! you are not not permitted");
		}

	}

}