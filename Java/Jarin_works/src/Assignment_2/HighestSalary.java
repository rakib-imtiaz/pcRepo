package Assignment_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class HighestSalary {

	void hSalary(ArrayList<Employee> e) throws IOException
	{
		Collections.sort(e);
		
		int len=e.size()-1;
		
		File file = new File("highest.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.append(e.get(len).getName() + "," +e.get(len).getJob_id() + "," + e.get(len).getSalary() + "," + e.get(len).getPhone_number() + "," + e.get(len).getAddress() + "," + e.get(len).getDesignation());
		writer.append("\n");
		writer.close();
		
		System.out.println("Highest Salary information stored successfully");
	}

}
