import java.util.Scanner;

public class main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int dimension = 0;


		dimension = scan.nextInt();
		
		int[][] array = new int[dimension][dimension];  

		input_array(array, dimension);

		int is_safe = print_safe_or_unsafe(array, dimension);

		if (is_safe == 1) {
			System.out.println("SAFE");
		}

		else {
			System.out.println("UNSAFE");
		}

	}

	static void input_array(int array[][], int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				 array[i][j] = scan.nextInt();
			}
		}
	}

	static int print_safe_or_unsafe(int array[][], int dimension) {
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				if ((array[i][j] == array[i][j + 1] || array[i][j] == array[i][j - 1]) && array[i][j] == 1) {
					return 0;

				} else if ((array[i][j] == array[i - 1][j] || array[i][j] == array[i + 1][j]) && array[i][j] == 1) {
					return 0;
				}

				else {
					continue;
				}
			}
		}
		return 1;
	}
}