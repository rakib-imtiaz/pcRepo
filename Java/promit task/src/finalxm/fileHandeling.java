package finalxm;

import java.io.*;

public class fileHandeling {
	
	public static void main(String[] args) throws IOException {
		
		
		File newfile1 = new File("File1.txt");
		BufferedReader reader = new BufferedReader(new FileReader(newfile1) );

		File newFile2 = new File("File2.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(newFile2) );
		
		
		String fetchedData;
		int total=0;
		
		while((fetchedData = reader.readLine()) != null) {
			
			String data[]= fetchedData.split(",");
			
			total=0;
			for( int i=0;i<data.length;i++)
			{
				total=total+Integer.parseInt(data[i]);
				
			}
			
			writer.append("Average of data "+total);
			
		}
		
		writer.close();
		reader.close();
		
		
		
		
	}

}
