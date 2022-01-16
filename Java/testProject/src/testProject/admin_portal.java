package testProject;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class admin_portal extends JFrame implements ActionListener {

	JFrame frame;
	JButton adddonor,viewbtn, logoutbtn,updatebtn,deletebtn;

	public admin_portal() {
		
		System.out.println("in portal");
		
		this.setVisible(true);
		getContentPane().setBackground(SystemColor.control);
		setBackground(new Color(255, 255, 255));
		setResizable(false);

		this.frame = new JFrame();
		this.setTitle("Admin Portal");
		this.setBounds(40, 40, 309, 364);
		getContentPane().setLayout(null);

		 adddonor = new JButton("Add Donor");
		 adddonor.setBackground(new Color(47, 79, 79));
		 adddonor.setForeground(new Color(255, 255, 255));
		
		 adddonor.setBounds(80, 41, 153, 25);
		getContentPane().add(adddonor);

		 deletebtn = new JButton("Delete Donor");
		deletebtn.setBackground(new Color(47, 79, 79));
		deletebtn.setForeground(new Color(255, 255, 255));
		deletebtn.setBounds(80, 105, 153, 25);
		getContentPane().add(deletebtn);

		 viewbtn = new JButton("View All Donor");
		viewbtn.setBackground(new Color(47, 79, 79));
		viewbtn.setForeground(new Color(255, 255, 255));
				viewbtn.setBounds(80, 167, 153, 25);
		getContentPane().add(viewbtn);

		  updatebtn = new JButton("Update Donor");
		updatebtn.setBackground(new Color(47, 79, 79));
		updatebtn.setForeground(new Color(255, 255, 255));
		//updatebtn.addActionListener(new ActionListener() {
			
		updatebtn.setBounds(80, 228, 153, 25);
		getContentPane().add(updatebtn);

		 logoutbtn = new JButton("Log Out");
		logoutbtn.setBackground(new Color(0, 0, 255));
		logoutbtn.setForeground(new Color(255, 255, 255));
		logoutbtn.setBounds(108, 278, 104, 44);
		getContentPane().add(logoutbtn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addActionEvent();
		// this.pack();

	}
	public void addActionEvent() {
		adddonor.addActionListener(this);
		viewbtn.addActionListener(this);

		logoutbtn.addActionListener(this);
		updatebtn.addActionListener(this);
		deletebtn.addActionListener(this);
		
			}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==adddonor)
		{
			dispose();
			donar_registration_frame f = new donar_registration_frame();
			f.setVisible(true);
			
			
		}
		if(e.getSource()==deletebtn)
		{
			dispose();
			deletedonor f;
			try {
				f = new deletedonor();
				f.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
		
		if(e.getSource()==viewbtn)
		{
			dispose();
			displaydonor d;
			try {
				d = new displaydonor();
				d.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
			
		}
		
		if(e.getSource()==logoutbtn)
		{
			dispose();
			homepage p = new homepage();
			p.setVisible(true);
			
			
		}
		
		// TODO Auto-generated method stub

	}
}
