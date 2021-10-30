
import java.io.IOException;
import java.util.Scanner;


public class HomePage {
	
	public HomePage() throws IOException {
		
		System.out.println("------------------______------------------_____________-----------__________-");
		
		System.out.println("1.ADMIN Portal");

		System.out.println("2.CUSTOMER Portal");
		Scanner scan = new Scanner(System.in);
		
		int option=scan.nextInt();
		if(option==1)
		{
		Admin a = new Admin();
		}
		else if(option==2)
		{
			CustomerEditor p = new CustomerEditor();
		
		}


	}
	

}
