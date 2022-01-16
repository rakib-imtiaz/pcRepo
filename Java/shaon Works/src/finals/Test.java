package finals;

import java.util.Scanner;

public class Test {
	
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println(" enter the price ");
	        double price = input.nextDouble();
	        
	        System.out.println(" enter the phone number ");
	        int number = input.nextInt();
	        
	        
	        System.out.println(" enter the email");
	        String email = input.next();
	        SmartPhone smartphon1 = new SmartPhone(price,number);
	        SmartPhone smartphone2 = new SmartPhone(price,number);
	       Laptop laptop1 = new Laptop(price,email);
	       Laptop l2 = new Laptop(price,email);
	       
	        System.out.println(smartphon1.toString());
	        System.out.println(smartphone2.toString());
	        System.out.println(laptop1.toString());
	        System.out.println(l2.toString());
	        
	                
	    }

}
