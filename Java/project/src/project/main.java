package project;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Patient> patientList = new ArrayList();

		int id;
		boolean iscorona;
		int age;
		double oxy_saturation;
		int num_ofObject = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter patient id: ");
			id = scan.nextInt();

			System.out.println("is the parient has corona?\n1.yes\n 2.no ");
			int choice = scan.nextInt();
			if (choice == 1) {
				iscorona = true;

			} else {
				iscorona = false;
			}
			System.out.println("Age: ");
			age = scan.nextInt();
			System.out.println("oxygen saturation level :");
			oxy_saturation = scan.nextDouble();

			num_ofObject++;
			if (i == 10) {
				System.out.println("Seat isnt available");

			}

			Patient p = new Patient(id, iscorona, age, oxy_saturation, num_ofObject);

			patientList.add(p);
		}

		int age_sum = 0;
		for (int i = 0; i < 10; i++) {
			if (patientList.get(i).getOxy_saturation_level() < 90) {
				age_sum = age_sum + patientList.get(i).getAge();

			}

		}

		System.out.println("The sum of the ages of the people affected by the corona\n"
				+ "virus whose oxygen saturation level is lower than 90%. is : " + age_sum);

	}

}
