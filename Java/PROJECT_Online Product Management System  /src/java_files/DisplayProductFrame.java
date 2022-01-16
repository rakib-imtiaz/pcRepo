package java_files;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DisplayProductFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private Container container;
	private JTable table;
	private JButton editBtn, goBackBtn;
	private JScrollPane scrollpane;

	public DisplayProductFrame() {

		initComponents();
	}

	void initComponents() {
		frame = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login Portal");
		setBounds(600, 300, 485, 342);

		Container container = new Container();
		container = this.getContentPane();
		container.setLayout(null);

		String[] columnsNames = { "Product ID", "Product Name", "Product Price", "Quantity", "Availability" };

		String[][] rowData = { { "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" }, { "1245", "Onion", "1200", "15", "true" },
				{ "1245", "Onion", "1200", "15", "true" } };

		table = new JTable(rowData, columnsNames);
		// table.setEnabled(false);
		table.setSelectionBackground(Color.cyan);

		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(12, 0, 461, 305);
		container.add(scrollpane);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		DisplayProductFrame s = new DisplayProductFrame();
		s.setVisible(true);
	}

}
