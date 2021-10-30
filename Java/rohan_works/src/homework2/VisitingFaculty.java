package homework2;

import java.util.Arrays;

public class VisitingFaculty extends Faculty {

	public VisitingFaculty(String name, String nID, String initial, String address, String dateOfBirth,
			String departName, String dateOfAdmission, double baseSalary, double cgpa, Course[] courseList) {
		super(name, nID, initial, address, dateOfBirth, departName, dateOfAdmission, baseSalary, cgpa, courseList);

		int len = getCourseList().length;

		this.setBaseSalary(2500 + len * 650);
		courseList[5] = new Course();

	}

	@Override
	public String toString() {
		return "VisitingFaculty [getCourseList()=" + Arrays.toString(getCourseList()) + ", getName()=" + getName()
				+ ", getNID()=" + getNID() + ", getInitial()=" + getInitial() + ", getAddress()=" + getAddress()
				+ ", getDateOfBirth()=" + getDateOfBirth() + ", getDepartName()=" + getDepartName()
				+ ", getDateOfAdmission()=" + getDateOfAdmission() + ", getBaseSalary()=" + getBaseSalary()
				+ ", getCgpa()=" + getCgpa() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
