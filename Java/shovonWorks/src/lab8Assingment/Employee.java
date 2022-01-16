package lab8Assingment;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{
	private String office;
	private double salary;
	private GregorianCalendar datehired;
	
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	



	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary,
			GregorianCalendar datehired) {
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.datehired = datehired;
	}





	@Override
	public String toString() {
		return "Name" + getName() + "Class Name =" + getClass();
	}

}
