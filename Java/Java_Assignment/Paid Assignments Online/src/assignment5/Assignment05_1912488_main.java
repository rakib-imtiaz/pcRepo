import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment05_1912488_main {

	public static void main(String[] args) throws IOException {

		ArrayList<Assignment05_1912488_person> personArray = new ArrayList<Assignment05_1912488_person>();

		// Person personArray[] = new Person[100];

		BufferedReader read = new BufferedReader(new FileReader("Data.txt"));

		String outputArray[] = new String[5];

		String output;

		for (int i = 0; read.readLine() != null; i++) {

			output = read.readLine();
			outputArray = output.split(" ");

			Assignment05_1912488_person p = new Assignment05_1912488_person(outputArray[0], outputArray[1], outputArray[2], outputArray[3], outputArray[4]);

			personArray.add(p);
		}

		Assignment05_1912488_person temp;

		Collections.sort(personArray, new Comparator<Assignment05_1912488_person>() {
			/// ascending sort
			public int compare(Assignment05_1912488_person s1, Assignment05_1912488_person s2) {
				return Integer.valueOf(s1.getPassportNumber().compareTo(s2.getPassportNumber()));
			}

		});

		BufferedWriter writer = new BufferedWriter(new FileWriter("SortedByPassport.txt"));

		for (int i = 0; i < personArray.size(); i++) {
			System.out.println(personArray.get(i) + "\n");
			writer.append(personArray.get(i) + "\n");

		}
		writer.close();

		Collections.sort(personArray, new Comparator<Assignment05_1912488_person>() {

			DateFormat df = new SimpleDateFormat("dd-MMM-YYYY");

			public int compare(Assignment05_1912488_person s1, Assignment05_1912488_person s2) {
				try {
					return df.parse(s1.getDate_of_birth()).compareTo(df.parse(s2.getDate_of_birth()));
				} catch (ParseException e) {
				}
				return 0;
			}
		});

		BufferedWriter writer2 = new BufferedWriter(new FileWriter("SortedByDOB.txt"));

		for (int i = 0; i < personArray.size(); i++) {
			System.out.println(personArray.get(i) + "\n");
			writer.append(personArray.get(i) + "\n");

		}
		writer2.close();

	}

}
