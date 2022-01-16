package finals;

import java.io.FileInputStream;
import java.util.Scanner;

public class Driver {
	public static void makeList(Residents[] resList) {
		System.out.println("The list of residents :");
		for (int i = 0; i < resList.length; i++) {
			int age = resList[i].getAge();
			if (age >= 65 || resList[i].getSalary() <= 350000) 
																
				System.out.println(resList[i]);
		}
	}

	public static void main(String at[]) throws Exception {
		try {
			FileInputStream fs = new FileInputStream("residents.txt"); 
			Scanner R = new Scanner(fs);
			int count = 0;
			while (R.hasNextLine()) {		count++;
				R.nextLine();
			}
			R.close();
			Residents[] residentList = new Residents[count]; 
			fs = new FileInputStream("residents.txt");
			R = new Scanner(fs);
			count = 0;
			while (R.hasNextLine()) { 
				String data[] = R.nextLine().split(",");
				Residents temp = new Residents(data[0], data[1], Double.parseDouble(data[2])); 
																								
																								
																								
				residentList[count] = temp;
				count++;
			}
			R.close();

			makeList(residentList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}