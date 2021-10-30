import java.io.*;
import java.util.*;

public class AdminHomePage {

	Scanner scan = new Scanner(System.in);
	ArrayList<Customer> customerList = new ArrayList<Customer>();

	public AdminHomePage() throws IOException {

		int option = 0;
		do {

			System.out.println("|--------------------------|");
			System.out.println("|1.Customer Management     |");

			System.out.println("|2.Goods Management        |");

			System.out.println("|3.Logout                  |");
			System.out.println("|--------------------------|");


			System.out.println("Choose your  Option: ");
			option = scan.nextInt();

			if (option == 1) {
				customerManagement();
			} else if (option == 2) {
				ProductsEditor manage = new ProductsEditor();
			} else if (option == 3) {
				HomePage d = new HomePage();
			} else {

				System.out.println("|-----------------------------|");
				System.out.println("|Incorrect Option\ntry again  |\n");
				System.out.println("|-----------------------------|");


			}

		} while (option > 3);

	}

	void customerManagement() throws IOException {
		System.out.println("|--------------------------------- |");

		System.out.println("|1.List all Customers information  |");
		

		System.out.println("|2.Add Customers                   |");

		System.out.println("|3.Modify Customers Information    |");

		System.out.println("|4.Delete Customers information    |");
		System.out.println("|5.back                            |");
		System.out.println("|--------------------------------- |");


		int option;
		do {
		 option = scan.nextInt();

		if (option == 1) {
			listAllCustomersInformation();
		} else if (option == 2) {

			addCustomer();
		} else if (option == 3) {
			modifyCustomerInfo();

		} else if (option == 4) {
			deleteCustomerInfo();

		} 
		else if (option == 5) {
			deleteCustomerInfo();

		}else {
			System.out.println("|-----------------------------|");
			System.out.println("|Incorrect Option\ntry again  |\n");
			System.out.println("|-----------------------------|");
		}
		}while(option>=5);

	}

