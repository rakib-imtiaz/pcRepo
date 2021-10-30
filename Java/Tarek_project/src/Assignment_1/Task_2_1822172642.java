package Assignment_1;

import java.util.*;
public class Task_2_1822172642 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		boolean array[][] = new boolean[5][5];
		
		System.out.println("Please enter Boolean values for the indices: ");
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				array[i][j]=scan.nextBoolean();
				
			}
			
		}
		
		System.out.println("The array you entered: ");
		System.out.println("   0  1  2  3  4 ");
		for(int i=0;i<5;i++)
		{
			System.out.print(i);
			for(int j=0;j<5;j++)
			{
				if(array[i][j]==true)
				{
					System.out.print("| *");

				}
				else
					System.out.print("|  ");


				
			}
			System.out.println();
			
		}
		System.out.println("------------------");
		
		System.out.println("Number of pair of friends: "+pair_counter(array));
		
	
		
		
		
		
		
	}
	
	static int pair_counter(boolean arr[][])
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]==true && i!=j)
				{
				count++;	
				}

				}
				
				
			}
		return count-1;
	}
		
		
		

}
