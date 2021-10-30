package new_version_1;

import java.util.Scanner;

public class main {


	main()
	{
		
	}
	
	public static void main(String[] args) {

	
		Scanner scan = new Scanner(System.in);
	
				
		System.out.println("Welcome to Shopping Management system");
		System.out.println("1.Continue as admin?\n2.Continue as Customer");

		int option=scan.nextInt();
		if(option==1)
		{
			
			admin a = new admin();
		}
		else if(option==2)  {
			customer a = new customer();
			
		}
			
			
		
		
		
		
		
		
		
	}
	

}
