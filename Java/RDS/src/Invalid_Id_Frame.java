import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class Invalid_Id_Frame extends JFrame implements ActionListener {

	JFrame frame;
	ImageIcon userwindowImg;
	Container container;
	JLabel imgLabel;
	private JTextField userNameField;
	private JButton forgetPasswordbtn, nextbtn;
	private JTextField timeField;
	String id;

	public Invalid_Id_Frame(String id) {
		this.id = id;
		this.container = new Container();
		this.userwindowImg = new ImageIcon(getClass().getResource("./images/userWindow_1.png"));

		userNameField = new JTextField();
		userNameField.setText("Please Enter Your Username");
		userNameField.setBounds(254, 107, 252, 41);
		container.add(userNameField);
		userNameField.setColumns(10);

		nextbtn = new JButton("NEXT");
		nextbtn.setForeground(new Color(255, 255, 255));
		nextbtn.setBackground(new Color(0, 128, 0));
		nextbtn.setBounds(457, 160, 81, 49);
		container.add(nextbtn);

		forgetPasswordbtn = new JButton("Forget Password ?");
		forgetPasswordbtn.setForeground(UIManager.getColor("ComboBox.buttonHighlight"));
		forgetPasswordbtn.setBackground(new Color(0, 51, 255));
		forgetPasswordbtn.setBounds(343, 227, 195, 29);
		container.add(forgetPasswordbtn);

		timeField = new JTextField();
		timeField.setFont(new Font("Dialog", Font.BOLD, 14));
		timeField.setForeground(UIManager.getColor("ComboBox.buttonHighlight"));
		timeField.setBackground(new Color(100, 149, 237));
		timeField.setBounds(160, 229, 115, 25);
		timeField.setColumns(10);
		container.add(timeField);
		
		container.setLayout(null);

		this.imgLabel = new JLabel();

		imgLabel.setBounds(0, -11, 557, 281);
		imgLabel.setIcon(userwindowImg);

		container.add(imgLabel);

		this.frame = new JFrame();
		frame.setBounds(100, 100, 550, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().add(container);

		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss a ");

		// System.out.println("Current Date: " + ft.format(dNow));
		ActionListener();

		while (true) {
			Date Now = new Date(System.currentTimeMillis());

			timeField.setText(" " + ft.format(Now));
		}
		
	}

	void ActionListener() {
		userNameField.addActionListener(this);
		nextbtn.addActionListener(this);
		forgetPasswordbtn.addActionListener(this);

	}

	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == nextbtn) {
			
		String id=userNameField.getText();
		if(id.length()>7 || id.length()<7)
		{
			
			System.out.println("length: "+id.length());
			
			this.frame.setVisible(false);
			dispose();
			
			Invalid_Id_Frame frame = new Invalid_Id_Frame(id);
			//frame.setVisible(true);
		}
		else {
			


			dispose();
			passwordFrame frame = new passwordFrame();
		//	frame.setVisible(true);
				

			
		}
			
			
			
			

		} else if (e.getSource() == forgetPasswordbtn) {
			System.out.println("forgot clicked");

		} else if (e.getSource()==userNameField) {
			if(userNameField.isCursorSet())
			userNameField.setText("");
		}

	}
}
