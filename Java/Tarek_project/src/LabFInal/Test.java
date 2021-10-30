package LabFInal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	//1822172642
	public static void main(String[] args) throws IOException {
		
		
		Fruit apple[] = new Apple[7];
		
		apple[0]= new Apple("Red",1900,"123.0");
		apple[1]= new Apple("Red",211,"2341");
		apple[2]= new Apple("Red",224,"1131");
		apple[3]= new Apple("Red",553,"323");
		apple[4]= new Apple("Red",535,"232");
		apple[5]= new Apple("Red",353,"323");
		apple[6]= new Apple("Red",535,"12323.0");
		
		
		Fruit orangearr[] = new Orange[7];

		
		orangearr[0]= new Orange("Orange",1200,"1250.1");
		orangearr[1]= new Orange("Orange",122,"1250.12");
		orangearr[2]= new Orange("Orange",221,"1250.1213");
		
			
		for(int i=0;i<6;i++)
		{
			
			System.out.println(apple[i].equals(apple[i+1]));
			System.out.println(apple[i].toString());
			
			
		}
		for(int i=0;i<6;i++)
		{
			
			System.out.println(orangearr[i].equals(orangearr[i+1]));
			System.out.println(orangearr[i].toString());
			
			
		}
	
		File file = new File("Food.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		for(int i=0;i<6;i++)
		{
			
			writer.append(apple[i].toString());
			writer.append(orangearr[i].toString());
			
			
		}
		writer.close();


		
		
		
	}

}
