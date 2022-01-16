package java_files;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginAsAdminFrame_test extends JFrame implements ActionListener {

	private JFrame frame;
	private JLabel userIDLabel, userPassLabel;
	private JTextField userField;
	private JPasswordField userPassField;
	private JButton loginButton, backButton;
	private Container container;
	private JTextField textField;

	public LoginAsAdminFrame_test() {
		

		initializeComponents();

	}

	void initializeComponents() {

		frame = new JFrame();
		frame.setVisible(true);
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("LOGIN AS ADMIN");
		setBounds(600, 300, 400, 249);

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
		loginButton.setBackground(UIManager.getColor("List.dropLineColor"));
		loginButton.setBounds(139, 101, 94, 31);
		loginButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		container.add(loginButton);

		backButton = new JButton("Go Back");
		backButton.setFont(new Font("Lato Black", Font.BOLD, 12));
		backButton.setBounds(139, 144, 94, 31);
		container.add(backButton);
		addActionListener();

	}

	public static void main(String[] args) {
		LoginAsAdminFrame_test f = new LoginAsAdminFrame_test();
		f.setVisible(true);

	}
	public void addActionListener()
	{
		loginButton.addActionListener(this);
		backButton.addActionListener(this);
		//signUpButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loginButton)
		{
			this.dispose();
			SignUpUserFrame s = new SignUpUserFrame();
			
			
		}
	
		else if(e.getSource()==backButton)
		{
			this.dispose();
			LoginPortalFrame f = new LoginPortalFrame();
			f.setVisible(true);
		}
		

	}


}
