package labtask12;

public class Employee extends Person{
	private String Department;
	private String designation;
	
	
	public Employee(String person, int age, String address, String department, String designation) {
		super(person, age, address);
		Department = department;
		this.designation = designation;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String printEmployee()
	{
		return this.getPerson();
		
	}
	
	
	

}
