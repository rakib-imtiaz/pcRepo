import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class player extends JFrame implements ActionListener {

	JFrame frame;
	JPanel panel;
	Container container;

	public player() {

		init();

	}
	public player(int name) {

		this()
		init();

	}



	void init() {
		this.frame = new JFrame();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.frame.setBounds(600, 150, 300, 400);
		this.frame.setVisible(true);

		this.panel = new JPanel();

		container.add(frame);

	}

	void addActionListener() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
