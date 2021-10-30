package Question_1;

import java.util.*;
public class Question_3 {
	
	public static void main(String[] args) {
		
		String input="hello, world";
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter String");
		input=scan.nextLine();
		asciiStatistics(input);
		
		
		
}
	
	public static void  asciiStatistics(String string)
	{
		int StringAsciiSum=0;
		double sqrRoot;
		double avrg;
		double log;
		int maxAscii=0,minAscii=0;
		
		char charArray[] =new char[string.length()];
		
		charArray=string.toCharArray();
		maxAscii=charArray[0];
		minAscii=charArray[0];
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]>maxAscii)
			{
				maxAscii=charArray[i];
				
			}
			
		}
		
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]<minAscii)
			{
				minAscii=charArray[i];
				
			}
			
		}
		
		
		for(int i=0;i<string.length();i++)
		{
			StringAsciiSum+=string.charAt(i);
			
		}
		sqrRoot=Math.sqrt(StringAsciiSum);
		log=Math.log(StringAsciiSum);
		double num_of_charater=string.length();
		
		avrg=StringAsciiSum/num_of_charater;
		
		System.out.println("ASCII Statistics:");
		
		System.out.println("Sum of ASCII codes in the string: "+StringAsciiSum);
		
		System.out.println("Square root: "+sqrRoot);
		System.out.println("Average: "+avrg);
		System.out.println("Log to the base e: "+log);
		System.out.println("Maximum ASCII code: "+maxAscii);
		System.out.println("Miniimum ASCII code: "+minAscii);
		
		
		
		
		
		
		
		
	}

}
