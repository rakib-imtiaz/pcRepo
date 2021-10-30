
public class Donor {
	private String name=null;
	private String gender=null;
	private int age=0;
	private String address=null;
	private String phnoe_number=null;
	private String bloodgroup=null;
	private String last_date_of_donation=null;

	public Donor(String name, String gender, int age, String address, String phnoe_number, String bloodgroup,
			String last_date_of_donation) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.phnoe_number = phnoe_number;
		this.bloodgroup = bloodgroup;
		this.last_date_of_donation = last_date_of_donation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getPhnoe_number() {
		return phnoe_number;
	}

	public void setPhnoe_number(String phnoe_number) {
		this.phnoe_number = phnoe_number;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getLast_date_of_donation() {
		return last_date_of_donation;
	}

	public void setLast_date_of_donation(String last_date_of_donation) {
		this.last_date_of_donation = last_date_of_donation;
	}

	@Override
	public String toString() {
		return "Name=" + name + " Gender=" + gender + " Age=" + age + " Address=" + address
				+ "Phnoe_number=" + phnoe_number + "Bloodgroup=" + bloodgroup +"\n\n";
	}

	public Donor() {
		super();
	}

}
