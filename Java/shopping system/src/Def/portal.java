package Def;

import java.io.IOException;
import java.util.Scanner;

import admin.Administrator;
import customer.customerManagement;

public class portal {
	
	public portal() throws IOException {
		
		
		System.out.println("1.ADMIN Portal");

		System.out.println("2.CUSTOMER Portal");
		Scanner scan = new Scanner(System.in);
		
		int option=scan.nextInt();
		if(option==1)
		{
		Administrator a = new Administrator();
		}
		else if(option==2)
		{
			customerManagement p = new customerManagement();
		
		}


	}
	

}
