package nov16;

public class Employee extends Person {
	
	private String Department;
	private String Designation;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String department, String designation) {
		super();
		Department = department;
		Designation = designation;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [Department=" + Department + ", Designation=" + Designation + "]";
	}
	
		
	
	

}
