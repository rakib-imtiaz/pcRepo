package xsdsdsd.new_project.assignment4;

public abstract class Assignment04_1912488_Person implements Assignment04_1912488_Teacher{
	
	@Override
	public String teacherId() {
		return "ForeignTeacher: + "+NID;
	}

	private String fullName;
	private String NID;
	private String dateOfBirth;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getNID() {
		return NID;
	}
	public void setNID(String nID) {
		NID = nID;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return "FullName :    " + fullName + "\n\nNID:    \t" + NID + "\n\nDate of Birth: \t" + dateOfBirth + ""+"\n";
	}
		
	
	

}