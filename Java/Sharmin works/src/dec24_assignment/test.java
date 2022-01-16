package dec24_assignment;

import java.util.Scanner;


public class test {
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(System.in);
		int age = 0;
		int flag = 0;
		try {
			System.out.println("Enter your age : ");
			age = in.nextInt();

			if (age < 18) {
				flag = 1;

				throw new InvalidAgeException(age);
			}
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		System.out.println("Enter your height (in meter):");
		int height = in.nextInt();

		System.out.println("Enter your weight (kg): ");
		int weight = in.nextInt();

		if (Donor.CalcBMI(height, weight) > 24.9 && Donor.CalcBMI(height, weight) < 18.5) {

			flag = 1;
			throw new InvalidBMIException(Donor.CalcBMI(height, weight));
		}

		System.out.println("Did you donate blood within three month?");
		boolean month = in.hasNext();

		if (month == false) {
			flag = 1;
			throw new InvalidDonationTimeException();
		}

		Donor donor = new Donor(age, weight, height, month);

		if (flag == 0)
			System.out.println("you can donate blood");
		else
			System.out.println("You cant donate blood");

	}

}
