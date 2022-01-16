package quiz;

import java.util.Arrays;

public class Student {
	private String name;
	private String address;
	private int numCourses = 0;
	private String courses[] = new String[30];
	private int grades[] = new int[30];

	Student(String name, String address) {
		this.name = name;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " (" + address +")";
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;

	}

	void printGrades() {

		for (int i = 0; i < numCourses; i++) {
			System.out.println("Course: " + courses[i] + " Grade: " + grades[i]);

		}

	}

	public double getAverageGrade() {
		double sum = 0;

		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];

		}

		double avg = (double) sum / numCourses;

		return avg;

	}
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student("Raihan Ahmed", "Mirpur");
		
		System.out.println(s1);
		
		s1.addCourseGrade("CSE115", 89);
		s1.addCourseGrade("CSE215", 57);
		s1.addCourseGrade("CSe225", 96);
		
		s1.printGrades();
		
		System.out.println("Average Grade :  "+s1.getAverageGrade());
		
		
		
		
	}

}
