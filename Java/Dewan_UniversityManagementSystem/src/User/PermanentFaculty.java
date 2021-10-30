package User;

import java.util.Arrays;

public class PermanentFaculty extends Faculty {

	public PermanentFaculty(String name, String nID, String initial, String address, String dateOfBirth,
			String departName, double baseSalary, Course[] courseList) {
		super(name, nID, initial, address, dateOfBirth, departName, baseSalary, courseList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PermanentFaculty []";
	}


}
