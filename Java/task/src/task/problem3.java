package task;

import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x,y;
		int a,b;
		System.out.println("Enter row number of first matrix:");
		x=input.nextInt();
		System.out.println("Enter column number of first matrix:");
		y=input.nextInt();
		System.out.println("Enter row number of second matrix:");
		a=input.nextInt();
		System.out.println("Enter column number of second matrix:");
		b=input.nextInt();
		int arr[][]=new int[x][y];
		int brr[][]=new int[a][b];
		int sum=0;
		int i=0,j=0;
		if(x==a && y==b) {
			for(i=0;i<x;i++) {
				for(j=0;j<y;j++) {
					arr[i][j]=input.nextInt();
				}
			}
			for(i=0;i<a;i++) {
				for(j=0;j<b;j++) {
					brr[i][j]=input.nextInt();
				}
			}
			for(i=0;i<x;i++) {
				for(j=0;j<y;j++) {
					sum=0;
					sum=arr[i][j]+brr[i][j];
					System.out.printf(" %d ", sum);
				}
				System.out.println();
			}
		}
		else {
			System.out.println("I tried, but could not add them");
		}
		
		
	}

}
