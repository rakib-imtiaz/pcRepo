package homework2;

import java.util.Arrays;

public class Course {
	private String courseName;
	private String courseCode;
	private Student students[];
	private Faculty faculties[];

	public String getCourseName() {
		return courseName;
	}
	

	public String getCourseCode() {
		return courseCode;
	}

	public Student[] getStudentList() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public Faculty[] getFaculties() {
		return faculties;
	}

	public void setFaculties(Faculty[] faculties) {
		this.faculties = faculties;
	}

	public Course(String courseName, String courseCode, Student[] students, Faculty[] faculties) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.students = students;
		this.faculties = faculties;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCode=" + courseCode + ", students="
				+ Arrays.toString(students) + ", faculties=" + Arrays.toString(faculties) + "]";
	}

}
