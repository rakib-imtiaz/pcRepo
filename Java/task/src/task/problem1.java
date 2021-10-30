package task;

import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1;
		s1=input.nextLine();
		char ch[]=new char[s1.length()];
		int x;
        x=input.nextInt();
		int i=0;
		int j=0;
		int h=0;
		for(i=s1.length()-1;i>=0;i--) {
			ch[j]=s1.charAt(i);
			j++;
		}
		System.out.println(ch);
		
		for(i=0;i<s1.length();i++) {
			if(ch[i]==' ') {
				ch[i]='*';
			}
			else if((ch[i]+x)<122 && ch[i]!='*') {
				ch[i]+=x;
			}
			else if((ch[i]+x-'z')==1) {
				ch[i]='a';
			}
			else if(ch[i]+x-'z'>1) {
				ch[i]='a';
				ch[i]+=((ch[i]+x-'z')-1);
			}
		}
	
	System.out.println(ch);
	}
}
