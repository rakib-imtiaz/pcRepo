package mida;
import java.util.Scanner;
public class task1_1911706042 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0;
		int n;
		n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum+=1/i;
		}
		System.out.println(sum);

	}

}