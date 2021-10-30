package admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import User.Course;
import User.Faculty;
import User.Student;

public class main extends IOException {

	Faculty facultyobj;
	Student studentobj;
	static ArrayList<Student> studentlist = new ArrayList<Student>();
	static ArrayList<Faculty> facultylist = new ArrayList<Faculty>();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		admin adminset = new admin("admin", "1234");
		
		System.out.println("Enter admin id: ");
		String id = scan.nextLine();
		System.out.println("Enter admin pass: ");
		String pass = scan.nextLine();

		int choice = 0;
		if (adminset.getId() == id && adminset.getPassword() == pass) {
			mainmenu();
			System.out.println("Enter choice : ");
			choice = scan.nextInt();
			if (choice == 1) {

				adminmenu();

				int newchoice;
				System.out.println("Enter your choice: ");
				newchoice = scan.nextInt();
				if (newchoice == 1) {

					String name, nID, initial, address, dateOfBirth, departName, dateOfAdmission;
					double baseSalary, cgpa;
					Course courseList[] = null;
					System.out.println("Enter name: ");
					name = scan.nextLine();
					System.out.println("Enter nid: ");
					nID = scan.nextLine();
					System.out.println("Enter faculty initial: ");
					initial = scan.nextLine();
					System.out.println("Enter address");
					address = scan.nextLine();

					System.out.println("Enter dateogbrith");
					dateOfBirth = scan.nextLine();

					System.out.println("Enter deptname");
					departName = scan.nextLine();

					System.out.println("Enter deptname");
					departName = scan.nextLine();

					System.out.println("Enter base salary");
					baseSalary = scan.nextDouble();
					System.out.println("Enter courses");

					Course crs;
					String code;
					String coursename = null;
					for (int i = 0; i < 3; i++) {
						System.out.println("course code : ");
						code = scan.nextLine();
						{
							System.out.println("course name : ");
							coursename = scan.nextLine();

							crs = new Course(coursename, code);

							courseList[i] = crs;
						}

						Faculty facultyobj = new Faculty(name, nID, initial, address, dateOfBirth, departName,
								baseSalary, courseList);

						addfaculty(facultyobj);

					}
				} else if (choice == 2) {

					deletefaculty();

				} else if (choice == 3) {
					String name;
					String nID;
					String studentID;
					String address;
					String dateOfBirth;
					String dateOfAdmission = null;
					String departName;
					double cgpa = 0;
					Course courseList[] = null;

					System.out.println("Enter name: ");
					name = scan.nextLine();

					System.out.println("Enter id: ");
					studentID = scan.nextLine();
					System.out.println("Enter nid: ");
					nID = scan.nextLine();
					System.out.println("Enter address");
					address = scan.nextLine();
					System.out.println("Enter date of admission");
					dateOfAdmission = scan.nextLine();

					System.out.println("Enter dateogbrith");
					dateOfBirth = scan.nextLine();
					System.out.println("Enter cgpa");
					cgpa = scan.nextDouble();

					System.out.println("Enter deptname");
					departName = scan.nextLine();

					System.out.println("Enter courses");

					Course crs;
					String code;
					String coursename = null;
					for (int i = 0; i < 3; i++) {
						System.out.println("course code : ");
						code = scan.nextLine();
						{
							System.out.println("course name : ");
							coursename = scan.nextLine();

							crs = new Course(coursename, code);

							courseList[i] = crs;
						}

						Student st = new Student(coursename, nID, studentID, address, dateOfBirth, dateOfAdmission,
								departName, cgpa, courseList);

						addStudent(st);

					}

				} else if (choice == 4) {
					deletestudent();
//				
				}
			} else if (choice == 5) {
				changepassword();

			} else if (choice == 6) {
				try {
					savedata();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (choice == 7) {
				mainmenu();
			}

		} else if (choice == 2) {
			facultymenu();
			System.out.println("choice");
			choice = scan.nextInt();
			if (choice == 1) {
				viewcourse();
			} else if (choice == 2) {
				viewstudents();
			} else {
				mainmenu();
			}
		} else if (choice == 3) {
			studentmenu();
			System.out.println("choice");
			choice = scan.nextInt();
			if (choice == 1) {
				viewcourse();
			} else if (choice == 2) {
				mainmenu();
			} else {
				mainmenu();
			}

		} else {
		}

		mainmenu();
	}

	static void addStudent(Student students) {

		studentlist.add(students);

	}

	static void deletestudent() {
		System.out.println("Deleted ");


	}

	static void addfaculty(Faculty faculty) {

		facultylist.add(faculty);

	}

	static void deletefaculty() {
		System.out.println("Enter name: ");
		String id = scan.nextLine();

		for (int i = 0; i < facultylist.size(); i++) {

			if (facultylist.get(i).getName() == id) {
				int index = i;
				facultylist.remove(index);
			}
		}

	}

	static void changepassword() {
		String pass;
		System.out.println("Enter password : ");
		pass = scan.nextLine();

		admin a = new admin();
		a.setPassword(pass);
		System.out.println("password changed");

	}

	static void savedata() throws IOException {
		File facultyfile = new File("facultyinfo.txt");
		File studentfile = new File("studentinfo.txt");
		FileWriter writer1 = new FileWriter(facultyfile);
		FileWriter writer2 = new FileWriter(studentfile);

		for (int i = 0; i < facultylist.size(); i++) {
			writer1.append(facultylist.toString());

		}
		for (int i = 0; i < studentlist.size(); i++) {
			writer2.append(studentlist.toString());

		}

		writer1.close();
		writer2.close();

	}

	static void logout() {
		mainmenu();

	}

	static void studentmenu() {
		System.out.println("1.view course");
		System.out.println("2.Logout");

	}

	static void mainmenu() {
		System.out.println("1.admin portal");
		System.out.println("2.faculty portal");
		System.out.println("3.Student portal");

	}

	static void adminmenu() {
		System.out.println("1.Add Faculty");
		System.out.println("2.Delete Faculty");
		System.out.println("3.Add stduent");
		System.out.println("4.Delete student");
		System.out.println("5.change password");
		System.out.println("6.save the names in the file");
		System.out.println("7.Logout");

	}

	static void facultymenu() {
		System.out.println("1.view students");
		System.out.println("2.view courses");
		System.out.println("3.Logout");

	}

	static void viewcourse() {

	System.out.println("couerse is viewing");	
	}

	static void viewstudents() {

		System.out.println("students are viewing");	

	}

}
