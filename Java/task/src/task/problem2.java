package task;


import java.util.Scanner;
public class problem2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n,i=0;
		double x=0,y=0;
		double sum=0,sum1=0,sum2=0,sum3=0;
		double final1=0;
		char ch;
		n=input.nextInt();
		for(i=0;i<n;i++) {
			System.out.println("Enter first number:");
			x=input.nextInt();
			System.out.println("Enter (+,-,*,/):");
			ch=input.next().charAt(0);
			System.out.println("Enter Second number:");
			y=input.nextInt();
			if(ch=='+') {
				sum=x+y;				
				System.out.println(sum);
			}
			else if(ch=='-') {
				sum1=x-y;
				System.out.println(sum1);
			}
			else if(ch=='*') {
				sum2=x*y;
				System.out.println(sum2);
			}
			else if(ch=='/') {
				sum3=x/y;
				System.out.println(sum3);
			}
		}
		final1=sum+sum1+sum2+sum3;
		if(final1>0) {
			System.out.println(final1);
		}
		else {
			final1=final1*-1;
			System.out.println(final1);
		}
		
		
	}

}
