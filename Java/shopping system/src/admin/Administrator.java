package admin;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Administrator {
	Scanner scan = new Scanner(System.in);

	private String fetched_id, inputed_id;
	private String fetched_pass, inputed_pass;

	File file;
	BufferedReader reader;
	BufferedWriter writer;

	public Administrator() throws IOException {
		
		fileiInit();

		System.out.println("Enter Admin ID : ");

		setInputed_id(scan.next());

		System.out.println("Enter Admin Password: ");

		setInputed_pass(scan.next());

		if (verify()) {
			adminPortal portal = new adminPortal();

		} else {

			System.out.println("Invalid Credentials");
		}

	}

	void fileiInit() throws IOException {

		file = new File("./src/admin.txt");
		
		if (file.exists() == false) {
			file.createNewFile();
			System.out.println("Please set the admin id: ");
			setFetched_id(scan.next());

			System.out.println("Please set the admin password: ");
			setFetched_pass(scan.next());
			
			writer = new BufferedWriter(new FileWriter(file));
			
			writer.append(getFetched_id()+" "+getFetched_pass());
			writer.close();

		}
		else {
			
			reader= new BufferedReader(new FileReader(file));
			

			String temp =reader.readLine();
			String [] data =temp.split(" ");
			
			setFetched_id(data[0]);
			setFetched_pass(data[1]);
			
		}

	}

	boolean verify() {

		if (getFetched_id().equals(getInputed_id()) && getFetched_pass().equals(getInputed_pass())) {

			return true;
		} else {

			return false;
		}

	}

	public String getFetched_id() {
		return fetched_id;
	}

	public void setFetched_id(String fetched_id) {

		this.fetched_id = fetched_id;
	}

	public String getInputed_id() {
		return inputed_id;
	}

	public void setInputed_id(String inputed_id) {
		this.inputed_id = inputed_id;
	}

	public String getFetched_pass() {
		return fetched_pass;
	}

	public void setFetched_pass(String fetched_pass) {
		this.fetched_pass = fetched_pass;
	}

	public String getInputed_pass() {
		return inputed_pass;
	}

	public void setInputed_pass(String inputed_pass) {
		this.inputed_pass = inputed_pass;
	}

}
