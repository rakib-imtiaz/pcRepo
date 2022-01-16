package java_files;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener {

	private Container container;
	private JLabel userLabel;
	private ImageIcon image;
	private JTextField userField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton button;

	public Frame() {

		initialiseComponents();

	}

	public void initialiseComponents() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.setSize(400,300);
		// frame.setLocationRelativeTo(null);
		// frame.setLocation(500,250);
		setBounds(500, 250, 400, 300);
		setTitle("Frame Demo");
		setResizable(true);

		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.CYAN);

		userLabel = new JLabel();
		userLabel.setText("Enter your name : ");
		userLabel.setBounds(50, 67, 150, 31);
		container.add(userLabel);

		userField = new JTextField();
		userField.setBounds(50, 110, 150, 31);
		container.add(userField);

		textArea = new JTextArea();
		//textArea.setBounds(50, 153, 217, 82);
		//container.add(textArea);
		
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(50, 153, 217, 82);
		container.add(scrollPane);

		button = new JButton("Submit");
		button.setBounds(292, 62, 83, 41);
		container.add(button);

		addActionListener();

	}

	public void addActionListener() {

		button.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == userField) {
			String s = userField.getText();

			System.out.println(s);

		} else if (e.getSource() == button) {

			System.out.println(userField.getText());
			System.out.println(textArea.getText());

		}
	}

	public static void main(String[] args) {

		Frame frame = new Frame();
	}

}
