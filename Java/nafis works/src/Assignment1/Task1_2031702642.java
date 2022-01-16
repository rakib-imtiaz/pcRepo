package Assignment1;

public class Task1_2031702642 {

	public static void main(String[] args) {

		int sumOFmarks=0,weeklyMarks[][] = { { 99, 42, 74, 83 }, { 57, 81, 69, 67 }, { 88, 61, 79, 84 }, { 93, 75, 78, 87 } };

		for (int i = 0; i < weeklyMarks.length; i++) {
			for (int j = 0; j < weeklyMarks.length; j++) {
				sumOFmarks = sumOFmarks + weeklyMarks[i][j];

			}

		}
		
		System.out.println("\nWeekly marks: \n\n");
		for (int i = 0; i < weeklyMarks.length; i++) {
			for (int j = 0; j < weeklyMarks.length; j++) {
				System.out.print(weeklyMarks[i][j]+"  ");
				
			}
			System.out.println();
		}

		double avg = sumOFmarks / (double) weeklyMarks.length;

		System.out.print("\n\nClass Total : ");
		System.out.println(sumOFmarks);

		System.out.print("Class Average : ");
		System.out.println(avg);

	}

}
