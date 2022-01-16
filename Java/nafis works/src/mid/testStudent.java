package mid;

import java.util.Scanner;

public class testStudent {
	public static void main(String[] args) {

		Student var[] = new Student[7];
		
		takeInput(var);
		
		System.out.println("Details of Hightest mark obtainer");
		int index=getHighMarkObtainerIndex(var);
		
		
		System.out.println("name : "+var[index].getName());
		System.out.println("id : "+var[index].getId());
		

	}
	
	public static void takeInput(Student var[])
	{

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < var.length; i++) {
			System.out.println("Name of student : ");
			String stdName = input.next();

			System.out.println("student Id : ");
			int stdId = input.nextInt();

			System.out.println("student Mark : ");
			int mrk = input.nextInt();

			System.out.println("Student Status : ");
			String sts = input.next();

			var[i] = new Student(stdName, stdId, mrk, sts);

		}
		

		
		
	}

	public static int getHighMarkObtainerIndex(Student std[]) {

		int highest = 0;
		int index = 0;

		for (int i = 0; i < std.length; i++) {
			if (std[i].getMarks() > highest) {
				highest = std[i].getMarks();
				index = i;

			}

		}
		return index;

	}

}