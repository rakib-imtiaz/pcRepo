package new_version_1;

import java.util.ArrayList;
import java.util.Scanner;

public class admin {
	Scanner scan = new Scanner(System.in);

	ArrayList<product> productList = new ArrayList();

	public admin() {

		String admin_id = "admin";
		String admin_pass = "admin";

		System.out.println("Enter admin id");
		String id = scan.nextLine();
		System.out.println("Enter admin password : ");
		String pass = scan.nextLine();

		if (admin_id.equals(id) && admin_pass.equalsIgnoreCase(admin_pass)) {
menu();

		}
	}
	
	void menu(){
		int option = 0;
		do {
			System.out.println("1.Add products");
			System.out.println("2.Delete products");
			System.out.println("3.Go Back");
			option = scan.nextInt();


			if (option == 1) {
				addproducts();

			} else if (option == 2) {
				deleteProducts();

			} else if (option == 3) {
				main m = new main();
				m.main(null);

			}

		} while (option >= 3);

		
	}

	private void deleteProducts() {
		
		System.out.println("enter product name you want to delete: ");
		String target=scan.next();
		
		for(int i=0;i<productList.size();i++)
		{
			if(productList.get(i).getName().equals(target))
			{
				productList.remove(i);
				System.out.println("Deleted");
				break;

			}
			
			
		}
		menu();
		

	}

	private void addproducts() {

		String name;
		double price;
		double quantity;
		name = scan.nextLine();

		System.out.println("Enter prodouct name: \n");
		name = scan.nextLine();

		System.out.println("Enter prodouct price: \n");
		price = scan.nextDouble();

		System.out.println("Enter prodouct quantity: \n");
		quantity = scan.nextDouble();

		product item = new product(name, price, quantity);

		productList.add(item);
		
		System.out.println("product added successfully");
		menu();

	}

}
