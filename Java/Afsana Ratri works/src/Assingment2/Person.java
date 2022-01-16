package Assingment2;

public class Person {
	private String name;
	private String address;
	private String cellNo;
	private String email;


	public Person(String name, String address, String cellno, String email) {
		super();
		this.name = name;
		this.address = address;
		this.cellNo = cellno;
		this.email = email;
	}


	public Person() {
		super();
	}
	
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return cellNo;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.cellNo = phoneNumber;
	}


	public String getEmailAddress() {
		return email;
	}


	public void setEmailAddress(String emailAddress) {
		this.email = emailAddress;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phoneNumber=" + cellNo + ", emailAddress="
				+ email + "]";
	}
	
	
	


	

}
