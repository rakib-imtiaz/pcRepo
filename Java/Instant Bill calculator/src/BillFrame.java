import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BillFrame extends JFrame implements ActionListener {

	Frame frame;
	Container container;
	private JTextField quantity;

	public BillFrame() {

		init();

	}

	void init() {

		frame = new JFrame();
		container = new Container();

		frame.setBounds(600, 150, 350, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);


		getContentPane().setLayout(null);

		JButton btnAddItem = new JButton("Add item");
		btnAddItem.setBounds(321, 226, 117, 25);
		getContentPane().add(btnAddItem);

		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.setBounds(22, 226, 117, 25);
		getContentPane().add(btnDeleteItem);

		JTextPane txtpnItem = new JTextPane();
		txtpnItem.setText("item 1: ");
		txtpnItem.setBounds(39, 12, 70, 21);
		getContentPane().add(txtpnItem);

		quantity = new JTextField();
		quantity.setBounds(164, 12, 59, 19);
		getContentPane().add(quantity);
		quantity.setColumns(10);
		this.getContentPane().add(container);


	}

	public static void main(String[] args) {

		BillFrame b = new BillFrame();

	}

	void actionListner() {

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
