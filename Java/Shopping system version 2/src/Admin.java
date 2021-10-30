
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
	Scanner scan = new Scanner(System.in);

	private String fileID, inputid;
	private String fetched_pass, inputed_pass;

	File file;
	BufferedReader reader;
	BufferedWriter writer;

	public Admin() throws IOException {

		fileiInit();

		System.out.println("-------------------------------");
		System.out.println("Please Enter Your Admin ID : ");

		setInputed_id(scan.next());

		System.out.println("Password                 : ");
		setInputed_pass(scan.next());

		System.out.println("-------------------------------");

		if (verify()) {
			AdminHomePage p = new AdminHomePage();

		} else {

			System.out.println("Invalid Credentials");
		}

	}

	void fileiInit() throws IOException {

		file = new File("./src/admin.txt");

		if (file.exists() == false) {
			file.createNewFile();
			System.out.println("Set Your Admin ID: ");
			setFetched_id(scan.next());

			System.out.println("Set Your Admin Password");
			setFetched_pass(scan.next());

			writer = new BufferedWriter(new FileWriter(file));

			writer.append(getFetched_id() + " " + getFetched_pass());
			writer.close();

		} else {

			reader = new BufferedReader(new FileReader(file));

			String temp = reader.readLine();
			String[] data = temp.split(" ");

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
		return fileID;
	}

	public void setFetched_id(String fetched_id) {

		this.fileID = fetched_id;
	}

	public String getInputed_id() {
		return inputid;
	}

	public void setInputed_id(String inputed_id) {
		this.inputid = inputed_id;
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
