package lab8Assingment;

public class Student extends Person{
	
	static String status="Freshman";
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String address, String phoneNumber, String emailAddress,String status) {
		super(name, address, phoneNumber, emailAddress);
		this.status=status;
	}


	@Override
	public String toString() {
		return "Name" + getName() + "Class Name =" + getClass();
	}

}
