package testProject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class donor_portal extends JFrame implements ActionListener {

	JFrame frame;
	JButton viewprofile, update, changepassword, logoutbtn;
	 String filename;

	 
	 donor_portal(String filename)
	 {
		 getContentPane().setBackground(UIManager.getColor("Button.background"));
			setBackground(new Color(255, 255, 255));
			setResizable(false);

			this.frame = new JFrame();
			this.setTitle("Donor Portal");
			this.setBounds(40, 40, 309, 364);
			getContentPane().setLayout(null);

			viewprofile = new JButton("View Profile");
			viewprofile.setBackground(new Color(47, 79, 79));
			viewprofile.setForeground(new Color(255, 255, 255));
			viewprofile.setBounds(67, 41, 185, 25);
			getContentPane().add(viewprofile);

			update = new JButton("Update  Profile");
			update.setHorizontalAlignment(SwingConstants.RIGHT);
			update.setBackground(new Color(47, 79, 79));
			update.setForeground(new Color(255, 255, 255));
			update.setBounds(80, 105, 153, 25);
			getContentPane().add(update);

			changepassword = new JButton("change Password");
			changepassword.setBackground(new Color(47, 79, 79));
			changepassword.setForeground(new Color(255, 255, 255));
			System.out.println("donor portal"+filename);

			changepassword.setBounds(67, 167, 185, 25);
			getContentPane().add(changepassword);

			logoutbtn = new JButton("Log Out");
			logoutbtn.setBackground(new Color(0, 0, 255));
			logoutbtn.setForeground(new Color(255, 255, 255));
			logoutbtn.setBounds(106, 223, 104, 44);
			getContentPane().add(logoutbtn);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// this.pack();
			addActionEvent();

		 
		 this.filename=filename;
	 }
	public donor_portal() {
		
	}

	public void addActionEvent() {
		logoutbtn.addActionListener(this);
		update.addActionListener(this);
		viewprofile.addActionListener(this);
		update.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == viewprofile) {

			try {
				dispose();

				viewProfile pro = new viewProfile(filename);

				pro.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

		if (e.getSource() == logoutbtn) {
			dispose();
			homepage pro = new homepage();
			pro.setVisible(true);

		}

		if (e.getSource() == update) {
			dispose();
			updateProfile pro;
			try {
				pro = new updateProfile(filename);
				pro.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}

	public void setFilename(String filename) {
		this.filename = filename;

	}
}
