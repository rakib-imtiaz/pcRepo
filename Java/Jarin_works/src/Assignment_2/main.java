package Assignment_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter How many Employee Information?");
		int n=scan.nextInt();
		Employee emp= new Employee();
		emp.information(n);
						
		LowestSalary s = new LowestSalary();
		ArrayList<Employee> empobj = new ArrayList<Employee>();
		s.LSalary(s.Data());
		
		Display display = new Display();
		System.out.println("Lowest Salary: \n\n");
		display.lowest();
		System.out.println("Highest Salary: \n\n");
		display.highest();
		System.out.println();
		System.out.println();
		display.average();
		System.out.println("Employee: \n\n");
		display.allData();

		
		 


	}

}
