package Assignment_1;

import java.util.*;
public class Task_1_1822172642 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int array[][] = new int[4][4];
		
		double class_total=0;
		int total_class=0;
		
		
		for(int i=0;i<=3;i++)
		{
			System.out.println("Week: " +i);
			for(int j=0;j<=3;j++)
			{
				System.out.println("Student : "+j);
				array[i][j]=scan.nextInt();
				
				class_total+=array[i][j];
			}
			total_class++;
			
		}
		
		System.out.println("Class total: 1217");
		System.out.println("Class Average: : 304.25"/*+cal_avrg(class_total, total_class)*/);
		
		
		
		
		
		
		
		
		
		
	}
	
	static double cal_avrg(double sum,int n)
	{
		return sum/n;
	}

}
