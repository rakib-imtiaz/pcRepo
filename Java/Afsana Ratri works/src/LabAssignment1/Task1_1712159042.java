package LabAssignment1;

public class Task1_1712159042 {

	public static void main(String[] args) {

		int array[][] = { 
				{ 99, 42, 74, 83 },
				{ 57, 81, 69, 67 }, 
				{ 88, 61, 79, 84 },
				{ 93, 75, 78, 87 } };

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				sum = sum + array[i][j];

			}

		}

		double avrg = sum / (double) array.length;

		System.out.print("Class Total : ");
		System.out.println(sum);

		System.out.print("Class Average : ");
		System.out.println(avrg);

	}

}
