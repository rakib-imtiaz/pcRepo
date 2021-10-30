package practice;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		String casename = "Finding Nemo";
		String caseID = "TX13131";

		ArrayList evideNameList = new ArrayList();

		evideNameList.add("smita");
		evideNameList.add("Rohan");
		evideNameList.add("Shayna");
		
		
		String casename2 = "Finding Noman";
		String caseID2 = "RX13131";
		
		ArrayList evideNameList2 = new ArrayList();
		
		evideNameList2.add("smita");
		evideNameList2.add("Rohan");
		evideNameList2.add("Shayna");

		Case case1 = new Case(casename, caseID, evideNameList);
		Case case2 = new Case(casename2, caseID2, evideNameList2);
		
		ArrayList<Case> CaseList = new ArrayList();
		CaseList.add(case1);
		CaseList.add(case2);
		
		//System.out.println(CaseList);
		
		
		System.out.println(CaseList.get(1).CaseID);
		
		
		
		
		
		
		
		
		
		
		
		
//
//		System.out.println(case1);
//
//		case1.Evidence.add("Noman");
//		System.out.println(case1.Evidence.get(0));
//
//		System.out.println();
//		System.out.println(case1);

	}

}
