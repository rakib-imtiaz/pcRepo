package addressbook;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Font;

public class homeFrame extends JFrame implements ActionListener {

	JButton Addbtn, searchbtn, deleteUserbtn, updateuserBtn, viewallBtn;
	Frame frame;

	public homeFrame() 
	{
		
		
		/*
		 * 
		 * this code is for creating basic frame
		 * 
		 * 
		 * 
		 * **/
		this.setBounds(450, 250, 400, 220);
		this.setTitle("Welcome to USer Book ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);

		setFont(new Font("Chilanka", Font.PLAIN, 16));
		setForeground(new Color(255, 255, 240));
		getContentPane().setBackground(SystemColor.controlLtHighlight);
		setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);

		Addbtn = new JButton("Add user");
		Addbtn.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionForeground"));
		Addbtn.setBounds(32, 35, 132, 25);
		getContentPane().add(Addbtn);

		searchbtn = new JButton("Search user");
		searchbtn.setBounds(32, 82, 132, 25);
		getContentPane().add(searchbtn);

		deleteUserbtn = new JButton("Delete User");
		deleteUserbtn.setBounds(235, 82, 132, 25);
		getContentPane().add(deleteUserbtn);

		updateuserBtn = new JButton("Update User");
		updateuserBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		updateuserBtn.setBounds(235, 35, 132, 25);
		getContentPane().add(updateuserBtn);

		viewallBtn = new JButton("View All USer");
		viewallBtn.setBounds(125, 135, 132, 25);
		getContentPane().add(viewallBtn);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addActionEvent();

	}

	void addActionEvent() {
		Addbtn.addActionListener(this);
		searchbtn.addActionListener(this);
		deleteUserbtn.addActionListener(this);
		deleteUserbtn.addActionListener(this);
		viewallBtn.addActionListener(this);

	}

	public static void main(String[] args) {
		homeFrame s = new homeFrame();
		s.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

/*
 * adding action events for all the buttons
 * 
 * */
		if (e.getSource() == Addbtn) {

			AddUser user = null;
			try {
				user = new AddUser();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			user.setVisible(true);

		} else if (e.getSource() == deleteUserbtn) {
			try {
				DeleteUser dlt = new DeleteUser();
				dispose();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if (e.getSource() == searchbtn) {
			try {
				searchUSer dlt = new searchUSer();
				dispose();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		else if (e.getSource() == viewallBtn) {
			try {
				viewAll dlt = new viewAll();
				dlt.setVisible(true);
				dispose();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
}
