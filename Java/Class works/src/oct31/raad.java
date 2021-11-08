
import java.util.Scanner;

public class raad {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double summation = 0;
		for (int i = 1; i < n; i++) {

			summation = summation - Math.pow(i, 2);

		}
		for (int i = 2; i < n; i++) {

			summation = summation + Math.pow(i, 2);

		}

	}

}
