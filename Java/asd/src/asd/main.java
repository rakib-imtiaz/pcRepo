package asd;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		
		int weekDay, nextDay;

		System.out.println("Enter todays date: ");
		weekDay = input.nextInt();

		System.out.println("Enter the number of days elapsed day since today: ");
		nextDay = input.nextInt();
		
		nextDay=nextDay+weekDay;
		
		String firstDayName=getDayName(weekDay);
		String secondDayName=getDayName(nextDay);
		
		System.out.println("Today is " +firstDayName+ " and the future day is  "+secondDayName);
		
		
		

		
		
	}
	
	static String getDayName(int weekDay)
	{
		
		String dayName = null;
		
		if (weekDay == 0) {
			dayName = "Sunday";
			//System.out.println("Sunday");
		}

		else if (weekDay == 1) {

			dayName = "Monday";
			//System.out.println("Monday");
		}

		else if (weekDay == 2) {

			dayName = "Tuesday";
			//System.out.println("Tuesday");
		} else if (weekDay == 3) {

			dayName = "Wednesday";
			//System.out.println("Wednesday");
		} else if (weekDay == 4) {
			dayName = "Thursday";
			//System.out.println("Thursday");
		} else if (weekDay == 5) {
			dayName = "Firday";

			//System.out.println("Firday");
		} else if (weekDay == 6) {
			dayName = "Saturday";

			//System.out.println("Saturday");
		}
		
		
		return dayName;
		
		
	}
	
	
	
	

}
