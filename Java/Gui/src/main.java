import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Component;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class main extends JFrame {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public main() {
		getContentPane().setBackground(SystemColor.controlHighlight);

		this.frame = new JFrame();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(120, 300, 665, 444);
		this.setTitle("011191211  Mirazkhan");tm
		getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("Name");
		lblFirstName.setBounds(42, 12, 91, 15);
		getContentPane().add(lblFirstName);
		
		textField = new JTextField();
		textField.setBounds(147, 42, 170, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblFirstName_1 = new JLabel("Last Name:");
		lblFirstName_1.setBounds(341, 44, 91, 15);
		getContentPane().add(lblFirstName_1);
		
		JLabel lblFirstName_2 = new JLabel("      Format: ");
		lblFirstName_2.setBounds(53, 114, 91, 15);
		getContentPane().add(lblFirstName_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(147, 73, 170, 19);
		getContentPane().add(textField_2);
		
		JLabel lblFirstName_1_1 = new JLabel("  Nickname:");
		lblFirstName_1_1.setBounds(341, 77, 91, 15);
		getContentPane().add(lblFirstName_1_1);
		
		Choice choice = new Choice();
		choice.add("Item 1");
		choice.add("Item 2");
		choice.add("Item 3");
		choice.add("Item 4");
		choice.add("Item 5");
		choice.add("Item 6");
		choice.setBounds(147, 114, 424, 21);
		getContentPane().add(choice);
		
		JLabel lblFirstName_2_1 = new JLabel("           Title:");
		lblFirstName_2_1.setBounds(42, 75, 91, 15);
		getContentPane().add(lblFirstName_2_1);
		
		JLabel lblFirstName_3 = new JLabel("First Name:");
		lblFirstName_3.setBounds(42, 39, 91, 15);
		getContentPane().add(lblFirstName_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(435, 42, 170, 19);
		getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(435, 73, 170, 19);
		getContentPane().add(textField_3);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(42, 161, 91, 15);
		getContentPane().add(lblEmail);
		
		JLabel lblFirstName_3_1 = new JLabel("Email Address:");
		lblFirstName_3_1.setBounds(62, 181, 111, 15);
		getContentPane().add(lblFirstName_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(191, 179, 310, 19);
		getContentPane().add(textField_4);
		getContentPane().add(choice);
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(525, 176, 117, 25);
		getContentPane().add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEdit.setBounds(525, 213, 117, 25);
		getContentPane().add(btnEdit);
		
		JButton btnNewButton_1_1 = new JButton("Remove");
		btnNewButton_1_1.setBounds(525, 250, 117, 25);
		getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("As Default");
		btnNewButton_1_2.setBounds(525, 287, 117, 25);
		getContentPane().add(btnNewButton_1_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(484, 210, 17, 102);
		getContentPane().add(scrollBar);
		
		JTextPane txtpnItem = new JTextPane();
		txtpnItem.setText("item1\nitem2\nitem3\nitem4\nitem5\nitem6\nitem7\nitem8\nitem9\nitem10\nitem5\nitem6");
		txtpnItem.setBounds(62, 207, 439, 105);
		getContentPane().add(txtpnItem);
		
		JLabel lblMailFormat = new JLabel("Mail Format");
		lblMailFormat.setBounds(53, 329, 91, 15);
		getContentPane().add(lblMailFormat);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("HTML");
		rdbtnNewRadioButton.setBounds(53, 352, 91, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPlainText = new JRadioButton("Plain Text");
		rdbtnPlainText.setSelected(true);
		rdbtnPlainText.setBounds(147, 352, 99, 23);
		getContentPane().add(rdbtnPlainText);
		
		JRadioButton rdbtnCustom = new JRadioButton("Custom");
		rdbtnCustom.setSelected(true);
		rdbtnCustom.setBounds(261, 352, 99, 23);
		getContentPane().add(rdbtnCustom);
		
		JButton btnOk = new JButton("ok");
		btnOk.setBounds(435, 370, 83, 25);
		getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(543, 370, 99, 25);
		getContentPane().add(btnCancel);
		

	}

	public static void main(String[] args) {
		
		main m = new main();
		m.setVisible(true);

	}
}
