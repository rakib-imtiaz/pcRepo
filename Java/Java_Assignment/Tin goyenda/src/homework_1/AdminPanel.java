package homework_1;

import java.util.*;

public class AdminPanel {

	ArrayList<AdminPanel> listobj= new ArrayList<AdminPanel>();
	
	public AdminPanel() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome Admin");
		System.out.println("1.Add a new Case");
		System.out.println("2.Update existing case");
		System.out.println("3.Delete a case");
		System.out.println("4.logout");

		int option = scan.nextInt();

		switch (option) {
		case 1: {
			CaseManupulation case1 = new CaseManupulation();
			
			listobj.addAll((Collection<? extends AdminPanel>) case1.addCase());

		}

			break;
		case 2: {
			
			System.out.println("Under Development :) ");
			//CaseManupulation case1 = new CaseManupulation();

		}

			break;
		case 3: {

			CaseManupulation case1 = new CaseManupulation();

		}

			break;
		case 4: {
			CaseManupulation case1 = new CaseManupulation();

		}

			break;

		default:
			break;
		}

	}

	private void addCase() {

	}

}
