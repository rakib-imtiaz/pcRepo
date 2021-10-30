import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class homepage extends JFrame implements ActionListener {

	// frame = new JFrame();
	private Container con;
	private ImageIcon img;
	private JLabel imglabel;
	private JButton asUserButton, asAdminButton, signUpBtn, searchBtn, EmergencyBtn;

	homepage() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 20, 800, 600);
		img = new ImageIcon(getClass().getResource("homepage.png"));
		con = this.getContentPane();
		con.setLayout(null);
		setResizable(false);
		setTitle("Homepage");

		// Buttons
		asUserButton = new JButton();
		asUserButton.setFont(new Font("Dialog", Font.BOLD, 11));
		asUserButton.setForeground(new Color(255, 255, 255));
		asUserButton.setBackground(new Color(65, 105, 225));
		asUserButton.setText("Login As User");
		asUserButton.setBounds(240, 240, 162, 36);
		con.add(asUserButton);
		//
		asAdminButton = new JButton();
		asAdminButton.setFont(new Font("Dialog", Font.BOLD, 11));
		asAdminButton.setForeground(new Color(255, 255, 255));
		asAdminButton.setBackground(new Color(65, 105, 225));
		asAdminButton.setText("Login As Admin");
		asAdminButton.setBounds(432, 240, 175, 36);
		con.add(asAdminButton);
		//

		signUpBtn = new JButton();
		signUpBtn.setFont(new Font("Dialog", Font.BOLD, 11));
		signUpBtn.setForeground(new Color(255, 255, 255));
		signUpBtn.setBackground(new Color(65, 105, 225));
		signUpBtn.setText("SignUp");
		signUpBtn.setBounds(327, 313, 168, 30);
		con.add(signUpBtn);

		//

		searchBtn = new JButton();
		searchBtn.setFont(new Font("Dialog", Font.BOLD, 11));
		searchBtn.setForeground(new Color(255, 255, 255));
		searchBtn.setBackground(new Color(65, 105, 225));
		searchBtn.setText("Search Donor");
		searchBtn.setBounds(327, 393, 168, 30);
		con.add(searchBtn);
		//
		EmergencyBtn = new JButton();
		EmergencyBtn.setFont(new Font("Dialog", Font.BOLD, 11));
		EmergencyBtn.setForeground(new Color(255, 255, 255));
		EmergencyBtn.setBackground(new Color(65, 105, 225));
		EmergencyBtn.setText("Emergency Post");
		EmergencyBtn.setBounds(327, 473, 168, 30);
		con.add(EmergencyBtn);
		imglabel = new JLabel(img);
		imglabel.setFont(new Font("Dialog", Font.BOLD, 11));
		imglabel.setBounds(0, 0, 800, 600);
		con.add(imglabel);

		addActionEvent();

	}

	public void addActionEvent() {
		asUserButton.addActionListener(this);
		asAdminButton.addActionListener(this);
		signUpBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		EmergencyBtn.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == signUpBtn) {
			dispose();
			
			donar_registration_frame form = new donar_registration_frame();
			
			form.setVisible(true);

		}
		
		if (e.getSource() == asUserButton) {
			dispose();
			donor_login log;
			try {
				log = new donor_login();
				log.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
		if (e.getSource() == asAdminButton) {
			dispose();
			try {
				admin_login ad = new admin_login();
				
				ad.setVisible(true);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == searchBtn) {
			dispose();
			try {
				searchDonor ad = new searchDonor();
				
				ad.setVisible(true);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}

	}
}
