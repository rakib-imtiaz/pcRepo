package lab14_task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = scan.nextLine();

		System.out.println("Enter phone: ");
		String phone = scan.nextLine();

		System.out.println("Enter Education: ");
		String edu = scan.nextLine();

		System.out.println("Enter skills: ");
		String skill = scan.nextLine();

		System.out.println("Enter languages: ");
		String language = scan.nextLine();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Name       : " + name);
		System.out.println("Phone      : " + phone);
		System.out.println();
		System.out.println();
		System.out.println("Education  : " + phone);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("skills     :" + skill);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Languages  : " + language);

	}
}
