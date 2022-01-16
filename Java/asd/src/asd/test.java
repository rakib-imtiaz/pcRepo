package asd;

import java.io.File;
import java.io.IOException;

public class test {
	public static void main(String[] args) throws IOException {
		
		
		File f = new File("./src/NewDir");
		//f.mkdir();
		f.createNewFile();
		//f.mkdir();
		System.out.println(f.getAbsolutePath());
		
	}

}
