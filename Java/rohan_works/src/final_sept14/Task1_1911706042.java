package final_sept14;

import java.util.Scanner;

public class Task1_1911706042 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=scan.nextInt();
		
		
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1.0/Math.sqrt(i));
		}
		
		System.out.println(sum);
		
		
		
	}

}
