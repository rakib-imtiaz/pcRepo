package homework_1;

import java.util.Scanner;

public class CaseManagementSystem {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
//		CaseManupulation obj = new CaseManupulation();
//		System.out.println(obj.addCase());

		int option;

		do {

			System.out.println("\t\t\t\tWelcome to Case Management System");
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			System.out.println("1.List of Cases\n");
			System.out.println(
					"---------------------------------------------------------------------------------------------");

			System.out.println("2.Login\n");
			System.out.println(
					"---------------------------------------------------------------------------------------------");

			System.out.println("3.Exit\n");
			System.out.println(
					"---------------------------------------------------------------------------------------------");

			option = scan.nextInt();

			switch (option) {
			case 1: {

			}

				break;
			case 2: {
				Login_authentication login = new Login_authentication();

			}

				break;
			case 3: {

			}

				break;

			default:
				break;
			}

		} while (option != 3);

	}

}