package sep_9;

import java.util.Scanner;

public class Ceasar {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String input=scan.nextLine();
		scan.close();
		
		int n=3;
		
		input=input.toUpperCase();
		char array[]=input.toCharArray();
		
		for(int i =0;i<array.length ;i++)
		{
			array[i]=(char)(array[i]+n);
			
		}
		
		String s= new String(array);
		
		System.out.println("Ouput "+s);
	}

}
