package singleton;

public class StudentInformation {

	private int id;
	private String address;
	private String DOB;

	private StudentInformation()
	{
		
		
		
	}
	
	private StudentInformation information=null;
	
	
	public StudentInformation getObject()
	{
		
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

}
