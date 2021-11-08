import java.util.Scanner;

public class password {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter password: ");
	String pass=scan.nextLine();
	
	
	if(validPass(pass)==true)

	{
		
		System.out.println("valid pass");
	}else {
		
		System.out.println("not valid");
	}
	
	
	
	
		
	}
	
	static boolean validPass(String pass)
	{
		

		int digits=0;
		int letter=0;
		int special=0;
		
	//	char[] charArray=pass.toCharArray();
		
		for(int i=0;i<pass.length();i++)
		{
			if(pass.length()>=10)
			{
				if(pass.charAt(i)>='0' && pass.charAt(i)<='9')
				{
					digits++;
				}
				else if((pass.charAt(i)>='A' && pass.charAt(i)<='Z')|| (pass.charAt(i)>='a' && pass.charAt(i)<='z'))
				{
					letter++;
				}
				else {
					
				special++;
				}
			}
			
		}	
		
		if(digits>1 && letter>=2 && special==0)
		{
			
			return true;
			
		}
		else {
			return false;
		}
		
	}

}
