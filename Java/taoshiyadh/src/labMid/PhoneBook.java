
public class PhoneBook {

	private Contact contacts[];
	private int numOfContacts;

	public PhoneBook() {
		
		contacts= new Contact[numOfContacts];
	}
	public PhoneBook(int numOfConstacts) {
		super();
		this.numOfContacts = numOfConstacts;
	}

	 public boolean addContact(Contact contact) {
		 
		   contacts[numOfContacts++]=contact;
		return true;
	 }
	
	private int getSize() {

		return numOfContacts;

	}

	public void viewAllContacts() {
		System.out.println("All Contacts: ");

		for (int i = 0; i < contacts.length; i++) {
			System.out.print(contacts[i].getName() + " ");
			System.out.print(contacts[i].getPhone());
			System.out.println();

		}

	}

	public void viewEmergencyContacts() {

		System.out.println("Emergency Contacts: ");
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].isEmergencyContact() == true) {
				System.out.print(contacts[i].getName() + " ");
				System.out.print(contacts[i].getPhone());
				System.out.println();
			}

		}

	}

	public String searchContact(String name) {

		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getName().contentEquals(name)) {
				return contacts[i].getName() + " " + contacts[i].getPhone();

			}

		}
		return "Contact Not Found";

	}

	public void delete(String name) {
		int index = -1;
		for (int i = 0; i < contacts.length; i++) {
			if (contacts[i].getName().contentEquals(name)) {
				index = i;

			}

		}
		if (index == -1)
		{
			System.out.println("Contact not found");
		} else {

			for (int i = index; i <= contacts.length; i++) {
				contacts[i] = contacts[i + 1];

			}

		}

	}
	
	public void deleteAll()
	{
		for(int i=0;i<contacts.length;i++)
		{
			contacts[i]=null;
			
		}
		
		
	}
	public boolean isEmpty() {
		 boolean b=false;
		 for(int i=0;i<contacts.length;i++) {
			 if(contacts[i]==null) {
				 b=true;
			 }
		 }
		 return b;
	 }
	 public boolean isFull() {
		 boolean b=false;
		 if(getSize()==contacts.length) {
			 b=true;
		 }
		 return b;
		 
	 }
	
	

}
