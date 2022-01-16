package finalExam;

import java.io.IOException;
import java.util.Scanner;

public class Driver {

	static Scanner in = new Scanner(System.in);
	static Family family1 = new Family(2, "Nuclear", "Biswas", new Physician("Dr.Shaista Lodhi", "MBBS",
			"percutaneous Transforaminal endoscopic disc surgeries", 12, 2500, 125000));
	static Family family2 = new Family(2, "joint", "chowdhury",
			new Physician("Dr. H. S. Chhabra", "Ph.D", "Cardiothoracic  & Vascular Surgery", 10, 5500, 62500));

	public static void main(String[] args) throws IOException {
		Record record = new Record();

		record.addMember(family1);
		record.addMember(family2);

		record.addAllRecordToFile();

		System.out.println("viewing from file:");
		record.view();

		family1.attendWedding();
		family1.attendWedding();
		family1.attendWedding();
		family1.attendWedding();

		System.out.println("\nAfter attending weddings: \n\n\n");
		System.out.println(family1);

		family1.getHousePhysician().makeAppointment();

		family1.getHousePhysician().makeAppointment();

		family1.getHousePhysician().makeAppointment();

		System.out.println("\n\nAfter Three Appointment: \n\n\n");
		System.out.println(family1.getHousePhysician());

		family1.getHousePhysician().cancelAppointment();
		System.out.println("\n\nAfter Canceling an appointment :\n\n\n ");
		System.out.println(family1);

		family1.getHousePhysician().setNumberOfVisitToTheFamily(30);
		System.out.print(family1.getHousePhysician().getSurname() + " Experience level : ");
		family1.getHousePhysician().showExpericeneOFPhysician();

		System.out.println("\n\nEnter surname to Search : ");
		String targetSurname = in.nextLine();

		int numberOfFamilyMembers;
		String typeOfFamily;
		String familySurname;

		Family objectForEdit = new Family();
		objectForEdit.setHousePhysician(family1.getHousePhysician());
		objectForEdit.setNumberOfWeddingAttended(family1.getNumberOfWeddingAttended());

		if (record.search(targetSurname) == false) {
			System.out.println("Data not found");
		} else {

			System.out.println("Edit menu : ");

			System.out.println("Enter number  of family members :");
			objectForEdit.setNumberOfFamilyMembers(in.nextInt());

			System.out.println("Enter type of family members :");
			objectForEdit.setTypeOfFamily(in.nextLine());
			objectForEdit.setTypeOfFamily(in.nextLine());

			System.out.println("Enter family surname:");
			objectForEdit.setFamilySurname(in.nextLine());

			record.edit(targetSurname, objectForEdit);
			System.out.println("Record Modified successfully ");
			record.addAllRecordToFile();

		}

	}

}

/*
 * Name: A.K.M.RAKIBUL HASSAN BISWAS. ID: 2014148042.
 * 
 * 
 */