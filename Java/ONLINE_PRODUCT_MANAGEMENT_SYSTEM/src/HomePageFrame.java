
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;

public class HomePageFrame extends JFrame implements ActionListener {

	private JFrame frame;
	private Container container;
	private JButton start;
	private ImageIcon image;
	private JLabel imageLabel;

	public HomePageFrame() {
		getContentPane().setBackground(SystemColor.text);
		initialise();
	}

	public void initialise() {

		frame = new JFrame();
		// frame.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Online Product Management");
		image = new ImageIcon(getClass().getResource("image.jpg"));

		setBounds(350, 200, image.getIconWidth(), image.getIconHeight());

		Container container = new Container();
		container = this.getContentPane();
		container.setLayout(null);
		start = new JButton("Start  Application");
		start.setBackground(SystemColor.text);
		start.setBounds(572, 12, 154, 39);
		start.setFont(new Font("LM Roman 12", Font.BOLD, 13));

		container.add(start);

		imageLabel = new JLabel(image);
		imageLabel.setBounds(12, -16, image.getIconWidth(), image.getIconHeight());
		container.add(imageLabel);

		addActionListener();
	}

	public void addActionListener() {
		start.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == start) {
			this.dispose();
			LoginPortalFrame s;
			s = new LoginPortalFrame();
			s.setVisible(true);

		}
	}

	public static void main(String[] args) {

		HomePageFrame s = new HomePageFrame();
		s.setVisible(true);

	}

}
