
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class primeCheckerGUI  extends JFrame implements ActionListener{
	JFrame frame = new JFrame("Prime Checker");
	private JTextField display;
	private JButton reset,counter;
	static int count=0;


	public primeCheckerGUI() {


		frame.setBounds(350,250,350,350);;
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setBackground(Color.YELLOW);
		getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setColumns(10);
		display.setBounds(25, 39, 114, 19);
		getContentPane().add(display);
		
		reset = new JButton("Reset");
		reset.setBounds(25, 70, 114, 25);
		getContentPane().add(reset);
		
		 counter = new JButton("Counter");
		counter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		counter.setBounds(25, 107, 114, 25);
		getContentPane().add(counter);
		init();
		addActionEvent();
	}
	
	
	void addActionEvent()
	{
		
		reset.addActionListener(this);
		counter.addActionListener(this);

	}
	
	
	
	
	void init()
	{
		//setBounds(250, 20, 800, 600);

	}
	
	public static void main(String[] args) {
		primeCheckerGUI m = new primeCheckerGUI();
		m.setVisible(true);
		
		
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == reset) {
			display.setText("0");
			count=0;
						
		}
		
		if (e.getSource() == counter) {
			count++;
			
			
			display.setText(count+"");
			
		}
		
	}
}
