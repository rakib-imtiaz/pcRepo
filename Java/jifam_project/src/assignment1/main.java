package assignment1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Software_Projects obj = new Software_Projects();
		Hardware_Projects obj2 = new Hardware_Projects();

		int number = 0;

		String projectName;
		int duration;
		String programming_language;
		int total_no_of_engineers;
		int project_manager_id;
		String project_manager_name;
		int managerExperience;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter numebr of data: ");
		number = input.nextInt();
		Software_Projects[] arr = new Software_Projects[number];

		for (int count = 0; count < arr.length; count++) {

			System.out.println("Project name: ");
			projectName = input.nextLine();
			projectName = input.nextLine();
			System.out.println("project Duration: ");
			duration = input.nextInt();
			System.out.println("programing language: : ");
			programming_language = input.next();

			System.out.println("Total no  engr: ");
			total_no_of_engineers = input.nextInt();
			System.out.println("project manage id : ex:(123456)");
			project_manager_id = input.nextInt();
			System.out.println("project manager name: ");
			project_manager_name = input.nextLine();
			project_manager_name = input.nextLine();
			System.out.println("Manger exp: ");
			managerExperience = input.nextInt();

			arr[count] = new Software_Projects(projectName, duration, programming_language, total_no_of_engineers,
					project_manager_id, project_manager_name, managerExperience);

		}
		for (int count = 0; count < arr.length; count++) {

			System.out.println(arr[count].toString());

		}

		String projectName1;
		int duration1;
		String programming_language1;
		int total_no_of_engineers1;
		int project_manager_id1;
		String project_manager_name1;
		int managerExperience1;

		System.out.println("How many data?");
		number = input.nextInt();
		Hardware_Projects[] memmbers = new Hardware_Projects[number];

		for (int count = 0; count < arr.length; count++) {
			System.out.println("Project name: ");
			projectName1 = input.nextLine();
			projectName1 = input.nextLine();
			System.out.println("project Duration: ");
			duration1 = input.nextInt();
			System.out.println("programing language: : ");
			programming_language1 = input.next();

			System.out.println("Total no  engr: ");
			total_no_of_engineers1 = input.nextInt();
			System.out.println("project manage id : ex:(123456)");
			project_manager_id1 = input.nextInt();
			System.out.println("project manager name: ");
			project_manager_name1 = input.nextLine();
			project_manager_name1 = input.nextLine();
			System.out.println("Manger exp: ");
			managerExperience1 = input.nextInt();

			memmbers[count] = new Hardware_Projects(projectName1, duration1, programming_language1, total_no_of_engineers1,
					project_manager_id1, project_manager_name1, managerExperience1);

		}
		for (int count = 0; count < memmbers.length; count++) {

			System.out.println(memmbers[count].toString());

		}

	}

}