
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

public class DisplayProductFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private Container container;
	private JTable table;
	private JButton editBtn, gobackbtn;
	private JScrollPane scrollpane;
	ArrayList<Product> productList = new ArrayList<Product>();

	DisplayProductFrame(ArrayList<Product> productList) throws IOException {

		this.productList = productList;

		if (productList.size() == 0) {
			JOptionPane.showMessageDialog(null, "No data found please add some Product", "Error",
					JOptionPane.WARNING_MESSAGE);
			productManagementFrame aa = new productManagementFrame();
			aa.setVisible(true);
			this.dispose();
		} else {
			initComponents();
		}
	}

	public DisplayProductFrame() throws IOException {
		getContentPane().setLayout(null);

		JButton button = new JButton("New button");
		button.setBounds(333, 393, 117, 25);
		getContentPane().add(button);

		if (productList.size() == 0) {
			JOptionPane.showMessageDialog(null, "No data found please add some Product", "Error",
					JOptionPane.WARNING_MESSAGE);
			productManagementFrame aa = new productManagementFrame();
			aa.setVisible(true);
			this.dispose();
		} else {
			initComponents();
		}
	}

	void initComponents() throws IOException {
		frame = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Display products");
		setBounds(600, 300, 600, 400);

		Container container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		String[] columnsNames = { "Product ID", "Product Name", "Product Price", "Quantity", "Availability" };

		productManagement a = new productManagement();
		productList = a.getData();

		String rowdata[][] = new String[productList.size()][columnsNames.length];

		for (int i = 0; i < productList.size(); i++) {

			rowdata[i] = productList.get(i).toString().split(",");

		}
		table = new JTable(rowdata, columnsNames);
		// table.setEnabled(false);
		table.setSelectionBackground(Color.cyan);
		gobackbtn = new JButton("Go back");
		gobackbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == gobackbtn) {
					dispose();
					productManagementFrame a = new productManagementFrame();
					a.setVisible(true);

				}

			}
		});
		gobackbtn.setForeground(Color.WHITE);
		gobackbtn.setBackground(Color.DARK_GRAY);
		container.add(gobackbtn);

		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(12, 0, 461, 305);
		container.add(scrollpane);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws IOException {

		DisplayProductFrame s = new DisplayProductFrame();
		s.setVisible(true);
	}
}
