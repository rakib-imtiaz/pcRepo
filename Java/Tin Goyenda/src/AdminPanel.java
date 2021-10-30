import java.util.Scanner;
class AdminPanel {
    Scanner scan = new Scanner(System.in);
    public AdminPanel() {
        Scanner scan = new Scanner(System.in);
		System.out.println("\n\n\nWelcome Admin");
		System.out.println("1.Add a new Case");
		System.out.println("2.Delete a case");
		System.out.println("3.Search a case");
		System.out.println("4.logout");
                int option = scan.nextInt();

		switch (option) {
		case 1: {

		
			Case mainobj = new Case();
			mainobj.addcase(mainobj);
			System.out.println("Case added successfully!!");
			Case.casecount++;
			//1
			System.out.println(Case.listobj);
			
			break;

		}

		case 2: {

			System.out.println("\n\n\nAvailable cases are: ");
			for (int i = 0; i < Case.casecount; i++) {
				System.out.println("Case No : " + i +Case.listobj.get(i).getTitle());

			}
			System.out.println("Enter Case you want to delete : ");
			int target = scan.nextInt();
			Case.listobj.remove(target);
			System.out.println("Deleted!!\n\n\n");
			Case.casecount--;

		}

			break;
		case 3: {
			
			System.out.println("\n\nEnter the title of the case to search : ");
			String target=scan.next();
			for(int i=0;i<Case.casecount;i++)
			{
				
			if(target.equals(Case.listobj.get(0).getTitle()))
			{
				System.out.println("Element found!");
				 System.out.println(Case.listobj.get(0).getTitle());
				 System.out.println(Case.listobj.get(1).getBriefDescription());
				 System.out.println(Case.listobj.get(1).getTitle());
				
				
			}
			
			}
	


		}

			break;
		case 4: {
			
			WelcomePage go = new WelcomePage();

		}

			break;

		default: {

			System.out.println("Invalid Input");
			System.exit(0);
		}
			break;
		}

	}



}

    