	public void addCustomer() throws IOException {

		String name;
		String id;
		String pass;
		String email;
		String number;

		String dump_character = scan.nextLine();

		System.out.println("Customer Name : ");
		name = scan.nextLine();

		System.out.println("E-mail : ");
		email = scan.nextLine();

		System.out.println("Phone Number : ");
		number = scan.nextLine();

		System.out.println("Password : ");
		pass = scan.nextLine();

		Customer customer = new Customer(name, pass, email, number);

		File file = new File(email + ".txt");
		File file2 = new File("AllInfo.txt");

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.append(name + "," + pass + "," + email + "," + number);
		writer.close();

		BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2, true));// true for appending the file
		writer2.append(name + "," + pass + "," + email + "," + number + "\n");
		writer2.close();
		System.out.println("|-----------------------------|");
		System.out.println("|Customer Added!!!!!          |\n");
		System.out.println("|-----------------------------|");

	}

	public void modifyCustomerInfo() throws IOException {
	
		String id;
		System.out.println("Enter Customer Email: ");
		id = scan.nextLine();
		id = scan.nextLine();

		fetchDataFromFile("AllInfo.txt");

		boolean flag = false;
		int get_object_index = 0;

		for (int i = 0; i < customerList.size(); i++) {
			if (id.equals(customerList.get(i).getEmail())) {
				get_object_index = i;
				flag = true;
				break;

			}
		}

		if (flag) {
			System.out.println("|-------------------|");
			System.out.println("|1.Update Name      |");
			System.out.println("|2.Update password  |");
			System.out.println("|-------------------|");

			
			int option = scan.nextInt();

			String target;
			if (option == 1) {

				System.out.println(customerList);
				System.out.println("Enter name to Update: ");
				target = scan.nextLine();
				target = scan.nextLine();

				Customer temp = customerList.get(get_object_index);
				temp.setName(target);

				customerList.remove(get_object_index);
				customerList.add(temp);

				updateFile(customerList.get(get_object_index).getEmail(), temp);

				/// System.out.println(customerList);
			} else if (option == 2) {
				System.out.println("Enter password to change: ");
				target = scan.nextLine();
				target = scan.nextLine();

				Customer temp = customerList.get(get_object_index);
				temp.setCustomer_pass(target);

				customerList.remove(get_object_index);
				customerList.add(temp);

				updateFile(customerList.get(get_object_index).getEmail(), temp);

			}

		} else {

			System.out.println("USer Not Found");
		}

	}

	public void updateFile(String email, Customer obj) throws IOException {

		File file = new File(email + ".txt");
		// file.delete();
		// file.createNewFile();
		File file2 = new File("AllInfo.txt");

		String name = obj.getName();

		String pass = obj.getCustomer_pass();
		email = obj.getEmail();
		String number = obj.getPhone_number();

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.append(name + "," + pass + "," + email + "," + number);
		writer.close();

		BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));// true for appending the file
		int i = 0;

		// System.out.println("From update functon: "+customerList);
		while (i < customerList.size()) {

			writer2.append(customerList.get(i).getName() + "," + customerList.get(i).getCustomer_pass() + ","
					+ customerList.get(i).getEmail() + "," + customerList.get(i).getPhone_number() + "\n");
			i++;
		}
		writer2.close();

		System.out.println("|-----------------------------|");
		System.out.println("|           Modified!!!!!     |\n");
		System.out.println("|-----------------------------|");

	}

	public void fetchDataFromFile(String filename) throws IOException {
		File file = new File(filename);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String data;
		while ((data = reader.readLine()) != null) {

			// System.out.println(data);
			String data_array[] = data.split(",");

			Customer customer = new Customer(data_array[0], data_array[1], data_array[2], data_array[3]);

			// customer.setName(data_array[0]);
//			customer.setCustomer_pass(data_array[1]);
//
//			customer.setEmail(data_array[2]);
//			customer.setPhone_number(data_array[3]);

//			customerList.add(new customer(data_array[0],data_array[1],data_array[2],data_array[3]));

			customerList.add(customer);

		}
//		System.out.println(customerList.get(0);

	}

	public void deleteCustomerInfo() throws IOException {

		String id;
		System.out.println("Enter Customer Email: ");
		id = scan.nextLine();
		id = scan.nextLine();

		fetchDataFromFile("AllInfo.txt");

		boolean flag = false;
		int get_object_index = 0;

		for (int i = 0; i < customerList.size(); i++) {
			if (id.equals(customerList.get(i).getEmail())) {
				get_object_index = i;
				flag = true;
				break;

			}
		}

		if (flag) {

			customerList.remove(get_object_index);

			File file = new File(id + ".txt");
			file.delete();
			File file2 = new File("AllInfo.txt");

			BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));// true for appending the file
			int i = 0;
			while (i < customerList.size()) {

				writer2.append(customerList.get(i).getName() + "," + customerList.get(i).getCustomer_pass() + ","
						+ customerList.get(i).getEmail() + "," + customerList.get(i).getPhone_number() + "\n");
				writer2.close();
				i++;
			}


			System.out.println("|-----------------------------|");
			System.out.println("|           Deleted!!!!!     |\n");
			System.out.println("|-----------------------------|");
			

		}

		else {


			System.out.println("|-----------------------------|");
			System.out.println("|          NOt FOUND!!!!!     |\n");
			System.out.println("|-----------------------------|");
		}

	}

	public void listAllCustomersInformation() throws IOException {
		fetchDataFromFile("AllInfo.txt");

		for (int i = 0; i < customerList.size(); i++) {
			System.out.println("|----------------------------------------------------------------|");
			System.out.println("|Customer no:" + (i + 1)+"                                       |");
			System.out.println("|Name          : " + customerList.get(i).getName()+"             |");

			System.out.println("|Email         : " + customerList.get(i).getEmail()+"            |");

			System.out.println("|Phone Number  : " + customerList.get(i).getPhone_number()+"     |");
			System.out.println("|----------------------------------------------------------------|");

			System.out.println();
		}

	}
}
