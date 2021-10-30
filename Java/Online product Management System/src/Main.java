import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		fileInit();
		HomePage page = new HomePage();
				
	}
	
	static void fileInit() throws IOException
	{
		File file = new File("AllGoodsInfo.txt");
		file.createNewFile();
		
	}
	
	

}
