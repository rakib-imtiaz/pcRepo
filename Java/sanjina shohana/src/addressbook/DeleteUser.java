package addressbook;

import java.io.IOException;

import javax.swing.JOptionPane;

public class DeleteUser {
	
	public DeleteUser() throws IOException {
		
		 
		/*
		 * entering the email, the email will be passed into the userBook classes method
		 * called deleteuser and passed the email as method argument
		 * 
		 * */
		String email = JOptionPane.showInputDialog(null, "Enter Email to Delete");
		
		USerBook book = new USerBook();
		book.deleteUser(email);
		
		
		

		
		
	}
	
	

}
