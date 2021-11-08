import java.util.Scanner;

public class num1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int row = input.nextInt();

		int flag = 0;
		int i, j;
		for (i = 0; i < row; i++) {

			for (j = 0; j <= i; j++) {

				System.out.printf("%c", flag + 65);
			}
			System.out.println();
		}

	}

}
