package homework2;

import java.util.Arrays;

public class PermanentFaculty extends Faculty {

	public PermanentFaculty(String name, String nID, String initial, String address, String dateOfBirth,
			String departName, String dateOfAdmission, double baseSalary, double cgpa, Course[] courseList) {
		super(name, nID, initial, address, dateOfBirth, departName, dateOfAdmission, baseSalary, cgpa, courseList);
		// TODO Auto-generated constructor stub

		courseList[4] = new Course();
		int len = getCourseList().length;

		this.setBaseSalary(3500 + len * 450);
	}

	@Override
	public String toString() {
		return "PermanentFaculty [getCourseList()=" + Arrays.toString(getCourseList()) + ", getName()=" + getName()
				+ ", getNID()=" + getNID() + ", getInitial()=" + getInitial() + ", getAddress()=" + getAddress()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getDepartName()=" + getDepartName()
				+ ", getDateOfAdmission()=" + getDateOfAdmission() + ", getBaseSalary()=" + getBaseSalary()
				+ ", getCgpa()=" + getCgpa() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
