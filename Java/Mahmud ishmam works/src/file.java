import java.io.*;

public class file {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("Numbers.txt");
		File file2 = new File("output.txt");
		BufferedReader read = new BufferedReader(new FileReader(file));		
		BufferedWriter write = new BufferedWriter(new FileWriter(file2));		
		
		String val;
		String[] temp;
		int i=0;
		while((val=read.readLine())!=null)
		{
			temp=val.split("-");
			
			if(temp.length>4)
			{
				
				write.append(temp.toString());
				
			}
		}
		
		write.close();
		read.close();
		
	}

}
