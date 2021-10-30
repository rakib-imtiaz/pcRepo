import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		int inputId=0,fetchedID=123;
		String inputPass="",fetchedPass="noman";
		
		System.out.println("Blood Donation Management System\n\n\n");
		System.out.println("1.Login as Admin");
		System.out.println("2.Login as Donar");
		System.out.println("3.Visitor");
		System.out.println("3.Exit");
		
		Scanner scan =new Scanner(System.in);
		int choice=scan.nextInt();
		
		
	
		switch (choice) {
		case 1:
		{
			while(inputId==fetchedID && inputPass==fetchedPass)

			
			
			
			System.out.println("ID: ");
			inputId=scan.nextInt();

			System.out.println("Password: ");
			inputPass=scan.next();
			
			if(inputId==fetchedID && inputPass== fetchedPass)
			{
				adminPortal portal=new adminPortal();
				
			}
			else {
				System.out.println("ID or Password is incorrect!");
				
				
			}
			
		}
			
			break;

		default:
			break;
		}
		
		
	}

}
