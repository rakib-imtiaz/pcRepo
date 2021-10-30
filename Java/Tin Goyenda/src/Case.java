/*
Name   :N. M. Shadman Sakib Apurbo
id     :2022044
Course :Programming Language II
Section:10
*/




 

import java.util.ArrayList;
import java.util.Scanner;

public class Case {

	private String title;

	private String briefDescription;

	private String shortSummary;

	private String finalCulprit;

	private static int  numOfPrimarySuspects;

	private static int numOfEvidence;

	private boolean isCaseStatusActive;

	private boolean isFinalCulpritFound;
	static int casecount=0;
	

	private ArrayList<String> suspectList = new ArrayList<String>();
	private ArrayList<String> evidencetList = new ArrayList<String>();
	static  ArrayList<Case> listobj = new ArrayList<Case>();

	Case obj;

	Scanner scan = new Scanner(System.in);

	Case() {

		System.out.println("Case Title :");
		title = scan.nextLine();

		System.out.println("Breif Description(5 line max): ");
		briefDescription = scan.nextLine();

		System.out.println("Number of Primary Suspects");
		numOfPrimarySuspects = scan.nextInt();

		if (numOfPrimarySuspects > 0) {

			for (int i = 0; i < numOfPrimarySuspects; i++) {
				System.out.printf("Suspect NO : %d ", i + 1);
				String decoy = scan.nextLine();
				String susName = scan.next();
				suspectList.add(susName);

			}

		}
		System.out.println("Number of Evidence :");
		numOfEvidence = scan.nextInt();

		if (numOfEvidence > 0) {

			for (int i = 0; i < numOfEvidence; i++) {
				System.out.printf("Evidence No : %d ", i + 1);
				String decoy = scan.nextLine();

				String eviName = scan.next();
				suspectList.add(eviName);

			}

		}

		System.out.println("Short summary of the case : ");
		String decoy = scan.nextLine();

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
		

	}



	void addcase(Case caseobj) {

		listobj.add(caseobj);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBriefDescription() {
		return briefDescription;
	}

	public void setBriefDescription(String briefDescription) {
		this.briefDescription = briefDescription;
	}

	public String getShortSummary() {
		return shortSummary;
	}

	public void setShortSummary(String shortSummary) {
		this.shortSummary = shortSummary;
	}

	public String getFinalCulprit() {
		return finalCulprit;
	}

	public void setFinalCulprit(String finalCulprit) {
		this.finalCulprit = finalCulprit;
	}

	public int getNumOfPrimarySuspects() {
		return numOfPrimarySuspects;
	}

	public void setNumOfPrimarySuspects(int numOfPrimarySuspects) {
		this.numOfPrimarySuspects = numOfPrimarySuspects;
	}

	public int getNumOfEvidence() {
		return numOfEvidence;
	}

	public void setNumOfEvidence(int numOfEvidence) {
		this.numOfEvidence = numOfEvidence;
	}

	public boolean isCaseStatusActive() {
		return isCaseStatusActive;
	}

	public void setCaseStatusActive(boolean isCaseStatusActive) {
		this.isCaseStatusActive = isCaseStatusActive;
	}

	public boolean isFinalCulpritFound() {
		return isFinalCulpritFound;
	}

	public void setFinalCulpritFound(boolean isFinalCulpritFound) {
		this.isFinalCulpritFound = isFinalCulpritFound;
	}

	public ArrayList<String> getSuspectList() {
		return suspectList;
	}

	public void setSuspectList(ArrayList<String> suspectList) {
		this.suspectList = suspectList;
	}

	public ArrayList<String> getEvidencetList() {
		return evidencetList;
	}

	public void setEvidencetList(ArrayList<String> evidencetList) {
		this.evidencetList = evidencetList;
	}

	public ArrayList<Case> getListobj() {
		return listobj;
	}

	public void setListobj(ArrayList<Case> listobj) {
		this.listobj = listobj;
	}

	void updateCase(Case object) {
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

	@Override
	public String toString() {
		return "CaseManupulation [title=" + title + ", briefDescription=" + briefDescription + ", shortSummary="
				+ shortSummary + ", finalCulprit=" + finalCulprit + ", numOfPrimarySuspects=" + numOfPrimarySuspects
				+ ", numOfEvidence=" + numOfEvidence + ", isCaseStatusActive=" + isCaseStatusActive
				+ ", isFinalCulpritFound=" + isFinalCulpritFound + ", suspectList=" + suspectList + ", evidencetList="
				+ evidencetList + ", obj=" + obj + ", scan=" + scan + "]";
	}

}

