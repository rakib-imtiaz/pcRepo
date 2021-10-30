package goods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import customer.Customer;
import customer.customerManagement;
import Def.Driver;
import Def.portal;
import admin.adminPortal;

public class GoodsManagement {

	Scanner scan = new Scanner(System.in);
	ArrayList<Goods> goodsList = new ArrayList<Goods>();

	public GoodsManagement() throws IOException {
		goodsManagement();

	}
	

	void goodsManagement() throws IOException {
		System.out.println("1.List all Goods information");

		System.out.println("2.Add Good information");

		System.out.println("3.Delete Goods information");

		System.out.println("4.back");

		int option;
		do {
			option = scan.nextInt();

			if (option == 1) {
				listAllGoodsInformation();
			} else if (option == 2) {

				addGoods();

			} else if (option == 3) {
				deleteGoodInfo();

			} else if (option == 4) {
				adminPortal p = new adminPortal();

			} else {
				System.out.println("Incorrect Option\ntry again\n");
			}
		} while (option >= 5);

	}

	public void addGoods() throws IOException {

		String goods_id;
		String Good_name;
		double Quantity;
		double price_per_unit;

		while(true)
		{
			String dump_character = scan.nextLine();

		System.out.println("Good Name : ");
		Good_name = scan.nextLine();

		System.out.println("Good id : ");
		goods_id = scan.nextLine();

		System.out.println("Good Quantity : ");
		Quantity = scan.nextDouble();

		System.out.println("Goods price per Unit : ");
		price_per_unit = scan.nextDouble();

		Goods goods = new Goods(goods_id, Good_name, Quantity, price_per_unit);
		File file2 = new File("AllGoodsInfo.txt");

		BufferedWriter writer = new BufferedWriter(new FileWriter(file2,true));
		writer.append(goods_id + "," + Good_name + "," + Quantity + "," + price_per_unit+"\n");
		writer.close();
		
		System.out.println("Goods added successfully");
		System.out.println("Continue?\n1.yes.\n2.No");
		int c=scan.nextInt();
		if(c==1)
		{
			continue;
		}
		else {
			goodsManagement();
		}
		}
		
		
	}


	public void fetchDataFromFile(String filename) throws IOException {
		File file = new File(filename);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String data;
		while ((data = reader.readLine()) != null) {

			// System.out.println(data);
			String data_array[] = data.split(",");

			Goods customer = new Goods(data_array[0], data_array[1], Double.parseDouble(data_array[2]), Double.parseDouble(data_array[3]));

			goodsList.add(customer);

		}

	}

	public void deleteGoodInfo() throws IOException {

		String id;
		System.out.println("Enter Goods id: ");
		id = scan.nextLine();
		id = scan.nextLine();

		fetchDataFromFile("AllGoodsInfo.txt");

		boolean flag = false;
		int get_object_index = 0;

		for (int i = 0; i < goodsList.size(); i++) {
			if (id.equals(goodsList.get(i).getGoods_id())) {
				get_object_index = i;
				flag = true;
				break;

			}
		}

		if (flag) {

			goodsList.remove(get_object_index);

			File file2 = new File("AllGoodsInfo.txt");

			BufferedWriter writer2 = new BufferedWriter(new FileWriter(file2));// true for appending the file
			int i = 0;
			while (i < goodsList.size()) {

				writer2.append(goodsList.get(i).getGoods_id() + "," + goodsList.get(i).getGood_name() + ","
						+ goodsList.get(i).getQuantity() + "," + goodsList.get(i).getPrice_per_unit() + "\n");
				writer2.close();
				i++;
			}

			System.out.println("Goods Deleted Successfully");

		}

		else {

			System.out.println("Customer not exists");
		}

	}

	public void listAllGoodsInformation() throws IOException {
		fetchDataFromFile("AllGoodsInfo.txt");

		for (int i = 0; i < goodsList.size(); i++) {
			System.out.println("Goods no:" + (i + 1));
			System.out.println("Name -----------------------:" + goodsList.get(i).getGood_name());
			System.out.println("Goods id--------------------:" + goodsList.get(i).getGoods_id());

			System.out.println("Price per unit--------------:" + goodsList.get(i).getPrice_per_unit());

			System.out.println("Quantity avaiable-----------:" + goodsList.get(i).getQuantity());
			System.out.println();
		}

	}
}
