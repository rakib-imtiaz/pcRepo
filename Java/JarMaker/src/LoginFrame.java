import java.awt.Color;
import java.awt.Container;

import javax.swing.*;

public class LoginFrame extends JFrame {

	private JFrame frame;
	private JLabel userIDLabel, userPassLabel;
	private JTextField userField;
	private JPasswordField userPassField;
	private JButton loginButton, backButton, signUpButton;
	private Container container;
	private JTextField textField;

	public LoginFrame() {

		initializeComponents();

	}

	void initializeComponents() {
		this.frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Login");
		frame.setBounds(100,50,400,350);
		frame.setVisible(true);
		
		Container container = new Container();
		container=this.getContentPane();
		container.setLayout(null);
		
		//labels
		
		userIDLabel = new JLabel("Enter ID :");
		userIDLabel.setBounds(61,12,85,21);
		container.add(userIDLabel);
		
		userField = new JTextField();
		userField.setBounds(213,12,105,21);
		container.add(userField);
		
		userPassLabel = new JLabel("Enter Password :");
		userPassLabel.setBounds(61, 50, 134, 21);
		container.add(userPassLabel);
		
		userPassField = new JPasswordField();
		userPassField.setBounds(213, 50, 105, 21);
		container.add(userPassField);
		
		
		loginButton = new JButton("Login");
		loginButton.setBounds(139,101,94,21);
		container.add(loginButton);		
		
		backButton = new JButton("Go Back");
		backButton.setBounds(139,144,94,21);
		container.add(backButton);
		
		

	}

	
}
