

public class Assignment06_1912488_Person {
	
	
	private String passportNumber=null;
	private String f_name=null;
	private String l_name=null;
	private String nID=null;
	private String date_of_birth=null;
	
	public String getPassportNumber() {
		return passportNumber;
	}
	
public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getnID() {
		return nID;
	}
	public void setnID(String nID) {
		this.nID = nID;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	@Override
	public String toString() {
		return passportNumber +" "+" "+f_name +" "+l_name+" "+nID+" "+date_of_birth+"\n";
	}
	public Assignment06_1912488_Person(String passportNumber, String f_name, String l_name, String nID, String date_of_birth) {
		super();
		this.passportNumber = passportNumber;
		this.f_name = f_name;
		this.l_name = l_name;
		this.nID = nID;
		this.date_of_birth = date_of_birth;
	}
	
	
	
	
	

}