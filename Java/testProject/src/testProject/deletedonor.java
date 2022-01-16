package testProject;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class deletedonor extends JFrame {

	private String search_key;

	ArrayList<Donor> donorlist = new ArrayList<Donor>();
	ArrayList<Donor> matchedlist = new ArrayList<Donor>();
	boolean flag = false;

	public deletedonor() throws IOException {

		fetchData();
		creatematchedList();
		if (flag) {
			JOptionPane.showMessageDialog(null, "Data successfullly deleted");
		} else {
			JOptionPane.showMessageDialog(null, "No data found");
			dispose();
			admin_portal p = new admin_portal();
			p.setVisible(true);


		}

		updatelist();
		dispose();
		admin_portal p = new admin_portal();
		p.setVisible(true);

	}

	void creatematchedList() {
		search_key = JOptionPane.showInputDialog("Enter the Donor name  you want to delete ");

		int i = 0;
		System.out.println(donorlist.size());
		;
		while (i < donorlist.size()) {
			if (donorlist.get(i).getName().equalsIgnoreCase(search_key)) {
				// System.out.println("Name : "+donorlist.get(i).getName() );
				donorlist.remove(i);
				flag = true;
				// matchedlist.add(donorlist.get(i));

			}
			i++;

		}
	
	}

	void updatelist() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter("./src/Data_Files/DonorDirectory/allinfo.txt"));

		for (int i = 0; i < donorlist.size(); i++) {
			writer.append(donorlist.get(i).getName() + ",");
			writer.append(donorlist.get(i).getGender() + ",");
			writer.append(donorlist.get(i).getAge() + ",");
			writer.append(donorlist.get(i).getAddress() + ",");
			writer.append(donorlist.get(i).getPhnoe_number() + ",");
			writer.append(donorlist.get(i).getBloodgroup() + ",");
			writer.append(donorlist.get(i).getLast_date_of_donation() + "\n");

		}
		JOptionPane.showMessageDialog(null, "Data successfull updated");

	}

	void fetchData() throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new FileReader("./src/Data_Files/DonorDirectory/allinfo.txt"));
		String fetchedinfo;
		String fetched[];

		while ((fetchedinfo = reader.readLine()) != null) {
			fetched = fetchedinfo.split(",");
			donorlist.add(new Donor(fetched[0], fetched[1], Integer.parseInt(fetched[2]), fetched[3], fetched[4],
					fetched[5], fetched[6]));

		}

		// System.out.println(donorlist);

	}
}
