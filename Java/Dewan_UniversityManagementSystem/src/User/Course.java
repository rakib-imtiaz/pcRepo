package User;

import java.util.Arrays;

public class Course {
	private String courseName;
	private String courseCode;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Course(String courseName, String courseCode) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCode=" + courseCode + "]";
	}

}
