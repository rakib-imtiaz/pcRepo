import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import java.nio.Buffer;

public class admin_login extends JFrame implements ActionListener {
	Container container = getContentPane();
	private JLabel IdLabel, passLabel;
	private JTextField idText;
	private JPasswordField passText;
	private JButton cancelbtn, loginbtn, Home;
	boolean information = true;
	Scanner scan = new Scanner(System.in);

	BufferedReader reader = null;
	BufferedWriter writer = null;
	
	File directory = new File("./src/Data_Files");
	
	//File directory2 = new File(directory.getAbsolutePath());

	admin_login() throws IOException {


		/***** login ****/

		this.setTitle("Admin Login");
		this.setBounds(250, 50, 332, 311);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		if (!directory.exists()) 
		{
		JOptionPane.showMessageDialog(null,"Admin Password and ID arent Set!","ADMIN SETUP",JOptionPane.WARNING_MESSAGE);
		String id=JOptionPane.showInputDialog(null,"Enter Id :","ADMIN ID",JOptionPane.QUESTION_MESSAGE);
		String pass=JOptionPane.showInputDialog(null,"Enter password :","ADMIN Password",JOptionPane.QUESTION_MESSAGE);

			directory.mkdir();
			File file2 = new File(directory.getAbsoluteFile() + "/admin_info.txt");

			try {
				writer = new BufferedWriter(new FileWriter(file2.getAbsoluteFile()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				writer.append(id + "," + pass);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			JOptionPane.showMessageDialog(null,"you are full Set!");
			
			System.out.println("Created successfully");
		
		
		}
		
		
		initialize();
		addActionEvent();
	}

	public void addActionEvent() {
		cancelbtn.addActionListener(this);
		loginbtn.addActionListener(this);
		// Home.addActionListener(this);
	}

	public void initialize() {
		container.setLayout(null);
		container.setBackground(UIManager.getColor("Button.darkShadow"));

		IdLabel = new JLabel("ADMIN ID");
		IdLabel.setForeground(Color.WHITE);
		IdLabel.setBounds(50, 50, 82, 20);
		container.add(IdLabel);

		idText = new JTextField();
		idText.setBounds(150, 50, 100, 20);
		container.add(idText);

		passLabel = new JLabel("PASSWORD");
		passLabel.setForeground(Color.WHITE);
		passLabel.setBounds(50, 80, 100, 20);
		container.add(passLabel);

		passText = new JPasswordField();
		passText.setBounds(150, 80, 100, 20);
		container.add(passText);

		loginbtn = new JButton("Login");
		loginbtn.setBounds(160, 121, 90, 25);
		container.add(loginbtn);

		cancelbtn = new JButton("Cancel");
		cancelbtn.setBounds(157, 158, 93, 25);// (from left,from top,width,height)
		container.add(cancelbtn);
		cancelbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				homepage h = new homepage();
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		

		try {
			reader = new BufferedReader(new FileReader(directory.getAbsoluteFile()+"/admin_info.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		if (e.getSource() == loginbtn) {
			try {
				
				String info;
				info = reader.readLine();
				String UserName = idText.getText();
				String UserPwd = passText.getText();
			//	System.out.println();


				String details[] = info.split(",");

				if (details[0].equals(UserName) && details[1].equals(UserPwd)) {
					dispose();
					admin_portal portal = new admin_portal();
					portal.setVisible(true);

				} else {

					System.out.println("incorrect");
				}
			} catch (Exception event) {
				System.out.println(directory.getAbsolutePath());
			}
		}
		
		if(e.getSource()==cancelbtn)
		{
			dispose();
			homepage f = new homepage();
			f.setVisible(true);
		}
		
	}

}
