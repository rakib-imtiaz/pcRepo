package addressbook;

import java.awt.Frame;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class viewAll extends JFrame{

	public viewAll() throws IOException {

		Frame f = new Frame();
		f.setBounds(12, 12, 416, 246);
		f.setResizable(false);
		

		getContentPane().setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 12, 603, 246);
		getContentPane().add(textArea);
		
		USerBook book = new USerBook();
		book.fetchFileData();
		
		
		for(int i=0;i<book.userlist.size();i++)
		{
			//String name= book.userlist.toString()
			textArea.setText( book.userlist.get(i).toString());
		}
	}

}
