package assignment3;

import java.util.*;
import java.util.Random;
import java.util.stream.IntStream;

public class main {
	public static void main(String[] args) {

		/**
		 * 
		 * Calling the Builder method
		 */
		Assignment03_1912488_PassportInfo.Builder();
		Scanner scan = new Scanner(System.in);

		/**
		 *
		 * Creating a list and assigning the objects in the list
		 *
		 */
		ArrayList<Assignment03_1912488_PassportInfo> list = new ArrayList<Assignment03_1912488_PassportInfo>();
		for (int i = 0; i < 15; i++) {
			list.add(Assignment03_1912488_PassportInfo.Builder());

		}

		/**
		 *
		 * In the do-while loop calling the menu for user input
		 *
		 */

		int option;

		do {

			System.out.println("1.View all Generated Values");
			System.out.println("2.Search passport");
			System.out.println("3.EXIT");

			option = scan.nextInt();

			switch (option) {
			case 1: {

				System.out.println(list);

				break;
			}

			case 2: {

				System.out.println("Enter passport id : ");

				String passports = scan.nextLine();
				String passport = scan.next();

				for (int i = 0; i < 15; i++) {
					if (passport.equals(list.indexOf(passport))) {
						System.out.println("Match Found");
						System.out.println(list.indexOf(passport));

					} else {

						System.out.println("Match not found");
						break;
					}

				}

			}

				break;

			}

		}

		while (option != 3);

	}
}