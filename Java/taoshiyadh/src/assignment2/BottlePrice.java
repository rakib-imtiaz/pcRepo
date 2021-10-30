package assignment2;

import java.io.*;
import java.util.Scanner;
//section_1

public class BottlePrice {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		int bottlearr[] = new int[10];

		File datafile = new File("bottle.txt");
		genrateFile();

		Scanner fileScanner = new Scanner(datafile);
		int i = 0;
		/*
		 * here we are scanning the file and filliing the array with values fetched from
		 * the file
		 * 
		 */

		System.out.println("Enter the price of coke(per bottle: )");
		double price = input.nextDouble();

		while (fileScanner.hasNext()) {
			try {
				int getBottleNum = fileScanner.nextInt();
				price(getBottleNum, price);
			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

	static void price(int no_bottle, double price) throws Taoshiyadh_InvalidBottleException {
		if (no_bottle < 0 || no_bottle > 100) {
			throw new Taoshiyadh_InvalidBottleException(no_bottle);
		} else {

			double sum = no_bottle * price;
			System.out.print("  No of Bottle   : " + no_bottle);
			System.out.println(" Bottle price : " + sum);
		}

	}

	static void genrateFile() throws IOException {

		File f = new File("bottle.txt");

		BufferedWriter writer = new BufferedWriter(new FileWriter(f));
		writer.append("10 ");
		writer.append("20 ");
		writer.append("30 ");
		writer.append("3000 ");
		writer.append("50 ");
		writer.close();

	}

}
