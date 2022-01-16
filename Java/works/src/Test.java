
import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		Family Leonard = new Family(2, "Nuclear", "Biswas", 12, new Physician("Dr.Shaista Lodhi", "MBBS",
				"percutaneous Transforaminal endoscopic disc surgeries", 12, 2500, 125000));
		Family Andrew = new Family(2, "joint", "chowdhury", 20,
				new Physician("Dr. H. S. Chhabra", "Ph.D", "Cardiothoracic  & Vascular Surgery", 10, 5500, 62500));
		Scanner input = new Scanner(System.in);

		int no_of_FamilyMember;
		String typeOf_family;
		String FamilySurName;
		int no_of_WeddingAttended = 0;
		Physician physician;

		int option;
		Record newRecord = new Record();

		do {
			menu();
			System.out.println("\nEnter your choice: ");
			option = input.nextInt();

			if (option == 1) {
				Family family = new Family();

				System.out.println("Enter surname: ");
				family.setFamilySurName(input.nextLine());
				family.setFamilySurName(input.nextLine());

				System.out.println("Enter no of family members: ");
				family.setNo_of_FamilyMember(input.nextInt());
				System.out.println("Enter no wedding attend: ");
				family.setNo_of_WeddingAttended(input.nextInt());

				System.out.println("Enter Type of family: ");
				family.setTypeOf_family(input.nextLine());
				family.setTypeOf_family(input.nextLine());

				newRecord.add(family);

			} else if (option == 2) {
				Family family = new Family();

				System.out.println("Enter surname to search ");
				String target = input.nextLine();

				System.out.println("Enter surname: ");
				family.setFamilySurName(input.nextLine());

				System.out.println("Enter no pf family members: ");
				family.setNo_of_FamilyMember(input.nextInt());
				System.out.println("Enter no wedding attend: ");
				family.setNo_of_WeddingAttended(input.nextInt());

				System.out.println("Enter Type of family: ");
				family.setTypeOf_family(input.nextLine());

				newRecord.Edit(target, family);

			} else if (option == 3) {
				newRecord.view();
			} else if (option == 4) {
				System.out.println("Enter surname to search");
				newRecord.Search(input.nextLine());
			}
		else if (option == 5) {
			newRecord.saveToFile();
		}
		else if (option == 6) {
			newRecord.readData();
		}

		} while (option != 7);
	}

	static void menu() {
		System.out.println("1.Add");
		System.out.println("2.Edit");
		System.out.println("3.View");
		System.out.println("4.Search");
		System.out.println("5.save to file");
		System.out.println("6.read from file");
		System.out.println("7.exit");

	}

}
