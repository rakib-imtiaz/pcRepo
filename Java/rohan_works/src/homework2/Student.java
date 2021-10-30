package homework2;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Student {

	private String name;
	private String NID;
	private String studentID;
	private String address;
	private String dateOfBirth;
	private String dateOfAdmission;
	private String departName;
	private double cgpa;
	private Course courseList[];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNID() {
		return NID;
	}

	public void setNID(int nID) {

		Helper help = new Helper();
		this.NID = help.generateNidNumber();
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		Date date = new Date(dateOfBirth);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

		this.dateOfBirth = sdf.format(date);

	}

	public String getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public Course[] getCourseList() {
		return courseList;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", NID=" + NID + ", studentID=" + studentID + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", dateOfAdmission=" + dateOfAdmission + ", departName=" + departName
				+ ", cgpa=" + cgpa + ", courseList=" + Arrays.toString(courseList) + "]";
	}

	public Student(String name, String nID, String studentID, String address, String dateOfBirth,
			String dateOfAdmission, String departName, double cgpa, Course[] courseList) {
		super();
		this.name = name;
		NID = nID;
		this.studentID = studentID;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.dateOfAdmission = dateOfAdmission;
		this.departName = departName;
		this.cgpa = cgpa;
		this.courseList = courseList;

	}

	public void setCourseList(Course[] courseList) {
		this.courseList = courseList;
	}

}
