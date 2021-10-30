package Assignment_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class LowestSalary extends EmployeeData {

	@Override
	void LSalary(ArrayList<Employee> e) {
		Collections.sort(e);

		File file = new File("lowest.txt");
		BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.append(e.get(0).getName() + "," + e.get(0).getJob_id() + "," + e.get(0).getSalary() + ","
					+ e.get(0).getPhone_number() + "," + e.get(0).getAddress() + "," + e.get(0).getDesignation());
			writer.append("\n");
			writer.close();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Lowest Salary information stored successfully");


	}

}
