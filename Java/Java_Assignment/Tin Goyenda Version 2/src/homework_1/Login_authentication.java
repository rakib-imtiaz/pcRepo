package homework_1;

import java.util.Scanner;

public class Login_authentication {

	static final String id = "sakib";
	static final String password = "12345";
	static int loggingAttempt=3;

	private String loggedId;
	private String loggedPassword;
	Scanner scan = new Scanner(System.in);

	public Login_authentication() {
		
		boolean key=true;
		
	while(key)
	{
		System.out.println("\nEnter ID :");
		loggedId=scan.nextLine();
		System.out.println("Password :");
		
		loggingAttempt--;

		loggedPassword=scan.nextLine();
		
		if(loggedId.equals(id) && loggedPassword.equals(password))
		{
			key=false;
			AdminPanel admin = new AdminPanel();
			
			
			
			
			
		}
		else {
			
			if(loggingAttempt!=0)
			{
				System.out.println("Invalid Credentials");
				System.out.println("Try again");
				System.out.println("");
				System.out.println("Attempt left:"+loggingAttempt);
				continue;
				
			}
			else {
				
				System.out.println("Too many attempts!!");
				System.exit(1);
				key=false;

				break;
				
			}
			
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public String getLoggedId() {
		return loggedId;
	}

	public void setLoggedId(String loggedId) {
		this.loggedId = loggedId;
	}

	public String getLoggedPassword() {
		return loggedPassword;
	}

	public void setLoggedPassword(String loggedPassword) {
		this.loggedPassword = loggedPassword;
	}

}
