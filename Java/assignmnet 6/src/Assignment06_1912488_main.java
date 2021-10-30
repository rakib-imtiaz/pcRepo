import java.io.*;
import java.util.*;


public class Assignment06_1912488_main {

	public static void main(String[] args) throws IOException {

	/*
	 * 
	 * Here we used array for creating person object,using person constructor
	 * 
	 * */
		ArrayList<Assignment06_1912488_Person> personArray = new ArrayList<Assignment06_1912488_Person>();


		/*
		 * Buffred reader for reading file
		 * 	
		 */
		BufferedReader read = new BufferedReader(new FileReader("Data.txt"));

		String outputArray[] = new String[5];

		String output;
		
		//creting hashmap for storing nid and passport
		
	    HashMap<String, String> map = new HashMap<String, String>();

		//splting the string into string array and stored them into
	    //person list

		for (int i=0;(output = read.readLine())!=null;i++) {
			
			outputArray = output.split(" ");

			Assignment06_1912488_Person p = new Assignment06_1912488_Person(outputArray[0], outputArray[1], outputArray[2], outputArray[3], outputArray[4]);
//adding person in array list
			personArray.add(p);
			
			//
			map.put(personArray.get(i).getnID(),personArray.get(i).getPassportNumber());
		}
		
		System.out.println("Before sorting :");
		System.out.println(map);
		
        Map<String, String> treeMap = new TreeMap<String, String>(map);
		System.out.println("After sorting :");
		
        System.out.println(treeMap);


		
		
		
		
		
		
		
		
		
		
		
	}

}