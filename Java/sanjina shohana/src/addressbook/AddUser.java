package addressbook;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AddUser extends JFrame implements ActionListener {
	private Container c;
	private JLabel nameLabel, lb4, lb5, lb7, lb10;
	private JTextField nameField, addressField, emailfield, numberField;
	private Font f1, f2;
	private ButtonGroup grp;
	private JTextField form_text;
	private JButton submitbtn_1;
	
	
	/*
	 * Creating files in the src folder named information.txt
	 * 
	 * */

	String filename;
	File file = new File("./src/information.txt");

	AddUser() throws IOException {
		/// this.setVisible(true);
		initcomponent();

	}
	

	/*
	 *initialising  the files and jframes and all the buttons for the f
	 *frame
	 * 
	 * */

	public void initcomponent() throws IOException {
		
		if(file.exists()==false)
		{
			file.createNewFile();

		}
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(255, 155, 412, 380);

		c = this.getContentPane();
		c.setBackground(Color.BLACK);
		c.setLayout(null);

		this.setTitle("Donar form");

		f1 = new Font("Arial", Font.BOLD, 20);

		nameLabel = new JLabel();
		nameLabel.setText(" Name");
		nameLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		nameLabel.setForeground(Color.white);
		nameLabel.setBounds(12, 12, 100, 68);
		c.add(nameLabel);

		lb4 = new JLabel();
		lb4.setText("Address");
		lb4.setForeground(Color.white);
		lb4.setFont(new Font("Dialog", Font.BOLD, 12));
		lb4.setBounds(12, 60, 100, 100);
		c.add(lb4);

		lb5 = new JLabel();
		lb5.setText("Email");
		lb5.setForeground(Color.white);
		lb5.setFont(new Font("Dialog", Font.BOLD, 12));
		lb5.setBounds(12, 116, 100, 100);
		c.add(lb5);

		lb7 = new JLabel();
		lb7.setText("Phone no");
		lb7.setForeground(Color.white);
		lb7.setFont(new Font("Dialog", Font.BOLD, 12));
		lb7.setBounds(12, 161, 100, 100);
		c.add(lb7);

		f2 = new Font("Arial", Font.CENTER_BASELINE, 15);

		nameField = new JTextField();
		nameField.setFont(f2);
		nameField.setBounds(166, 47, 218, 25);
		c.add(nameField);

		addressField = new JTextField();
		addressField.setFont(f2);
		addressField.setBounds(166, 98, 218, 25);
		c.add(addressField);

		emailfield = new JTextField();
		emailfield.setFont(f2);
		emailfield.setBounds(166, 154, 218, 25);
		c.add(emailfield);

		numberField = new JTextField();
		numberField.setText("+880");
		numberField.setFont(f2);
		numberField.setBounds(166, 199, 218, 25);
		c.add(numberField);

		grp = new ButtonGroup();

		form_text = new JTextField();
		form_text.setFont(new Font("Dialog", Font.PLAIN, 20));
		form_text.setForeground(new Color(248, 248, 255));
		form_text.setBackground(new Color(0, 0, 0));
		form_text.setText("Add User");
		form_text.setBounds(166, 0, 122, 35);
		getContentPane().add(form_text);
		form_text.setColumns(10);
		form_text.setBorder(null);

		submitbtn_1 = new JButton("Add user");
		submitbtn_1.setFont(new Font("Dialog", Font.BOLD, 17));
		submitbtn_1.setForeground(new Color(255, 250, 250));
		submitbtn_1.setBackground(SystemColor.activeCaption);
		submitbtn_1.setBounds(130, 283, 166, 25);
		getContentPane().add(submitbtn_1);
		addActionEvent();

	}

	public void addActionEvent() {
		submitbtn_1.addActionListener(this);
	}

	/*
	 *
	 * adding action events and other actions
	 * 
	 * */

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == submitbtn_1) {
			if ((nameField.getText().isEmpty()) ||  (addressField.getText().isEmpty())
					|| (emailfield.getText().isEmpty()) || (numberField.getText().isEmpty())
					 ) {
				
				/*
				 *
				 *adding joption pane if fields are empty iut will show the following messeage
				 * 
				 * */

				JOptionPane.showMessageDialog(null, "Field Cant Be Empty!", "WARNING", JOptionPane.WARNING_MESSAGE);
				
			} else {

				

				try {
					
					/*
					 *writing files in the text file and
					 *  appneding the data as comma spearated values
					 * */
					BufferedWriter write = new BufferedWriter(new FileWriter(file,true));

					write.append(nameField.getText() + ",");
					write.append(addressField.getText() + ",");
					write.append(numberField.getText() + ",");
					write.append(emailfield.getText() + "\n");
					write.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				JOptionPane.showMessageDialog(null, "USer added Successfully!",
						filename, JOptionPane.DEFAULT_OPTION);
				dispose();
				homeFrame h = new homeFrame();
				h.setVisible(true);
			}
		}


	}
}
