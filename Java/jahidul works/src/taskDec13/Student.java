package taskDec13;

import java.util.Arrays;

public class Student {

	private String name;
	private String address;
	private int numCourses = 0;
	private String courses[] = new String[30];
	private int grades[] = new int[30];

	public Student(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void addCourseGrade(String course, int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		numCourses++;

	}

	public void printGrades() {

		for (int i = 0; i < numCourses; i++) {
			System.out.println("Course: " + (i + 1) + "  " + courses[i] + "  Grade : " + (i + 1) + ":  " + grades[i]);

		}

	}

	public double getAverageGrade() {

		double avrg = 0;
		double sum = 0;
		for (int i = 0; i < numCourses; i++) {

			sum = sum + grades[i];

		}

		avrg = sum / numCourses;
		return avrg;

	}

	@Override
	public String toString() {
		return name + " (" + address + ")";
	}

}
