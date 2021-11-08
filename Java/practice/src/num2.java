import java.util.Scanner;

public class num2 {
	public static void main(String[] args) {

		System.out.println("Enter character: ");
		
		Scanner input = new Scanner(System.in);

		char character = input.next().charAt(0);
		checkChar(character);

	}

	public static void checkChar(char ch) {
		if (ch >= '0' && ch <= '9') {
			System.out.println("Its a digit");
		} else if (ch >= 'a' && ch <= 'z') {

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println("Its character and vowel");
			}

		}

	}

}
