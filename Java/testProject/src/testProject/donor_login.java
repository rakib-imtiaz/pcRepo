package testProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import java.nio.Buffer;

public class donor_login extends JFrame implements ActionListener {
	Container container = getContentPane();
	private JLabel IdLabel, passLabel;
	private JTextField idText;
	private JPasswordField passText;
	private JButton cancelbtn, loginbtn, Home;
	boolean information = true;
	Scanner scan = new Scanner(System.in);
	 String filename;


	BufferedReader reader = null;
	BufferedWriter writer = null;

	File directory = new File("./src/Data_Files");

	// File directory2 = new File(directory.getAbsolutePath());

	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	donor_login() throws IOException {

		/***** login ****/

		this.setTitle("Donor Login");
		this.setBounds(250, 50, 332, 311);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);



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
		container.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));

		IdLabel = new JLabel("Email");
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
		String UserName = idText.getText();
		String UserPwd = passText.getText();
	
		try {
			
			
			reader = new BufferedReader(new FileReader(directory.getAbsoluteFile() + "/DonorDirectory/"+UserName+".txt"));
			
			filename =directory.getAbsoluteFile() + "/DonorDirectory/"+UserName+".txt";
			
			
			System.out.println(directory.getAbsolutePath());
			System.out.println(directory.getAbsoluteFile());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		if (e.getSource() == loginbtn) {
			try {

				String info;
				info = reader.readLine();
				// System.out.println();

				String details[] = info.split(",");
				System.out.println(details);
				System.out.println("fetched id : "+ details[0]);
				System.out.println("fetched pass : "+details[1] );
				System.out.println("input id : "+ UserName);
				System.out.println("input pass : "+UserPwd );

				if (details[0].equals(UserName) && details[1].equals(UserPwd)) {
					dispose();
					donor_portal portal = new donor_portal(filename);
					System.out.println("reg: "+filename);
					portal.setVisible(true);
					//portal.setFilename(filename);
					System.out.println("donor login"+filename);
					

				} else {

					JOptionPane.showMessageDialog(null, "Email or password is incorrect", "Error",
							JOptionPane.ERROR_MESSAGE);
					dispose();
					donor_login f = new donor_login();
					f.setVisible(true);
				}
			} catch (Exception event) {
				System.out.println(directory.getAbsolutePath());
			}
		}

		if (e.getSource() == cancelbtn) {
			dispose();
			homepage f = new homepage();
			f.setVisible(true);
		}

	}

}
