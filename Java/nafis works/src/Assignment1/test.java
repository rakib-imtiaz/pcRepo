public class Task1_2021037642 {

	public static void main(String[] args) {

		int m[][] = { { 99, 42, 74, 83 }, { 57, 81, 69, 67 }, { 88, 61, 79, 84 }, { 93, 75, 78, 87 } };

		int totalMarks = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				totalMarks = totalMarks + m[i][j];

			}

		}

		double r = totalMarks / (double) m.length;

		System.out.println("Class Total : " + totalMarks);

		System.out.println("Class Average : " + r);

	}

}