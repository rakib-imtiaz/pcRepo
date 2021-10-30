package Question_1;

import java.util.*;

public class Question_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double weight,lenght,width,height;
	
		
		
		
		for(int i=0;i<3;i++)
		{
		
		System.out.println("Enter the weight and the dimensions of the product: ");
		
		
		weight=scan.nextDouble();
		
		lenght=scan.nextDouble();
		
		width=scan.nextDouble();
		
		height=scan.nextDouble();
		
		getShippingCost(get_volume(lenght, width, height), weight);
		
		System.out.println();
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static double get_volume(double l,double w,double h) {
		
		return l*w*h;
	}
	
	public static void getShippingCost(double volume,double weight) {
		
		if(weight<=8.5 && volume<=500)
		{
			if((weight>=0 && weight<=2) && (volume>=50 && volume<=100))
			{
				System.out.println("The cost to ship this product is BDT. 700");
				
			}
			else if((weight>2 && weight<=4.5) && (volume>100 && volume<=300))
			{
				System.out.println("The cost to ship this product is BDT. 1000");
	
			}
			else if((weight>4.5 && weight<=8.5) && (volume>300 && volume<=500))
			{
				System.out.println("The cost to ship this product is BDT. 2000");
				
			}
			
		}
		
		else if(weight>8.5 && volume<=500)
		{
			System.out.println("The product cannot be delivered due to excess weight.");
		}
		
		else if(weight<=8.5 && volume>=500)
		{
			System.out.println("The product cannot be delivered due to excess volume.");
		}
		else if(weight>=8.5 && volume>=500)
		{
			System.out.println("The product cannot be delivered due to excess volume and wieght");
	
		}
		
	}
	
	
	

}
