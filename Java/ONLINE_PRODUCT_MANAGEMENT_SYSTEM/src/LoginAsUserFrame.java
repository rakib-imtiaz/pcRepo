
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class LoginAsUserFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private JLabel userIDLabel, userPassLabel;
	private JTextField userField;
	private JPasswordField userPassField;
	private JButton loginButton, backButton, signUpButton;
	private Container container;
	private JTextField textField;

	public LoginAsUserFrame() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);

		initializeComponents();

	}

	void initializeComponents() {

		frame = new JFrame();
		frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("LOGIN AS USER");
		setBounds(600, 300, 400, 255);

		Container container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		userIDLabel = new JLabel("Enter ID :");
		userIDLabel.setBounds(61, 12, 85, 21);
		container.add(userIDLabel);

		userField = new JTextField();
		userField.setBounds(213, 12, 137, 21);
		container.add(userField);

		userPassLabel = new JLabel("Enter Password :");
		userPassLabel.setBounds(61, 50, 134, 21);
		container.add(userPassLabel);

		userPassField = new JPasswordField();
		userPassField.setBounds(213, 50, 137, 21);
		container.add(userPassField);

		loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		loginButton.setBackground(UIManager.getColor("List.dropLineColor"));
		loginButton.setBounds(256, 95, 94, 31);
		loginButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		container.add(loginButton);

		backButton = new JButton("Go Back");
		backButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		backButton.setBounds(61, 95, 94, 31);
		container.add(backButton);

		signUpButton = new JButton("Sign Up");
		signUpButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		signUpButton.setBounds(152, 174, 94, 31);
		getContentPane().add(signUpButton);

		frame.setVisible(true);
		addActionListener();

	}

	public static void main(String[] args) {
		LoginAsUserFrame f = new LoginAsUserFrame();
		f.setVisible(true);

	}

	public void addActionListener() {
		loginButton.addActionListener(this);
		backButton.addActionListener(this);
		signUpButton.addActionListener(this);
	}

	public static String textExtentionAdder(String target)

	{
		return "/" + target + ".txt";

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginButton) {
			this.dispose();
			/*
			 * for accessing an individual user i have made an functionality,which is every
			 * as email id is a unique field, so i will creating separate text file for
			 * every user by creating text file named after their email id. ex: user emaial
			 * : abc@gmail.com, so this users data file will be named "abc@gmail.com.txt"
			 * 
			 */

			String fetchedEmail = userField.getText(); // fetching data from labels
			String fetchedID = userField.getText();

			fetchedEmail = LoginAsUserFrame.textExtentionAdder(fetchedEmail);

			// creating textfle name with usersmail and concataniting .txt extention at the
			// end of the file.

			File CredentialFile = new File(FilePaths.UsersDirectoryPath + fetchedEmail);
			File informationFile = new File(FilePaths.UsersDirectoryPath + fetchedEmail);

			System.out.println(CredentialFile);

			try {
				BufferedReader reader = new BufferedReader(new FileReader(CredentialFile));

				String fetchedString = null;

				String[] data;
				while ((fetchedString = reader.readLine()) != null) {
					data = fetchedString.split(",");

					System.out.println(data[0]);
					System.out.println(data[1]);

					String newData[] = data[0].split("@");
					JOptionPane.showMessageDialog(null, "Welcome " + newData[0] + "!\nYou are Logged in!");
				}

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			// SignUpUserFrame s = new SignUpUserFrame();

		} else if (e.getSource() == signUpButton) {
			this.dispose();
			SignUpUserFrame s = new SignUpUserFrame();
			s.setVisible(true);
		}

		else if (e.getSource() == backButton) {
			this.dispose();
			LoginPortalFrame f = new LoginPortalFrame();
			f.setVisible(true);
		}

	}
}
