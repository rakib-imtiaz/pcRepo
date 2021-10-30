package new_version_1;

import java.awt.Menu;
import java.util.Scanner;

public class customer {
	Scanner scan= new Scanner(System.in);
	
	public customer() {

		String customer_id="customer";

		String customer_pass="customer";
		
		System.out.println("Enter Customer id");
		String id = scan.nextLine();
		System.out.println("Enter Customer password : ");
		String pass = scan.nextLine();

		if (customer_id.equals(id) && customer_pass.equalsIgnoreCase(customer_pass)) {
			Menu();

		}
	}

	private void Menu() {
		
		
		
	}

		
		}

}
