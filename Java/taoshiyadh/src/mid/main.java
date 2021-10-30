package mid;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i=0;
		//String s1=scan.nextLine();
		String s1="Firstnam;middlename-lastname";
		String s2=null;
		for(i=0;i<s1.length()-1;i++) {
			if(s1.charAt(i)==';') {
				s2=s1.substring(i+1,s1.indexOf('-'));
 		 }
			
		}
		System.out.println(s2);
		
		
		

	}
}