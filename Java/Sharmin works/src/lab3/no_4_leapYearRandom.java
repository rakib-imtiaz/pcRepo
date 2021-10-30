package lab3;

public class no_4_leapYearRandom {

	public static void main(String[] args) {

		int min = 1990;
		int max = 2020;

		int range = (max - min) + 1;

		int year = (int) (min + Math.random() * range);

		System.out.print(year);

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {

			System.out.println(": True");
		} else {

			System.out.println(":  False");
		}

	}

}
