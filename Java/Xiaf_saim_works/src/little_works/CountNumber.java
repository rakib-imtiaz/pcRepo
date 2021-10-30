package little_works;

import java.util.Scanner;

public class CountNumber {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int number=scan.nextInt();
		
		int temp=number;
		
		int count=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
			
		}
		
		System.out.println(number+" has "+count+" Digits ");
		
		
		
	}

}
