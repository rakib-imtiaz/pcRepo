package assignment3;

import java.util.Random;

public class Assignment03_1912488_PassportInfo {

	String passportNumber;
	private String firstName;
	private String lastName;
	private String nidNumber;
	private String dob;
	private Assignment03_1912488_Picture picture;


/**
 *a static method which is used for returning an object of passportinfo 
 *to the main method 
 *
 */
	static Assignment03_1912488_PassportInfo Builder() {
		Assignment03_1912488_PassportInfo obj = new Assignment03_1912488_PassportInfo();

		return obj;

	}

	public Assignment03_1912488_PassportInfo() {

		this.passportNumber = getPassportNumber();
		this.firstName = getFirstName();
		this.lastName = getLastName();
		this.nidNumber = getNidNumber();

		this.dob = Assignment03_1912488_DateOfBirth.getDateofBirth();

		Assignment03_1912488_Picture p = new Assignment03_1912488_Picture();
		this.picture = p;

	}

	public Assignment03_1912488_PassportInfo(String passportNumber, String firstName, String lastName,
			String nidNumber) {
		super();
		this.passportNumber = passportNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nidNumber = nidNumber;
	}

/**
 * this method will be generating random first name from the string array
 *
 */
	public String getFirstName() {

		String[] fname = { "Kabir", "Azam", "Mustafa", "Masum", "Raiyan", "Ishtiaque", "Kausar", "Munshi", "Fardin",
				"Junaid", "Imtiaz", "Nizam", "Kuraish", "Orko" };


		Random r = new Random();

		int low = 0;
		int high = fname.length;

		int index = r.nextInt(high - low) + low;

		return fname[index]; // returning the random index of string array 
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


/**
 * 
 * same way to get the random index from the string array 
 * and return the random Last name from the string array
 *
 */
	public String getLastName() {
		String[] lname = { "LaskaMir", "Uddin", "Syed", "Akhand", "Prodhan", "Mir", "Shah", "Munshi", "Dewan", "Gazi",
				"Kazi", "Khan", "Chowdhury", "Sarkar" };
		Random r = new Random();

		int low = 0;
		int high = lname.length;

		int index = r.nextInt(high - low) + low;

		return lname[index];

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	


	public String getNidNumber() {

		

/**
 *the NID number is going to have Two DIGITS of Number starting from 1 to 9
 *so the bound is in the given variable
 * 
 */
		int low = 1;
		int high = 9;
		Random r = new Random();

		int first_digit = r.nextInt(high - low) + low;

		low = 0;
		high = 999999999;
//code for generating last nine digits 
		
		
		
		int last_nine_digits = r.nextInt(high - low) + low;

		StringBuffer nid = new StringBuffer();

		nid.append(first_digit);
		nid.append(last_nine_digits);

		String converted_nid = new String(nid);

		return converted_nid;
	}

	public void setNidNumber(String nidNumber) {
		this.nidNumber = nidNumber;
	}

	
	

/**
 * 
 * this method will generate random passport number
 * 
 */
	public String getPassportNumber() {
		
		
		
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//converting string into character array
		
		char[] capitalLetter = s.toCharArray();

		//getting the random indexes 
		Random r = new Random();
		int low = 1;
		int high = 26;

		int randomNumber1 = r.nextInt(high - low) + low;
		int randomNumber2 = r.nextInt(high - low) + low;

		//using that random indexes to generate random charatcter
		
		char first = capitalLetter[randomNumber1];
		char second = capitalLetter[randomNumber2];

		low = 1;
		high = 9999999;
		int randomNumber3 = r.nextInt(high - low) + low;

		StringBuffer passportNumber = new StringBuffer();
		passportNumber.append(first);
		
		passportNumber.append(second);

		passportNumber.append("-");
		
		passportNumber.append(randomNumber3);

		String conv_passportNumber = new String(passportNumber);

		return conv_passportNumber;
	}

	private void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	private static String[] allPassportNumbers;

//	static {
//		allPassportNumbers = new String[100];
//
//		Assignment03_1912488_PassportInfo pass = new Assignment03_1912488_PassportInfo();
//
//		for (int i = 0; i < 15; i++) {
//			if (allPassportNumbers[i].equals(pass.getPassportNumber()))
//				;
//			{
//				allPassportNumbers[i] = pass.getPassportNumber();
//
//			}
	
//
//		}
//
//	}
	

/**
 * To string method for printing objects
 * 
 */

	@Override
	public String toString() {
		return "\nPassport # : " + passportNumber + ".\n\nFirst Name :" + firstName + ".\n\nLast Name : " + lastName
				+ ".\n\nNID :" + nidNumber + ".\n\nDate of Birth :" + dob + ".\n\nPicture=" + "BufferedImage@ "
				+ picture + ".\n\n\n\n";
	}

}
