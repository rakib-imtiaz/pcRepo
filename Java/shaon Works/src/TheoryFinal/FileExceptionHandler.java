package TheoryFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExceptionHandler {
	
	public static void main(String[] args) {
		

		File file = new File("Students.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("The file "+file.getName()+"Not exits");
		}
	
		
	}
	
}
