import java.io.*;
import java.util.Arrays;
import java.util.*;

public class main_1912488 {
	public static void main(String[] args) throws IOException {

		Movie_1912488[] movieArray = MovieFileIO_1912488.fetchData();
		
		Movie_1912488[] newmovieArray = MovieFileIO_1912488.fetchData();

		for (int i = 0; i<movieArray.length; i++) {
			System.out.println("Name : " + movieArray[i].getMovie_name());
			System.out.println("Genre : " + movieArray[i].getGenre());
			System.out.println("Rating : " + movieArray[i].getRating());
			System.out.println();

		}
		
		
		
		Arrays.sort(movieArray);
		System.out.println("\n\nAfter sorting: \n\n");

		for (int i = 0; i<movieArray.length; i++) {
			System.out.println("Name : " + movieArray[i].getMovie_name());
			System.out.println("Genre : " + movieArray[i].getGenre());
			System.out.println("Rating : " + movieArray[i].getRating());
			System.out.println();

		}
		
		
		MovieFileIO_1912488.writeFile(movieArray, "sorted_movies.txt");
		
		
		
		


	}

}
