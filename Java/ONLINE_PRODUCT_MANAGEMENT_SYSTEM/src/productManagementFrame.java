
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;

public class productManagementFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private JButton addbtn, editbtn, deletebtn, goBackbtn, displayBtn;
	private Container container;

	public productManagementFrame() {
		getContentPane().setBackground(SystemColor.textInactiveText);
		initComponents();

	}

	void initComponents() {

		this.frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		this.setBounds(550, 150, 310, 321);
		this.setTitle("Product Management");
		frame.setResizable(false);

		container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		addbtn = new JButton("Add Product");
		addbtn.setBounds(79, 12, 154, 39);

		container.add(addbtn);

		editbtn = new JButton("Edit Product");
		editbtn.setBounds(79, 114, 154, 39);
		container.add(editbtn);

		deletebtn = new JButton("Delete Product");
		deletebtn.setBounds(79, 63, 154, 39);

		container.add(deletebtn);

		goBackbtn = new JButton("Go Back");
		goBackbtn.setBounds(115, 220, 90, 39);
		container.add(goBackbtn);

		displayBtn = new JButton("Display Product");
		displayBtn.setBounds(79, 165, 154, 39);
		getContentPane().add(displayBtn);
		addActionListner();

	}

	public static void main(String[] args) {
		productManagementFrame f = new productManagementFrame();
		f.setVisible(true);

	}

	void addActionListner() {
		addbtn.addActionListener(this);
		editbtn.addActionListener(this);
		deletebtn.addActionListener(this);
		goBackbtn.addActionListener(this);
		displayBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addbtn) {
			this.dispose();
			String productID = JOptionPane.showInputDialog(null, "Enter Product ID :", "Product Information",
					JOptionPane.PLAIN_MESSAGE);

			String productName = JOptionPane.showInputDialog(null, "Enter Product Name :", "Product Information",
					JOptionPane.PLAIN_MESSAGE);

			String productPrice = JOptionPane.showInputDialog(null, "Price per Unit :", "Product Information",
					JOptionPane.PLAIN_MESSAGE);

			String quantity = JOptionPane.showInputDialog(null, "Unit/Quantity", "Product Information",
					JOptionPane.PLAIN_MESSAGE);

			Product product = new Product(Integer.parseInt(productID), productName, Double.parseDouble(productPrice),
					Double.parseDouble(quantity), true);

			try {
				productManagement p = new productManagement();
				p.addProduct(product);
				p.saveData();
				JOptionPane.showMessageDialog(null, "Product addedd successully");
				this.dispose();
				productManagementFrame a = new productManagementFrame();
				a.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getSource() == editbtn) {

			String targetProductId = JOptionPane.showInputDialog(null, "Enter product id to Edit");
			productManagement manageproduct;
			try {
				manageproduct = new productManagement();
				manageproduct.fetchDataFromFile();
				if (!manageproduct.Search(Integer.parseInt(targetProductId))) {
					JOptionPane.showMessageDialog(null, "Product Not Found", "", JOptionPane.WARNING_MESSAGE);
					this.dispose();
					productManagementFrame a = new productManagementFrame();
					a.setVisible(true);

				} else {

					JOptionPane.showMessageDialog(null, "Product found!", "Success", JOptionPane.INFORMATION_MESSAGE);

					int productID = Integer.parseInt(targetProductId);
					String productName = JOptionPane.showInputDialog(null, "Enter Product Name to change :",
							"Product Information", JOptionPane.PLAIN_MESSAGE);

					String productPrice = JOptionPane.showInputDialog(null, "Price per Unit :", "Product Information",
							JOptionPane.PLAIN_MESSAGE);

					String quantity = JOptionPane.showInputDialog(null, "Unit/Quantity", "Product Information",
							JOptionPane.PLAIN_MESSAGE);

					Product product = new Product(productID, productName, Double.parseDouble(productPrice),
							Double.parseDouble(quantity), true);
					manageproduct.Edit(productID, product);
					manageproduct.saveData();
					JOptionPane.showMessageDialog(null, "product Details Modified SuccessFully", "Success",
							JOptionPane.INFORMATION_MESSAGE);

				}

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if (e.getSource() == displayBtn) {

			this.dispose();
			DisplayProductFrame d;
			try {

				productManagement a = new productManagement();
				a.fetchDataFromFile();

				d = new DisplayProductFrame(a.productList);
				d.setVisible(true);

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (e.getSource() == goBackbtn) {
			this.dispose();
			AdminPortalFrame a = new AdminPortalFrame();
			a.setVisible(true);

		} else if (e.getSource() == deletebtn) {

			String targetProductId = JOptionPane.showInputDialog(null, "Enter product id to Delete");
			productManagement manageproduct;
			try {
				manageproduct = new productManagement();
				manageproduct.fetchDataFromFile();
				if (!manageproduct.Search(Integer.parseInt(targetProductId))) {
					JOptionPane.showMessageDialog(null, "Product Not Found", "", JOptionPane.WARNING_MESSAGE);
					this.dispose();
					productManagementFrame a = new productManagementFrame();
					a.setVisible(true);

				} else {

					JOptionPane.showMessageDialog(null, "Product found!", "Success", JOptionPane.INFORMATION_MESSAGE);

					Product product = new Product();

					manageproduct.delete(Integer.parseInt(targetProductId));
					manageproduct.saveData();
					JOptionPane.showMessageDialog(null, "product Deleted SuccessFully", "Success",
							JOptionPane.INFORMATION_MESSAGE);

				}

			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
}
