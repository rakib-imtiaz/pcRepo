package viva_Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) throws InvalidDateException, IOException {

		Scanner scan = new Scanner(System.in);
		int date;
		int month;
		int year;

		System.out.println("1. Scan from file ");
		System.out.println("2. Scan from Console ");
		int option = scan.nextInt();
		
		switch (option) {
		case 1: {

			int datearr[] = new int[3];
			//datearr[]= {21,12,1997};

			File fl = new File("info.txt");

			Scanner inp = new Scanner(fl);
			int i = 0;
			while (inp.hasNextInt()) {

				datearr[i] = inp.nextInt();
				i++;

			}
			
			date = datearr[0];
			month = datearr[1];
			year = datearr[2];
			calcAge(year, month, date);

			break;
		}
		case 2: {

			System.out.println("Enter your Birthdate: ");
			date = scan.nextInt();
			System.out.println("Enter your Birthmonth: ");
			month = scan.nextInt();

			System.out.println("Enter your Birthyear: ");
			year = scan.nextInt();
			
			
			try {
				
				
				calcAge(year, month, date);
				
			} catch (InvalidDateException e) {
				System.out.println("Invalid! input : " + e);
			}

		}
			break;

		}

	}

	static void calcAge(int year, int month, int date) throws InvalidDateException {

		Date currentDate = new Date(System.currentTimeMillis());
		
		

		if (date >= 31 && date < 0 || month > 12 && month <= 0 || year > currentDate.getYear() && year <= 1900) {
			try {
				throw new InvalidDateException("Invalid Date Exception");

			} catch (Exception e) {
				System.out.println(e);
			}

		} else {

			LocalDate birthday;
			
			LocalDate currenttime = LocalDate.now();

			birthday = LocalDate.of(year, month, date);

			int age = currenttime.getYear() - birthday.getYear();
			
			System.out.println("You are : " + age + " years old");

		}
	}
}
