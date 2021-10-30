package Assignment_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class EmployeeData {


	ArrayList<Employee> Data() throws IOException {
		ArrayList<Employee> emplist = new ArrayList();


		try {
			File file = new File("EmployeeInformation.txt");
			Scanner myReader = new Scanner(file);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();

				String[] array = data.split(",");

				Employee empobj = new Employee(array[0], Integer.parseInt(array[1]), Integer.parseInt(array[2]),
						Integer.parseInt(array[3]), array[4], array[5]);

				emplist.add(empobj);
							}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

		HighestSalary s = new HighestSalary();
		s.hSalary(emplist);
		return emplist;

	}
	

	 abstract void LSalary(ArrayList<Employee> e);


}
