import java.util.Scanner;

public class driver {

	public static void main(String[] args) {

		int human_point = 0;

		int ai_point = 0;
		int draw = 0;

		Scanner scan = new Scanner(System.in);

		boolean choose = true;
		do {
			int option = 0;

			display_menu();
			option = scan.nextInt();

			human humanTurn = new human(option);
			AI aiturn = new AI();

			System.out.print("You choose : ");
			choosen(option);

			System.out.print("AI choose  : ");
			choosen(aiturn.option_ret());

			System.out.println("\n\n------------");
			if (humanTurn.isRock() && aiturn.isScissor()) {
				System.out.println("You won");
				human_point++;
			} else if (humanTurn.isRock() && aiturn.isPaper()) {
				System.out.println("AI won");
				ai_point++;
			} else if (humanTurn.isRock() && aiturn.isRock()) {
				System.out.println("DRAW");
				draw++;
			} else if (humanTurn.isPaper() && aiturn.isScissor()) {
				System.out.println("AI won");
				ai_point++;
			} else if (humanTurn.isPaper() && aiturn.isRock()) {
				System.out.println("You won");
				human_point++;
			} else if (humanTurn.isPaper() && aiturn.isPaper()) {
				System.out.println("DRAW");
				draw++;
			} else if (humanTurn.isScissor() && aiturn.isScissor()) {
				System.out.println("DRAW");
				draw++;
			} else if (humanTurn.isScissor() && aiturn.isPaper()) {
				System.out.println("You won");
				human_point++;
			} else if (humanTurn.isScissor() && aiturn.isRock()) {
				System.out.println("AI won");
				ai_point++;
			}
			System.out.println("------------\n\n");
			
			System.out.println("Your Points : "+human_point);
			System.out.println("AI   Point  : "+ai_point);		
			System.out.println("Draw        : "+draw);



			System.out.println("\n\nContinue?\n1.yes\n2.No");

			choose = scan.hasNext();

			choose = scan.hasNext();
			option = scan.nextInt();
			System.out.println("\n\n\n\n");

		}

		while (choose);

	}

	static void display_menu() {

		System.out.println("Your Turn:  ");
		System.out.println("1.Rock. ");
		System.out.println("2.Paper. ");
		System.out.println("3.Scissor.");
		System.out.println("\n\nChoose: ");

	}

	static void choosen(int option) {

		switch (option) {
		case 1:
			System.out.println("Rock");
			break;
		case 2:
			System.out.println("Paper");
			break;
		case 3:
			System.out.println("Scissor");
			break;

		}

	}

}