package Assingment2;

import java.util.GregorianCalendar;

public class Faculty extends Employee{
	
	private String officeHours;
	
	private String rank;
	

	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			GregorianCalendar datehired,String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary, datehired);
		this.officeHours = officeHours;
		this.rank = rank;
		}




	@Override
	public String toString() {
		return "Name" + getName() + "Class Name =" + getClass();
	}


}
