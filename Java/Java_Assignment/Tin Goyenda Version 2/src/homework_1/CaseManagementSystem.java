package homework_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CaseManagementSystem {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

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
				if(Case.casecount==0)
				{
					System.out.println("List is Currently empty\n\n\n");
					
					
					
				}
				else {

					System.out.println("--------List oF Cases---------\n");
				for(int i=1;i<Case.casecount+1;i++)
				{
					System.out.println("Case "+i+": "+Case.listobj.get(i).getTitle());
					System.out.println("\n\n");
					
					
				}
				break;
				
				}
			}

			case 2: {
				Login_authentication login = new Login_authentication();

			}

				break;
			case 3: {
				System.exit(0);

			}

				break;

			default:
			{
				System.out.println("Invalid Input");
				System.exit(0);
				
				
			}
				
				break;
			}

		} while (option != 3);

	}

}
