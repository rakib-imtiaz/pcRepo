
public class Contact extends PhoneBook {
	private String name;
	private String phone;
	private boolean emergencyContact;
	
	
	public Contact() {
		
	}
	public Contact(String name, String phone, boolean emergencyContact) {
		super();
		this.name = name;
		this.phone = phone;
		this.emergencyContact = emergencyContact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(boolean emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	@Override
	public String toString() {
		return "Contact [Name=" + name + "\nphone:" + phone + ", Emergency Contact:" + emergencyContact + "]";
	}
	
	

}
