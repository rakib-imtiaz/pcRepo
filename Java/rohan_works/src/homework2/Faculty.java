package homework2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Faculty {
	private String name;
	private String NID;
	private String initial;
	private String address;
	private String dateOfBirth;
	private String departName;
	private String dateOfAdmission;
	private double baseSalary;
	private double cgpa;
	private Course courseList[];

	public Faculty(String name, String nID, String initial, String address, String dateOfBirth, String departName,
			String dateOfAdmission, double baseSalary, double cgpa, Course[] courseList) {
		super();
		this.name = name;
		NID = nID;
		this.initial = initial;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.departName = departName;
		this.dateOfAdmission = dateOfAdmission;
		this.baseSalary = baseSalary;
		this.cgpa = cgpa;
		this.courseList = courseList;
	}

	public Course[] getCourseList() {
		return courseList;
	}

	public void setCourseList(Course[] courseList) {
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNID() {
		return NID;
	}

	public void setNID(String nID) {
		NID = nID;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		Helper help = new Helper();

		this.initial = help.generateFacultyInnitial(name);
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

		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(String dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public double getBaseSalary() {

		int courses = courseList.length;

		return baseSalary + 400 * courses;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + name + ", NID=" + NID + ", initial=" + initial + ", address=" + address
				+ ", dateOfBirth=" + dateOfBirth + ", departName=" + departName + ", dateOfAdmission=" + dateOfAdmission
				+ ", baseSalary=" + baseSalary + ", cgpa=" + cgpa + ", courseList=" + Arrays.toString(courseList)
				+ ", getCourseList()=" + Arrays.toString(getCourseList()) + ", getName()=" + getName() + ", getNID()="
				+ getNID() + ", getInitial()=" + getInitial() + ", getAddress()=" + getAddress() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getDepartName()=" + getDepartName() + ", getDateOfAdmission()="
				+ getDateOfAdmission() + ", getBaseSalary()=" + getBaseSalary() + ", getCgpa()=" + getCgpa()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
