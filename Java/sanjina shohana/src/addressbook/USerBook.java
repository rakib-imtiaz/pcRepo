package addressbook;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class USerBook extends JFrame {

	private String name;
	private String phoneNumber;
	private String email;
	private String streetAddress;

	/*
	 * 
	 * creating a class for holding a user info
	 * 
	 **/
	ArrayList<USerBook> userlist = new ArrayList<>();

	/*
	 * 
	 * Creating file
	 * 
	 **/
	File file = new File("./src/information.txt");

	public USerBook() {

	}

	public USerBook(String name, String phoneNumber, String email, String streetAddress) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.streetAddress = streetAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}


	/*
	 * 
	 * this method fetch data from  the file
	 * 
	 * */
	void fetchFileData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String line;

		while ((line = reader.readLine()) != null) {
			String[] array = line.split(",");

			USerBook obj = new USerBook(array[0], array[2], array[3], array[1]);
			userlist.add(obj);

		}

	}
	

	/*
	 * search method for searching email 
	 * this method iterate through the array List and if target matches it will print the 
	 * details
	 * 
	 **/

	void searchUSer(String email) throws IOException {
		fetchFileData();
		int count = 0;
		for (int i = 0; i < userlist.size(); i++) {
			if (userlist.get(i).getEmail().contentEquals(email)) {
				System.out.println("Matched Data     : " + count);
				System.out.println("Name          :" + userlist.get(i).getName());
				System.out.println("Email         :" + userlist.get(i).getEmail());
				System.out.println("Phone number  : " + userlist.get(i).getPhoneNumber());
				System.out.println("Street Address: " + userlist.get(i).getStreetAddress());
			}

		}

	}

	/*
	 * 
	 * this method deletes data from  the arraylist 
	 * 
	 * */
	void deleteUser(String email) throws IOException {
		fetchFileData();
		int count = 0;
		for (int i = 0; i < userlist.size(); i++) {
			if (userlist.get(i).getEmail().contentEquals(email)) {
				userlist.remove(i);
			}

		}

		updateFile();

	}

	void viewAll() {

		Frame f = new Frame();

	}

	/*
	 * 
	 * this method updates the file
	 * 
	 * */
	void updateFile() throws IOException {
		// File file = new File("information.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));

		for (int i = 0; i < userlist.size(); i++) {

			writer.append(userlist.get(i).getName() + "," + userlist.get(i).getStreetAddress() + ","
					+ userlist.get(i).getPhoneNumber() + "," + userlist.get(i).getEmail());

		}
		writer.close();

	}

	@Override
	public String toString() {
		return "phoneBook [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", streetAddress="
				+ streetAddress + "]";
	}
}
