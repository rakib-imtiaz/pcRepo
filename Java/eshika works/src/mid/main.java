package mid;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		ITdepartment it[]= new ITdepartment[5];
		
		HRdepartment hr[]= new HRdepartment[5];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<it.length;i++)
		{
			System.out.println("Enter Employee name: ");
			it[i].setEmpName(scan.nextLine());
			System.out.println("Enter location : ");
			it[i].setLoaction(scan.nextLine());
			System.out.println("Enter Total exp: ");
			it[i].setTotalExperience(scan.nextInt());
			
			System.out.println("Enter agep: ");
			it[i].setAge(scan.nextInt());
			
			System.out.println("Enter empid: ");
			it[i].setEmpid(scan.nextInt());
			
			System.out.println("Enter salary: ");
			it[i].setSalary(scan.nextInt());
			
			
			
		}
		for(int i=0;i<hr.length;i++)
		{
			System.out.println("Enter adreess: ");
			hr[i].setAddress(scan.nextLine());
			
				System.out.println("Enter degination: ");
				hr[i].setDesignation(scan.nextLine());
			
			
		}
		
		
		for(int i=0;i<hr.length;i++)
		{
			System.out.println(hr[i].toString());
		}
		
		for(int i=0;i<it.length;i++)
		{
			System.out.println(it[i].toString());
		}
		
		ITdepartment itdept = new ITdepartment();
		HRdepartment hrdept = new HRdepartment();
		
		System.out.println("Averagea age : ");
		System.out.println(itdept.averageAge(it));
		
		System.out.println("Highest salsayrn: ");
		System.out.println(itdept.highestSalary(it));
		
		
		System.out.println("Min salary : ");
		hrdept.minSalary(hr,it);
		
		
		
		
		
	}

}
