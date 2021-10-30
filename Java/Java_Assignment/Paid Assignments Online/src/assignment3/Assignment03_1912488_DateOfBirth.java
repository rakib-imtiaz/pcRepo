package assignment3;

import java.util.Random;

public class Assignment03_1912488_DateOfBirth {
	private int date;
	private int month;
	private int year;
	
	

/**
 *a static method to get the random date of brith from main
 *method
 * a static method can be call through class name
 * no object will be create for this static method
 * 
 */
	
	static String getDateofBirth()
	{

/**
 * this is way to create random year,month,and day with in the given Range
 */
		Random year = new Random();
		int low = 1940;
		int high = 2000;
		int years = year.nextInt(high - low) + low;

		Random month = new Random();
		 low = 1;
		 high = 12;
		 int months = month.nextInt(high - low) + low;
		
		Random day = new Random();
		 low = 1;
		 high = 31;
		 int days = day.nextInt(high - low) + low;
		 
		 StringBuffer dob = new StringBuffer();		
		 
		 dob.append(days);
		 dob.append("/");
		 dob.append(months);
		 dob.append("/");
		 dob.append(years);
		 
		 String dateOfBirth= new String(dob); 
		
		
		
		
		return dateOfBirth;
		
		
	}
	
	
	
	
	

}
