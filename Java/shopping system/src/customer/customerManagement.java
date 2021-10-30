package customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import goods.Goods;

public class customerManagement {

	ArrayList<Customer> customerList = new ArrayList<Customer>();
	ArrayList<Goods> goodsList = new ArrayList<Goods>();
	ArrayList<Goods> goodsPurchaseList = new ArrayList<Goods>();
	Scanner scan = new Scanner(System.in);
	
	double price;

	public customerManagement() throws IOException {

		int option = 0;

		System.out.println("1.Register");
		System.out.println("2.Login");

		option = scan.nextInt();

		if (option == 1) {

			addCustomer();

		} else if (option == 2) {
			login();
		}

	}

	public void login() throws IOException {

		String id;
		System.out.println("Enter Customer Email: ");
		id = scan.nextLine();
		id = scan.nextLine();

		fetchDataFromFile("AllInfo.txt");

		boolean flag = true;
		int get_object_index = 0;

		for (int i = 0; i < customerList.size(); i++) {
			if (id.equals(customerList.get(i).getEmail())) {
				get_object_index = i;
				flag = true;
				break;

			}
		}

		int option;
		if (flag) {

			System.out.println("Enter password: ");
			String pass = scan.next();
			if (customerList.get(get_object_index).getCustomer_pass().equals(pass)) {
				System.out.println("Log in successfully");
				menu();

			} else {
				System.out.println("Password not matched");
			}

		}
	}

	void menu() throws IOException
	{
		System.out.println("1.Add Goods");
		System.out.println("2.Delete Goods");
		System.out.println("3.Pay BILL");
		System.out.println("4.Log out");

		int ch = scan.nextInt();
		if (ch == 1) {
			addGoods();
			menu();

		} else if (ch == 2) {
			deleteGoods();
		} else if (ch == 3) {
			paybill();
		} else if (ch == 4) {
			LogOut();
		}

		
		
	}
	private void LogOut() {
		// TODO Auto-generated method stub

	}

	private void paybill() {
		
		System.out.println("Your Total Bill is "  + price);
		System.out.println("paid: ");
		double paid=scan.nextDouble();
		
		if(paid<price)
		{
			System.out.println("Insufficient Fund");
			paybill();
		}
		else {
			
			System.out.println("Successfully paid : "+price);
			System.out.println("Returned amont    :"+(paid-price));
		}
	
		

	}

	private void deleteGoods() throws NumberFormatException, IOException {
		
		

		initGoodsInfo();

		while (true) {

			System.out.println("Enter Good no to delete:");
			int target = scan.nextInt();
			target--;
			goodsPurchaseList.remove(target);
			
			System.out.println("Your List: ");
			viewGoodsList();
			System.out.println("Continue?\n1.yes\n2.No");
			int c = scan.nextInt();
			if (c == 1) {
				continue;
			} else if (c == 2) {
				break;

			}
		}

	}

	private void addGoods() throws IOException {

		initGoodsInfo();

		while (true) {

			System.out.println("Enter Good no :");
			int target = scan.nextInt();
			target--;

			System.out.println("Enter Quantity :");
			int quantity = scan.nextInt();
			
			System.out.println(goodsList.toString());

			Goods newItem = new Goods(goodsList.get(target).getGoods_id(), goodsList.get(target).getGood_name(),
					quantity, goodsList.get(target).getPrice_per_unit());

			goodsPurchaseList.add(newItem);
			System.out.println("quantiy: ---"+goodsPurchaseList.get(0).getQuantity());

			System.out.println("Your List: ");
			
			viewGoodsList();
			System.out.println("Continue?\n1.yes\n2.No");
			int c = scan.nextInt();
			if (c == 1) {
				continue;
			} else if (c == 2) {
				break;

			}
		}

	}

	void viewGoodsList() {
		for (int i = 0; i < goodsPurchaseList.size(); i++) {
			System.out.println("Goods no:" + (i + 1));
			System.out.println("Name -----------------------:" + goodsPurchaseList.get(i).getGood_name());
			System.out.println("Goods id--------------------:" + goodsPurchaseList.get(i).getGoods_id());

			System.out.println("Price per unit--------------:" + goodsPurchaseList.get(i).getPrice_per_unit());

			System.out.println("Quantity purhased-----------:" + goodsPurchaseList.get(i).getQuantity());

			System.out.println("----------------------------------------------------------------------");
				price = price + goodsPurchaseList.get(i).getPrice_per_unit() * goodsPurchaseList.get(i).getQuantity();
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------------");
		System.out.println("price: ---------------------:" + price + "tk");
		

	}

	void initGoodsInfo() throws NumberFormatException, IOException {

		File file = new File("AllGoodsInfo.txt");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String data;
		while ((data = reader.readLine()) != null) {

			// System.out.println(data);
			String data_array[] = data.split(",");

			Goods good = new Goods(data_array[0], data_array[1], Double.parseDouble(data_array[2]),
					Double.parseDouble(data_array[3]));

			goodsList.add(good);

		}

		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println("Goods no:" + (i + 1));
			System.out.println("Name -----------------------:" + goodsList.get(i).getGood_name());
			System.out.println("Goods id--------------------:" + goodsList.get(i).getGoods_id());

			System.out.println("Price per unit--------------:" + goodsList.get(i).getPrice_per_unit());

			System.out.println("Quantity avaiable-----------:" + goodsList.get(i).getQuantity());
			System.out.println();
		}

	}

	public void listAllCustomersInformation() throws IOException {
		fetchDataFromFile("AllInfo.txt");

		for (int i = 0; i < customerList.size(); i++) {
			System.out.println("Customer no: " + (i + 1));
			System.out.println("Name          : " + customerList.get(i).getName());

			System.out.println("Email         : " + customerList.get(i).getEmail());

			System.out.println("Phone Number  : " + customerList.get(i).getPhone_number());
			System.out.println();
		}

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
		System.out.println("Customer Added Successfully");

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
			System.out.println("1.Change Name");
			System.out.println("2.Change password");
			int option = scan.nextInt();

			String target;
			if (option == 1) {

				System.out.println(customerList);
				System.out.println("Enter name to change: ");
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

			System.out.println("Customer not exists");
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

		System.out.println("Data Modified Successfully");

	}

	public void fetchDataFromFile(String filename) throws IOException {
		File file = new File(filename);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String data;
		while ((data = reader.readLine()) != null) {

			// System.out.println(data);
			String data_array[] = data.split(",");

			Customer customer = new Customer(data_array[0], data_array[1], data_array[2], data_array[3]);

			customerList.add(customer);

		}

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

			System.out.println("Customer Deleted Successfully");

		}

		else {

			System.out.println("Customer not exists");
		}

	}
}
