package PaymentSlipGenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class paymentSlip {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		int startingHour = 0;
		int startingMinute = 0;
		
		int endingHour=0;
		int endingMinute=0;
		
		LocalTime startLocalTime,endLocalTime,DifferenceOfLocalTime;
		
		System.out.println("Enter starting time  : ");
		System.out.println("Hour: ");
		startingHour=scan.nextInt();
		System.out.println("Minute: ");
		startingMinute=scan.nextInt();
		
		System.out.println();
		
		System.out.println("Enter ending time  : ");
		System.out.println("Hour: ");
		endingHour=scan.nextInt();
		
		if(endingHour<startingHour)
		{
			endingHour=endingHour+12;
		}
		System.out.println("Minute: ");
		endingMinute=scan.nextInt();
		
		
		
		startLocalTime=LocalTime.of(startingHour, startingMinute);
		endLocalTime=LocalTime.of(endingHour, endingMinute);
		
		
		Duration duration =Duration.between(startLocalTime,endLocalTime);
		
		double charge=Math.round((duration.getSeconds()/60.00)*5.83);
		
		System.out.println(LocalDate.now());
		System.out.println("Duration : "+duration.getSeconds()/60.00+" min");
		System.out.println("Charge   : "+charge+"tk/=");
		System.out.println("\n\nprint it ?\n1.yes\n2.No");
		
		String date2=LocalDate.now().toString();
		String date=LocalDate.now().toString()+"__"+LocalTime.now();
		
		int option=scan.nextInt();
		if(option==1)
		{
			File file = new File(date+"_slip.txt");
				
		//	BufferedReader reader = new BufferedReader(new FileReader(file));
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.append("------------------------------------------------");
			writer.append("\nDate                : "+date2);
			writer.append("\nstarting time       : "+startLocalTime);
			writer.append("\nEnding time         : "+endLocalTime);
			writer.append("\n\n\nAmount              : "+charge+"/=");
			writer.append("\n------------------------------------------------");

			writer.close();
			
			System.out.println("Successfull!");
			
		}
		else {
			
			
		}
		
		
		
		
		
		
		
		
		
	}
	

}
