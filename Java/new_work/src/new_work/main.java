package new_work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
	public static void main(String[] args) throws Exception {
		
		BufferedWriter writer= new  BufferedWriter(new FileWriter("info.txt"));
		
		ReservedClass std = new ReservedClass("Akib ornob", "AKO", 12,"201","SAC305","11:40AM","21/12/2020");
		
		System.out.println(std);
		writer.append(std.toString());
		
		writer.close();
		
		
	}

}
