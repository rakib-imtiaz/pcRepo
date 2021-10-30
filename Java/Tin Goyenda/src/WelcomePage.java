/*
Name   :N. M. Shadman Sakib Apurbo
id     :2022044
Course :Programming Language II
Section:10
 */


import java.util.Scanner;



public class WelcomePage {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
	//Case mainobj= new Case();
	

	


		int option;

		do {
                    // welcome to case mangement
                    

			System.out.println("\t\t\t\tWelcome to Case Management System");
			System.out.println(
					"---------------------------------------------------------------------------------------------");
                        // case list add
			System.out.println("1.List of Cases\n");
			System.out.println(
					"---------------------------------------------------------------------------------------------");
                        // case log in 
			System.out.println("2.Login\n");
			System.out.println(
					"---------------------------------------------------------------------------------------------");
                        // exit case
			System.out.println("3.Exit\n");
			System.out.println(
					"---------------------------------------------------------------------------------------------");

			option = scan.nextInt();//int type variable input

			switch (option) {
			case 1: {
				if(Case.casecount==0)
				{
					System.out.println("List is Currently empty\n\n\n");//case1
					
					
					
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
				login_authentication login = new login_authentication();// new obj called login

			}

				break;
			case 3: {
				System.exit(0);// method

			}

				break;

			default://when case 3 is not allow
			{
                                
				System.out.println("Invalid Input");
				System.exit(0);
				
				
			}
				
				break;
			}

		} while (option != 3);//do while loop use

	}

}


