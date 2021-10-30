import java.io.*;
import java.util.Scanner;


public class main {

	static double   prices[] = { 10.00, 5.00, 10.00, 1.50, 7.50, 4.00, 15.00 };

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {


		double total_price = 0;

		boolean countinue = true;

		while (countinue) {
			menu();

			int index = order();
			int quan = quantity();

			
			switch(index+1)
			{
			case 1:
			{
				items.Burger+=quan;
				break;
			}
			case 2:
			{
				items.Dirnks+=quan;
				break;
			}
			case 3:
			{
				items.hot_dogs+=quan;
				break;
			}case 4:
			{
				items.fries+=quan;
				break;
			}case 5:
			{
				items.pizza+=quan;
				break;
			}case 6:
			{
				items.ice_cream+=quan;
				break;
			}case 7:
			{
				items.chicken+=quan;
				break;
			}
			
			
			
			}

			total_price += prices[index] * quan;
			System.out.println("Order more?\n1.yes\n2.No");
			int opt = scan.nextInt();
			System.out.println("Total price: "+total_price+"\n\n");

			countinue = opt == 1 ? true : false;

		}
		countinue=true;
		while (countinue) {

		System.out.println("1.View invoice\n2.Print invoice\n3.EXIT");
		int opt = scan.nextInt();
		if(opt==1) {
			invoice();
			
		}
		else if(opt==2)
		{
			print_invoice();
			System.out.println("Invoice Created successfully");
		}
		else {
			
			countinue=false;
		}

		}
		

	}

	
	
	
	static void menu() {

		System.out.println("1.Burger           10.00");
		System.out.println("2.Drinks            5.00");
		System.out.println("3.Hot Dogs         10.00");
		System.out.println("4.fries             1.50");
		System.out.println("5.pizza             7.50");
		System.out.println("6.Ice cream         4.00");
		System.out.println("7.chicken          15.00");

	}

	static int order() {

		System.out.println("Which item you want to order?");
		int option = scan.nextInt();

		return option - 1;

	}

	static int quantity() {

		System.out.println("how many you want to order?");
		int option = scan.nextInt();

		return option ;

	}
	
	static void invoice()
	{

		
		double total_price;
		if(items.Burger>0)
		{
			System.out.println("Burgers : "+items.Burger+" = "+prices[0]*items.Burger);
			
		}
		if(items.Dirnks>0)
		{
			System.out.println("Dirnks : "+items.Dirnks+" = "+prices[1]*items.Dirnks);
			
		}
		if(items.hot_dogs>0)
		{
			System.out.println("Hot dogs : "+items.hot_dogs+" = "+prices[2]*items.hot_dogs);
			
		}
		if(items.fries>0)
		{
			System.out.println("fries : "+items.fries+" = "+prices[3]*items.fries);
			
		}
		if(items.pizza>0)
		{
			System.out.println("pizza : "+items.pizza+" = "+prices[4]*items.pizza);
			
		}
		if(items.ice_cream>0)
		{
			System.out.println("ice_cream : "+items.ice_cream+" = "+prices[5]*items.ice_cream);
			
		}
		if(items.chicken>0)
		{
			System.out.println("chicken : "+items.chicken+" = "+prices[6]*items.chicken);
			
		}
		
		 total_price=prices[0]*items.Burger+prices[1]*items.Dirnks+prices[2]*items.hot_dogs+prices[3]*items.fries+prices[4]*items.pizza+prices[5]*items.ice_cream+prices[6]*items.chicken;
	
		System.out.println("----------------------------------------------------------------");
	System.out.println("Your Total price: "+total_price);
	
		
		
	}

	
	
	static void print_invoice() throws IOException
	{

		BufferedWriter writer = new BufferedWriter(new FileWriter("Invoice.txt"));
	
		if(items.Burger>0)
		{
			writer.append("Burgers		: "+items.Burger+"= "+prices[0]*items.Burger+"\n");
			
		}
		if(items.Dirnks>0)
		{
			writer.append("Dirnks		: "+items.Dirnks+"= "+prices[1]*items.Dirnks+"\n");
			
		}
		if(items.hot_dogs>0)
		{
			writer.append("Hot dogs		: "+items.hot_dogs+"= "+prices[2]*items.hot_dogs+"\n");
			
		}
		if(items.fries>0)
		{
			writer.append("fries		: "+items.fries+"= "+prices[3]*items.fries+"\n");
			
		}
		if(items.pizza>0)
		{
			writer.append("pizza		: "+items.pizza+"= "+prices[4]*items.pizza+"\n");
			
		}
		if(items.ice_cream>0)
		{
			writer.append("ice_cream	: "+items.ice_cream+"= "+prices[5]*items.ice_cream+"\n");
			
		}
		if(items.chicken>0)
		{
			writer.append("chicken		: "+items.chicken+"= "+prices[6]*items.chicken+"\n");
			
		}
		
	
		writer.append("----------------------------------------------------------------"+"\n");
		    //writer.append("Your Total price		: "+total_price);

writer.close();	
		
		
	}

}



