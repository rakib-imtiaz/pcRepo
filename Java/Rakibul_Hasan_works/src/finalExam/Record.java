package finalExam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Record {

	private Family[] familyList;
	private static int numberOfFamilyMembers = 0;
	private File file;
	private BufferedReader reader;
	private BufferedWriter writer;

	public Record(Family[] familyList) {
		super();
		this.familyList = familyList;
	}

	public Record() throws IOException {

		familyList = new Family[100];
		file = new File("A.K.M.RAKIBUL_HASSAN_BISWAS_2014148042.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

	}

	public void addMember(Family member) {

		familyList[numberOfFamilyMembers] = member;
		numberOfFamilyMembers++;

	}

	public void addAllRecordToFile() throws IOException {
		writer = new BufferedWriter(new FileWriter(file));

		for (int i = 0; i < numberOfFamilyMembers; i++) {
			writer.append(familyList[i].getFamilySurname() + "," + familyList[i].getNumberOfFamilyMembers() + ","
					+ familyList[i].getNumberOfWeddingAttended() + "," + familyList[i].getTypeOfFamily() + ","
					+ familyList[i].getHousePhysician().getFeePerVisit() + ","
					+ familyList[i].getHousePhysician().getHighestLevelOfDegree() + ","
					+ familyList[i].getHousePhysician().getNumberOfVisitToTheFamily() + ","
					+ familyList[i].getHousePhysician().getSurname() + ","
					+ familyList[i].getHousePhysician().getTotalPayment() + ","
					+ familyList[i].getHousePhysician().getTypeOfPhysician() + "\n");

		}
		writer.close();

	}

	public void view() throws IOException {

		Family[] familyArray = new Family[100];

		int datacount = 0;

		reader = new BufferedReader(new FileReader(file));
		String content = null;

		String[] contentArray;

		Family familyTempVariable;
		Physician physicianTemp;
		int i = 0;

		while ((content = reader.readLine()) != null) {

			contentArray = content.split(",");

			System.out.println(contentArray[i]);
			physicianTemp = new Physician(contentArray[7].toString(), contentArray[5].toString(),
					contentArray[9].toString(), Integer.parseInt(contentArray[6]), Double.parseDouble(contentArray[4]),
					Double.parseDouble(contentArray[8]));

			familyTempVariable = new Family(Integer.parseInt(contentArray[1]), contentArray[3], contentArray[0],
					physicianTemp);
			familyArray[datacount] = familyTempVariable;
			datacount++;
			
			for (i = 0; i < datacount; i++) {
				System.out.println(familyArray[i].toString());

			}

		}
	}

	public boolean search(String surname) {

		boolean flag = false;
		for (int i = 0; i < numberOfFamilyMembers; i++) {
			if (familyList[i].getFamilySurname().contentEquals(surname)) {
				flag = true;

				System.out.println(familyList[i]);

			}

		}
		return flag;

	}

	public void edit(String surname, Family family) {

		for (int i = 0; i < numberOfFamilyMembers; i++) {
			if (familyList[i].getFamilySurname().contentEquals(surname)) {
				familyList[i] = family;
			}

		}

	}

}

/*
 * Name: A.K.M.RAKIBUL HASSAN BISWAS. ID: 2014148042.
 * 
 * 
 */