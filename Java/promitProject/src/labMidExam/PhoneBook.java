package labMidExam;

public class PhoneBook {
	private Contact[] contacts;

	private int numOfContacts;
	public static int contactsIndex = 0;

	public PhoneBook(int size) {
		contacts = new Contact[size];
		numOfContacts = size;
	}

	public boolean addContact(Contact contact) {
		int check = contactsIndex;
		contacts[contactsIndex] = contact;
		contactsIndex++;
		if (contactsIndex < check)
			return false;
		else
			return true;
	}

	public int getSize() {
		return numOfContacts;
	}

	public void viewAllContacts() {
		for (int i = 0; i < numOfContacts; i++) {
			System.out.println(contacts[i].getName() + " " + contacts[i].getPhone());
		}
	}

	public void viewEmergencyContacts() {
		for (int i = 0; i <= contactsIndex; i++) {
			if (contacts[i].isEmergencyContact() == true) {
				System.out.println(
						contacts[i].getName() + " " + contacts[i].getPhone() + " " + contacts[i].isEmergencyContact());
			}
		}

	}

	public String searchContact(String name) {
		String message = null;
		for (int i = 0; i < numOfContacts; i++) {
			if (name.equalsIgnoreCase(contacts[i].getName())) {
				message = contacts[i].getName() + " " + contacts[i].getPhone();
			} else
				message = "Contact Not Found";
		}
		return message;
	}

	public boolean isEmpty() {
		if (numOfContacts > contactsIndex)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (numOfContacts == contactsIndex)
			return true;
		else
			return false;
	}

}
