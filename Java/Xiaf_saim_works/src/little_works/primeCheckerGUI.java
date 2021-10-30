package little_works;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primeCheckerGUI  extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Prime Checker");
	private JTextField displayField;
	private JTextField InputFields;
	private JButton btnCheckPrime;


	public primeCheckerGUI() {


		frame.setBounds(350,250,350,350);;
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.YELLOW);
		getContentPane().setLayout(null);
		
		displayField = new JTextField();
		displayField.setBounds(25, 118, 147, 65);
		getContentPane().add(displayField);
		displayField.setColumns(10);
		
		InputFields = new JTextField();
		InputFields.setColumns(10);
		InputFields.setBounds(25, 39, 114, 19);
		getContentPane().add(InputFields);
		
		 btnCheckPrime = new JButton("Check prime");
		btnCheckPrime.setBounds(25, 70, 128, 25);
		getContentPane().add(btnCheckPrime);

		JLabel lblEnterANumber = new JLabel("Enter a number : ");
		lblEnterANumber.setBounds(25, 12, 128, 15);
		getContentPane().add(lblEnterANumber);
		init();
		addActionEvent();
	}
	
	
	void addActionEvent()
	{
		
		btnCheckPrime.addActionListener(this);

	}
	
	
	
	
	void init()
	{
		//setBounds(250, 20, 800, 600);

	}
	
	public static void main(String[] args) {
		primeCheckerGUI m = new primeCheckerGUI();
		m.setVisible(true);
		
		
	}

	 static boolean isPrime(int n){
	        boolean result=true;
	        if(n <= 1) return false;
	        for(int i = 2; i <= n/2; i++){ //n/2 because the largest factor of any number is either it's half or less than it
	            if(n % i == 0){
	                result = false; //if some number divides it, then prime=false;
	                break;
	            }
	        }
	        return result;
	 }



	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCheckPrime) {
			String input= InputFields.getText();
			
			int in=Integer.parseInt(input);
			boolean ans=isPrime(in);
			if(ans==true)
			{
				displayField.setText("Its prime");
			}
			else {
				displayField.setText("Its not prime");

				
			}
			
			
			
		}
		
	}
}
