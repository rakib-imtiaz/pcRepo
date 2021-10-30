package Assignment_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Display implements Salary {

	@Override
	public void lowest() {
		Employee empobj = null;
		try {
			File file = new File("lowest.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				String[] array = data.split(",");
				// System.out.println("length: "+array.length);

				empobj = new Employee(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]),
						Integer.parseInt(array[3]), array[4], array[5]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		System.out.println("Name   Id   Salary    Phone   Address    Designation\n\n");
		System.out.println(empobj.getName() + "   " + empobj.getJob_id() + "   " + empobj.getSalary() + "   "
				+ empobj.getPhone_number() + "   " + empobj.getAddress() + "   " + empobj.getDesignation());
	}

	@Override
	public void highest() {
		Employee empobj = null;
		try {
			File file = new File("highest.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				String[] array = data.split(",");

				empobj = new Employee(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]),
						Integer.parseInt(array[3]), array[4], array[5]);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		System.out.println("Name   Id   Salary    Phone   Address    Designation\n\n");
		System.out.println(empobj.getName() + "\t" + empobj.getJob_id() + "\t" + empobj.getSalary() + "\t"
				+ empobj.getPhone_number() + "\t" + empobj.getAddress() + "\t" + empobj.getDesignation());

	}

	@Override
	public void allData() {
		Employee empobj = null;
		System.out.println("Name   Id   Salary    Phone   Address    Designation\n\n");

		try {
			File file = new File("EmployeeInformation.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				String[] array = data.split(",");

				empobj = new Employee(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]),
						Integer.parseInt(array[3]), array[4], array[5]);
				System.out.println(empobj.getName() + "   " + empobj.getJob_id() + "   " + empobj.getSalary() + "   "
						+ empobj.getPhone_number() + "   " + empobj.getAddress() + "   " + empobj.getDesignation());

			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

	@Override
	public void average() {

		Employee empobj = null;

		int sum = 0;
		int num = 0;

		try {
			File file = new File("EmployeeInformation.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				String[] array = data.split(",");

				empobj = new Employee(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]),
						Integer.parseInt(array[3]), array[4], array[5]);

				sum = sum + empobj.getSalary();
				num++;

			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		System.out.println("\n\nAverage: " + (sum / num));

	}
}
