package testProject;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class displaydonor extends JFrame {

	private String search_key;

	ArrayList<Donor> donorlist = new ArrayList<Donor>();
//	ArrayList<Donor> matchedlist = new ArrayList<Donor>();

	public displaydonor() throws IOException {

		fetchData();
		// creatematchedList();
		JFrame f = new JFrame();

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 73, 766, 191);
		f.getContentPane().add(scrollPane);
		JTextArea area = new JTextArea(donorlist.toString());
		scrollPane.setViewportView(area);
		f.setSize(816, 417);
		f.getContentPane().setLayout(null);

		JLabel lblAvailableDonors = new JLabel("Available Donors");
		lblAvailableDonors.setBounds(22, 12, 143, 49);
		f.getContentPane().add(lblAvailableDonors);

		JButton btnGoBack = new JButton("Go Back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
				donor_portal p= new donor_portal();
				p.setVisible(true);
			}
		});
		btnGoBack.setBounds(22, 284, 117, 25);
		f.getContentPane().add(btnGoBack);
		f.setVisible(true);

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
