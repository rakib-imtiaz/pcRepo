package LabAssignment1;

import java.util.Scanner;

public class Task2_1712159043 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string2 = input.nextLine();

		String string = string2.replaceAll(" ", "");

		char store[] = string.toCharArray();

		char temp;

		int length = string.length();
		for (int i = 0; i < length; i++) {
			for (int j = 1; j < length; j++) {
				if (store[i] >= 'a' && store[i] <= 'z' || store[i] >= 'A' && store[i] <= 'Z') {
					if (store[i] < store[j]) {
						temp = store[i];
						store[i] = store[j];
						store[j] = temp;
					}
				}
			}

		}

		System.out.println(store);

	}

}