package lab8Assingment;

import java.util.GregorianCalendar;

public class Staff extends Employee {

	private String title;

	public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			GregorianCalendar datehired, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary, datehired);
		this.title = title;
	}

	@Override
	public String toString() {
		return "Name" + getName() + "Class Name =" + getClass();
	}

}
