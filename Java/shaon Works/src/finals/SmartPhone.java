package finals;

public class SmartPhone extends MyDevice {

	private int phoneNumber;

	public SmartPhone(double price, int phoneNumber) {
		super(price);
		this.phoneNumber = phoneNumber;
	}

	public SmartPhone() {
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "SmartPhone{" + "phoneNumber=" + phoneNumber + '}';
	}

	@Override
	public void portable() {
		// TODO Auto-generated method stub
		
	}
}