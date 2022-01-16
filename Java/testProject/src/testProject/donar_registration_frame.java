package testProject;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class donar_registration_frame extends JFrame implements ActionListener {
	private Container c;
	private ImageIcon icon;
	private JLabel nameLabel, lb2, lb3, lb4, lb5, lb7, lb8, lastdatebtn, lb10;
	private JTextField nameField, ageField, addressField, emailfield, numberField, datefield;
	private Font f1, f2;
	private JRadioButton malebtn, femalebtn;
	private ButtonGroup grp;
	private JComboBox bloodgroup;
	private String[] groups = { "Select your blood group", "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" };
	private JButton cancelbtn;
	private JTextField form_text;
	private JButton submitbtn_1;

	String filename;
	File file = new File("./src/Data_Files/DonorDirectory");

	donar_registration_frame() {
		/// this.setVisible(true);
		initcomponent();

	}

	public void initcomponent() {
		file.mkdir();
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

		lb5 = new JLabel();
		lb5.setText("Email");
		lb5.setForeground(Color.white);
		lb5.setFont(new Font("Dialog", Font.BOLD, 12));
		lb5.setBounds(12, 172, 100, 100);
		c.add(lb5);

		lb7 = new JLabel();
		lb7.setText("Phone no");
		lb7.setForeground(Color.white);
		lb7.setFont(new Font("Dialog", Font.BOLD, 12));
		lb7.setBounds(12, 220, 100, 100);
		c.add(lb7);

		lb8 = new JLabel();
		lb8.setText("Blood Group");
		lb8.setFont(new Font("Dialog", Font.BOLD, 12));
		lb8.setForeground(Color.white);
		lb8.setBounds(12, 270, 100, 100);
		c.add(lb8);

		lastdatebtn = new JLabel();
		lastdatebtn.setText("Last date of donation");
		lastdatebtn.setFont(new Font("Dialog", Font.BOLD, 11));
		lastdatebtn.setForeground(Color.white);
		lastdatebtn.setBounds(12, 332, 150, 100);
		c.add(lastdatebtn);

		f2 = new Font("Arial", Font.CENTER_BASELINE, 15);

		nameField = new JTextField();
		nameField.setFont(f2);
		nameField.setBounds(166, 47, 218, 25);
		c.add(nameField);

		ageField = new JTextField();
		ageField.setFont(f2);
		ageField.setBounds(166, 127, 218, 25);
		c.add(ageField);

		addressField = new JTextField();
		addressField.setFont(f2);
		addressField.setBounds(166, 167, 218, 25);
		c.add(addressField);

		emailfield = new JTextField();
		emailfield.setFont(f2);
		emailfield.setBounds(166, 207, 218, 25);
		c.add(emailfield);

		numberField = new JTextField();
		numberField.setText("+880");
		numberField.setFont(f2);
		numberField.setBounds(166, 255, 218, 25);
		c.add(numberField);

		datefield = new JTextField();
		datefield.setFont(f2);
		datefield.setBounds(166, 364, 218, 25);
		c.add(datefield);

		malebtn = new JRadioButton("Male");
		malebtn.setBounds(176, 92, 65, 30);
		malebtn.setForeground(Color.WHITE);
		malebtn.setBackground(Color.BLACK);
		c.add(malebtn);

		femalebtn = new JRadioButton("Female");
		femalebtn.setBounds(276, 92, 100, 30);
		femalebtn.setForeground(Color.WHITE);
		femalebtn.setBackground(Color.BLACK);
		c.add(femalebtn);

		grp = new ButtonGroup();
		grp.add(malebtn);
		grp.add(femalebtn);

		bloodgroup = new JComboBox(groups);
		bloodgroup.setBounds(166, 305, 218, 30);
		c.add(bloodgroup);

		cancelbtn = new JButton("Cancel");
		cancelbtn.setFont(new Font("Dialog", Font.BOLD, 17));
		cancelbtn.setForeground(new Color(255, 250, 250));
		cancelbtn.setBackground(new Color(0, 0, 128));
//		cancelbtn.addActionListener(new ActionListener() {
//			
//			}
//		});
		cancelbtn.setBounds(284, 426, 100, 25);
		getContentPane().add(cancelbtn);

		form_text = new JTextField();
		form_text.setFont(new Font("Dialog", Font.PLAIN, 20));
		form_text.setForeground(new Color(248, 248, 255));
		form_text.setBackground(new Color(0, 0, 0));
		form_text.setText("Donor Registration Form");
		form_text.setBounds(62, 0, 278, 35);
		getContentPane().add(form_text);
		form_text.setColumns(10);
		form_text.setBorder(null);

		submitbtn_1 = new JButton("Submit");
		submitbtn_1.setFont(new Font("Dialog", Font.BOLD, 17));
		submitbtn_1.setForeground(new Color(255, 250, 250));
		submitbtn_1.setBackground(SystemColor.activeCaption);
		submitbtn_1.setBounds(166, 426, 100, 25);
		getContentPane().add(submitbtn_1);
		addActionEvent();

	}

	public void addActionEvent() {
		submitbtn_1.addActionListener(this);
		cancelbtn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == submitbtn_1) {
			if ((nameField.getText().isEmpty()) || (ageField.getText().isEmpty()) || (addressField.getText().isEmpty())
					|| (emailfield.getText().isEmpty()) || (numberField.getText().isEmpty())
					|| (datefield.getText().isEmpty())) {
				JOptionPane.showMessageDialog(null, "Field Cant Be Empty!", "WARNING", JOptionPane.WARNING_MESSAGE);

			} else {

				boolean flag = true;
				String password = null;
				while (flag) {
					password = JOptionPane.showInputDialog(null, "Create your password",
							JOptionPane.INFORMATION_MESSAGE);
					String passAttempt2 = JOptionPane.showInputDialog(null, "Confirm your password",
							JOptionPane.INFORMATION_MESSAGE);
					if (password.equals(passAttempt2)) {
						JOptionPane.showMessageDialog(null, "Password saved successfully!", "Password Verificartion",
								JOptionPane.DEFAULT_OPTION);
						flag = false;

					} else {
						JOptionPane.showMessageDialog(null, "Password Didnt Matched!", "Error",
								JOptionPane.ERROR_MESSAGE);
						continue;
					}

				}

				try {

					FileWriter file = new FileWriter(this.file.getAbsolutePath() + "/" + emailfield.getText() + ".txt");
					FileWriter file2 = new FileWriter(
							this.file.getAbsolutePath() + "/" + emailfield.getText() + ".txt.info.txt");

					filename = file2.toString();

					BufferedWriter write = new BufferedWriter(file);

					BufferedWriter write2 = new BufferedWriter(file2);

					write.append(emailfield.getText() + ",");
					write.append(password + ",");
					write.close();

					String bldgrp = (String) bloodgroup.getItemAt(bloodgroup.getSelectedIndex());

					// write2.append(emailfield.getText() + ",");
					// write2.append(password + ",");

					write2.append(nameField.getText() + ",");
					if (malebtn.isSelected()) {
						write2.append("male,");
					} else {
						write2.append("Female,");

					}
					write2.append(ageField.getText() + ",");
					write2.append(addressField.getText() + ",");
					write2.append(numberField.getText() + ",");
					// String bldgrp = (String) bloodgroup.getItemAt(bloodgroup.getSelectedIndex());
					write2.append(bldgrp + ",");
					write2.append(datefield.getText() + "\n");
					write2.close();

					// BufferedWriter write = new BufferedWriter(file);
					File file3 = new File("./src/Data_Files/DonorDirectory/allinfo.txt");

					// FileWriter file3 = new FileWriter(this.file.getAbsolutePath() + "/"
					// +"allinfo.txt");

					BufferedWriter write3 = new BufferedWriter(new FileWriter(file3, true));
					// write3.

					String bldgrp2 = (String) bloodgroup.getItemAt(bloodgroup.getSelectedIndex());

					// write3.append(emailfield.getText() + ",");
					// write3.append(password + ",");

					write3.append(nameField.getText() + ",");
					if (malebtn.isSelected()) {
						write3.append("male,");
					} else {
						write3.append("Female,");

					}
					write3.append(ageField.getText() + ",");
					write3.append(addressField.getText() + ",");
					write3.append(numberField.getText() + ",");
					// String bldgrp2 = (String)
					// bloodgroup.getItemAt(bloodgroup.getSelectedIndex());
					write3.append(bldgrp2 + ",");
					write3.append(datefield.getText() + "\n");
					write3.close();

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(null, "Donor Registration Successfull!", "Success!",
						JOptionPane.DEFAULT_OPTION);
				dispose();
				homepage h = new homepage();
				h.setVisible(true);
			}
		}

		/**********/

		if (e.getSource() == cancelbtn) {
			dispose();
			homepage g = new homepage();
			g.setVisible(true);

		}

		/*************/

	}
}
