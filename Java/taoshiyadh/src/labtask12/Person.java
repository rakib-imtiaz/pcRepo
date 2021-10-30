package labtask12;

public class Person {
	private String person;
	private int age;
	private String address;
	
	public Person(String person, int age, String address) {
		super();
		this.person = person;
		this.age = age;
		this.address = address;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String printPerson()
	{
		String p=this.person;
		
		return p;
		
	}

}
