package Assignment_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee implements Comparable<Employee> {

	private String name;
	private int Job_id;
	private int salary;
	private int phone_number;
	private String designation;
	private String address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int job_id, int salary, int phone_number, String designation, String address) {
		super();
		this.name = name;
		Job_id = job_id;
		this.salary = salary;
		this.phone_number = phone_number;
		this.designation = designation;
		this.address = address;
	}

	// ArrayList<Employee> empList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJob_id() {
		return Job_id;
	}

	public void setJob_id(int job_id) {
		Job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Scanner scan = new Scanner(System.in);

	void information(int numberOfEmployee) throws IOException {

		File file = new File("EmployeeInformation.txt");

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));

		for (int i = 0; i < numberOfEmployee; i++) {
			System.out.println("Enter employee details No :" + (i + 1));
			System.out.println();
			System.out.println();
			System.out.println("Name: ");
			name = scan.nextLine();
			System.out.println("Id: ");
			Job_id = scan.nextInt();
			System.out.println("Salary: ");
			try {
				salary = scan.nextInt();

				if (salary < 0) {
					throw new InvalidSalaryException(salary);

				}

			} catch (Exception e) {
				System.out.println(e);

			}
			System.out.println("Phone: ");
			phone_number = scan.nextInt();

			System.out.println("Address: ");
			address = scan.nextLine();
			address = scan.nextLine();
			System.out.println("Designation: ");
			designation = scan.nextLine();
			System.out.println();
			System.out.println();

			writer.append(name + "," + Job_id + "," + salary + "," + phone_number + "," + address + "," + designation);
			writer.append("\n");

		}
		writer.close();

		System.out.println("All Employee Information stored successfully");

	}

	
	@Override
	public int compareTo(Employee e) {
		if (this.getSalary() > e.getSalary()) {
			return 1;
		} else if (this.getSalary() < e.getSalary()) {
			return -1;

		}
		return 0;
	}

}
