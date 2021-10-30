package addressbook;

import java.io.IOException;

import javax.swing.JOptionPane;

public class searchUSer {
	
	public searchUSer() throws IOException {
		
		 
		
		String email = JOptionPane.showInputDialog(null, "Enter Email to search");
		
		USerBook book = new USerBook();
		book.searchUSer(email);
		
		
		
		

		
		
	}
	
	

}
