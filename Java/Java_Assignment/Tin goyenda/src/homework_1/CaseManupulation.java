package homework_1;

import java.util.ArrayList;
import java.util.Scanner;

public class CaseManupulation {

	private String title;

	private String briefDescription;

	private String shortSummary;

	private String finalCulprit;

	private int numOfPrimarySuspects;

	private int numOfEvidence;

	private boolean isCaseStatusActive;

	private boolean isFinalCulpritFound;

	private ArrayList<String> suspectList = new ArrayList<String>();
	private ArrayList<String> evidencetList = new ArrayList<String>();

	CaseManupulation obj;

	Scanner scan = new Scanner(System.in);

	CaseManupulation addCase() {

		System.out.println("Case Title :");
		title = scan.nextLine();

		System.out.println("Breif Description(5 line max): ");
		briefDescription = scan.nextLine();

		System.out.println("Number of Primary Suspects");
		numOfPrimarySuspects = scan.nextInt();

		if (numOfPrimarySuspects > 0) {

			for (int i = 0; i < numOfPrimarySuspects; i++) {
				System.out.println("Suspect NO : " + numOfPrimarySuspects + 1);
				String susName = scan.nextLine();
				suspectList.add(susName);

			}

		}
		System.out.println("Number of Evidence :");
		numOfEvidence = scan.nextInt();

		if (numOfEvidence > 0) {

			for (int i = 0; i < numOfEvidence; i++) {
				System.out.println("Suspect NO : " + numOfEvidence + 1);
				String eviName = scan.nextLine();
				suspectList.add(eviName);

			}

		}

		System.out.println("Short summary of the case : ");
		shortSummary = scan.nextLine();

		System.out.println("Is final Found Culprit found?\n1.yes\n2.No : ");
		int s = scan.nextInt();
		if (s == 1)
			isFinalCulpritFound = true;
		else
			isFinalCulpritFound = false;

		System.out.println("Case Status: \n1.Open\n2.Closed : ");
		s = scan.nextInt();
		if (s == 1)
			isCaseStatusActive = true;
		else
			isCaseStatusActive = false;

		return obj;

	}

	void addcase(String title, String briefDescription, String shortSummary, int numOfPrimarySuspects,
			int numOfEvidence, boolean isCaseStatusActive, boolean isFinalCulpritFound, String finalCulprit) {
		this.title = title;
		this.briefDescription = briefDescription;
		this.shortSummary = shortSummary;
		this.finalCulprit = finalCulprit;
		this.isCaseStatusActive = isCaseStatusActive;
		this.isFinalCulpritFound = isFinalCulpritFound;
		this.numOfPrimarySuspects = numOfPrimarySuspects;
		this.numOfEvidence = numOfEvidence;

	}

	void updateCase(CaseManupulation object) {
		System.out.println("1.Update Title");
		System.out.println("2.Update Number of Primary Suspects");
		System.out.println("3.Update Number of Evidence");
		System.out.println("4.Update Case Status");
		System.out.println("5.Update Final Culprit");
		System.out.println("6.Exit");

		int choice = scan.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Enter title to change : ");
			String target = scan.nextLine();
			object.title = title;

			break;
		}

		case 2: {
			System.out.println("Enter Number of primary Suspects : ");
			int target = scan.nextInt();
			object.numOfEvidence = target;

			break;
		}
		case 3: {
			System.out.println("Enter Number of Evidence : ");
			int target = scan.nextInt();
			object.numOfEvidence = target;

			break;
		}

		case 4: {
			if (object.isCaseStatusActive) {
				System.out.println("Current Status is : 'Open'\n Change it?\n1.yes\n2.No");
				int a = scan.nextInt();
				if (a == 1)
					object.isCaseStatusActive = false;
			} else {
				System.out.println("Current Status is : 'Open'\n Change it?\n1.yes\n2.No");
				int a = scan.nextInt();
				if (a == 1)
					object.isCaseStatusActive = true;
			}

		}

			break;

		case 5: {
			System.out.println("Enter Number of Final culprit to update : ");
			String target = scan.nextLine();
			object.finalCulprit = target;

			break;
		}

		case 6: {

			AdminPanel ad = new AdminPanel();
			break;

		}

		}

	}

}
