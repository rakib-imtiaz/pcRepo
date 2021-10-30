import java.io.*;

public class MovieFileIO_1912488 {

	public static Movie_1912488[] fetchData() throws IOException {

		
		//calculating lines
		BufferedReader reader = new BufferedReader(new FileReader("movie_data.txt"));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		// creating movie object

		Movie_1912488 array[] = new Movie_1912488[lines];

		String stringArray[] = new String[4];

		Movie_1912488 obj = new Movie_1912488();

		// reading file from file

		BufferedReader read = new BufferedReader(new FileReader("movie_data.txt"));

		// storing data in string
		String output;

		for (int i = 0; (output = read.readLine()) != null; i++) {
			stringArray = output.split(",");

			array[i] = new Movie_1912488(stringArray[0], stringArray[1], Integer.parseInt(stringArray[2]),
					stringArray[3]);

		}

		return array;

	}

	public static void writeFile(Movie_1912488 obj[], String filename) throws IOException {

		BufferedWriter write = new BufferedWriter(new FileWriter(filename));

		for (int i = 0; i<obj.length; i++) {
			write.append(obj[i].toString());

		}
		write.close();

	}

}
