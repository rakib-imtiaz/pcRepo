package testProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class updateProfile extends JFrame implements ActionListener {
	private Container c;
	private ImageIcon icon;
	private JLabel nameLabel, lb2, lb3, lb4, lb7, lb8, lastdatebtn, lb10;
	private JTextField nameField, ageField, addressField, numberField, datefield;
	private Font f1, f2;
	private ButtonGroup grp;
	private String[] groups = { "Select your blood group", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" };
	private JButton cancelbtn;
	private JTextField form_text;
	private JButton update;

	String filename;
	File file = new File("./src/Data_Files/DonorDirectory");
	private JTextField genderfield;
	private JTextField bloodfield;

	updateProfile() {
	

	}

	public updateProfile(String filename) throws IOException {
		
		this.filename=filename;

		initcomponent();
		addActionEvent();

		// TODO Auto-generated constructor stub
	}

	public void initcomponent() throws IOException {
		
		File file = new File(filename+".info.txt");
		System.out.println("view "+filename);

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String info;
		info = reader.readLine();

		String data[] = info.split(",");
		System.out.println(data[5]);
		System.out.println(data[6]);
		//file.mkdir();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(255, 155, 412, 500);

		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(255, 155, 412, 500);

		c = this.getContentPane();
		c.setBackground(Color.BLACK);
		c.setLayout(null);

		this.setTitle("Donar form");

		icon = new ImageIcon(getClass().getResource("formicon.png"));
		this.setIconImage(icon.getImage());

		f1 = new Font("Arial", Font.BOLD, 20);

		nameLabel = new JLabel();
		nameLabel.setText("Donor Name");
		nameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel.setForeground(Color.white);
		nameLabel.setBounds(12, 12, 100, 100);
		c.add(nameLabel);

		lb2 = new JLabel();
		lb2.setText("Gender");
		lb2.setForeground(Color.white);
		lb2.setFont(new Font("Dialog", Font.BOLD, 12));
		lb2.setBounds(12, 52, 150, 100);
		c.add(lb2);

		lb3 = new JLabel();
		lb3.setText("Age");
		lb3.setForeground(Color.white);
		lb3.setFont(new Font("Dialog", Font.BOLD, 12));
		lb3.setBounds(12, 92, 100, 100);
		c.add(lb3);

		lb4 = new JLabel();
		lb4.setText("Address");
		lb4.setForeground(Color.white);
		lb4.setFont(new Font("Dialog", Font.BOLD, 12));
		lb4.setBounds(12, 132, 100, 100);
		c.add(lb4);

		lb7 = new JLabel();
		lb7.setText("Phone no");
		lb7.setForeground(Color.white);
		lb7.setFont(new Font("Dialog", Font.BOLD, 12));
		lb7.setBounds(12, 178, 100, 100);
		c.add(lb7);

		lb8 = new JLabel();
		lb8.setText("Blood Group");
		lb8.setFont(new Font("Dialog", Font.BOLD, 12));
		lb8.setForeground(Color.white);
		lb8.setBounds(12, 220, 100, 100);
		c.add(lb8);

		lastdatebtn = new JLabel();
		lastdatebtn.setText("Last date of donation");
		lastdatebtn.setFont(new Font("Dialog", Font.BOLD, 11));
		lastdatebtn.setForeground(Color.white);
		lastdatebtn.setBounds(12, 282, 150, 100);
		c.add(lastdatebtn);

		f2 = new Font("Arial", Font.CENTER_BASELINE, 15);

		nameField = new JTextField(data[0]);
		nameField.setFont(f2);
		nameField.setBounds(166, 47, 218, 25);
		c.add(nameField);

		ageField = new JTextField(data[2]);
		ageField.setFont(f2);
		ageField.setBounds(166, 127, 218, 25);
		c.add(ageField);

		addressField = new JTextField(data[3]);
		addressField.setFont(f2);
		addressField.setBounds(166, 167, 218, 25);
		c.add(addressField);

		numberField = new JTextField(data[4]);
		numberField.setFont(f2);
		numberField.setBounds(166, 213, 218, 25);
		c.add(numberField);

		datefield = new JTextField(data[6]);
		datefield.setFont(f2);
		datefield.setBounds(166, 314, 218, 25);
		c.add(datefield);


		cancelbtn = new JButton("Cancel");
		cancelbtn.setFont(new Font("Dialog", Font.BOLD, 17));
		cancelbtn.setForeground(new Color(255, 250, 250));
		cancelbtn.setBackground(new Color(0, 0, 128));

		update = new JButton("update");
		update.setFont(new Font("Dialog", Font.BOLD, 17));
		update.setForeground(new Color(255, 250, 250));
		update.setBackground(SystemColor.activeCaption);
		update.setBounds(166, 347, 100, 25);
		getContentPane().add(update);
		
		grp = new ButtonGroup();
		form_text = new JTextField();
		form_text.setFont(new Font("Dialog", Font.PLAIN, 20));
		form_text.setForeground(new Color(248, 248, 255));
		form_text.setBackground(new Color(0, 0, 0));
		form_text.setText("Profile");
		form_text.setBounds(239, 0, 78, 35);
		getContentPane().add(form_text);
		form_text.setColumns(10);
		form_text.setBorder(null);

		genderfield = new JTextField(data[1]);
		genderfield.setFont(new Font("Dialog", Font.BOLD, 15));
		genderfield.setBounds(166, 87, 218, 25);
		getContentPane().add(genderfield);

		bloodfield = new JTextField(data[5]);
		bloodfield.setFont(new Font("Dialog", Font.BOLD, 15));
		bloodfield.setBounds(166, 258, 218, 25);
		getContentPane().add(bloodfield);
		addActionEvent();

	}

	public void addActionEvent() {
		update.addActionListener(this);
		cancelbtn.addActionListener(this);
			}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == update) {
			
			dispose();

			if ((nameField.getText().isEmpty()) || (ageField.getText().isEmpty()) || (addressField.getText().isEmpty())
					 || (numberField.getText().isEmpty())
					|| (datefield.getText().isEmpty())) {
				JOptionPane.showMessageDialog(null, "Field Cant Be Empty!", "WARNING", JOptionPane.WARNING_MESSAGE);
				
			} else {

				try {

					FileWriter file2 = new FileWriter(filename+".info.txt");
					System.out.println(file2);

					BufferedWriter write2 = new BufferedWriter(file2);
					write2.append(nameField.getText() + ",");
					write2.append(genderfield.getText() + ",");

									write2.append(ageField.getText() + ",");
					write2.append(addressField.getText() + ",");
					write2.append(numberField.getText() + ",");

					write2.append(bloodfield.getText() + ",");
					write2.append(datefield.getText() + "\n");
					write2.close();

				} catch (IOException e1) {
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(null, "Update successfull!", "Success!",
						JOptionPane.DEFAULT_OPTION);
				donor_portal h = new donor_portal(filename);
				h.setVisible(true);
			}
		}

		/**********/

		if (e.getSource() == cancelbtn) {
			dispose();
			donor_portal g = new donor_portal(filename);
			g.setVisible(true);

		}

		/*************/

	}
}
