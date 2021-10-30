package labMidExam;

public class TestPhoneBook {

	public static void main(String[] args) {

		Contact c1 = new Contact("John", "01710000001", true);
		Contact c2 = new Contact("Will", "01810000001", false);
		Contact c3 = new Contact("Alice", "01910000001", true);
		Contact c4 = new Contact("Jane", "01610000001", false);
		Contact c5 = new Contact("Harry", "01310000001", false);

		PhoneBook p = new PhoneBook(5);
		p.addContact(c1);
		p.addContact(c2);
		p.addContact(c3);
		p.addContact(c4);
		p.addContact(c5);
		p.viewAllContacts();
		System.out.println(p.isEmpty());
		System.out.println(p.isFull());
		System.out.println(p.searchContact("Jane"));
	}
}
