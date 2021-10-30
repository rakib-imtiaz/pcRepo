
public class main {
	public static void main(String[] args) {

		Contact a = new Contact("john", "017000001", true);
		Contact b = new Contact("Will", "018000001", false);
		Contact c = new Contact("Alice", "019000001", true);
		Contact d = new Contact("jane", "016000001", false);
		Contact e = new Contact("Harry", "013000001", false);

		PhoneBook book = new PhoneBook();
		book.addContact(a);
		book.addContact(b);
		book.addContact(c);
		book.addContact(d);
		book.addContact(e);
		
		book.viewAllContacts();
		book.viewEmergencyContacts();
		book.searchContact("jane");
		book.delete("will");
		book.viewAllContacts();
		book.deleteAll();

	}
}
