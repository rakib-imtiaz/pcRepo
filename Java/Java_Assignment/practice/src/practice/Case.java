package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Case {

	String CaseName;
	String CaseID;
	
	ArrayList Evidence = new ArrayList();

	Case(String CaseName, String caseid, ArrayList Evidence) {

		this.CaseID   = caseid;
		this.CaseName = CaseName;
		this.Evidence = Evidence;

	}

	@Override
	public String toString() {
		return "CaseName = " + CaseName + "\nCaseID=" + CaseID + "\n"+"Evidence=" + Evidence+"\n\n"+ "]\n";
	}

	

}
