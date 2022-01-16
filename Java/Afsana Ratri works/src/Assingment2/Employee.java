package Assingment2;
import java.util.*;

public class Employee extends Person{
	private String officeName;
	private double salary;
	private GregorianCalendar date;
	
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			GregorianCalendar datehired) {
		super(name, address, phoneNumber, emailAddress);
		this.officeName = office;
		this.salary = salary;
		this.date = datehired;
	}
	@Override
	public String toString() {
		return "Name" + getName() + "Class Name =" + getClass();
	}

}
