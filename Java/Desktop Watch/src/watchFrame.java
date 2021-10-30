import java.awt.*;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.*;

public class watchFrame {
	
	JFrame frame;
	JLabel label;
	Container container;
	private JTextField textField;
	
	public watchFrame() {
		init();
	
		

	}
	
	
	void init()
	{
		this.frame = new  JFrame();
		textField = new JTextField();
		container = new Container();


		
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(119, 136, 153));
		textField.setFont(new Font("FreeMono", Font.BOLD, 25));
		textField.setBounds(48, 50, 154, 54);
		textField.setColumns(10);
	
		frame.getContentPane().setBackground(new Color(0, 139, 139));
		frame.setBounds(250,150,250,199);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(container);
		frame.getContentPane().add(textField);
		frame.setVisible(true);
		frame.setResizable(false);;
				
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss a ");

		while (true) {
			Date Now = new Date(System.currentTimeMillis());

			textField.setText(" " + ft.format(Now));
		}
		

		
		
		
	}
	
	public static void main(String[] args) {
		
		watchFrame f = new watchFrame();
		
	}
}

