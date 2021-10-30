package mid;

import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceDemo {
	public static void main(String[] args) {
		
		ArrayList<Purchase> purchaseList= new ArrayList();
		
		Scanner scan = new Scanner (System.in);
		
		
		
		 
		 Purchase purchase;
		 
		 double average=0;
		 
		 double summation=0
				 ;
		for(int i=0;i<20;i++)
		{
			 String transactionID;
			 String customerID;
			 String productID;
			 double priceOfProduct; 
			 
			System.out.println("Transactipn id: ");
			transactionID=scan.nextLine();
			
				System.out.println("Customer id: ");
				customerID=scan.nextLine();
			
				System.out.println("product id: ");
				productID=scan.nextLine();
				
				System.out.println("price of product  ");
				priceOfProduct=scan.nextDouble();
				 purchase = new Purchase(transactionID,customerID,productID,priceOfProduct);
				
			purchaseList.add(purchase);
			
			summation=summation+purchaseList.get(i).getPriceOfProduct();
				
				
			
		}
		
		
		
		
		System.out.println("price average : "+summation/purchaseList.size());
		
		
		
		
		
		
	}

}
