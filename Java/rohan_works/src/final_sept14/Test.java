package final_sept14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	//1911706042

	public static void main(String[] args) throws IOException {
		
		
		Vehicle carArray[] = new Apple[7];
		Vehicle truckArray[] = new Truck[7];
		
		carArray[0]= new Apple("Red",2008,"modelA");
		carArray[1]= new Apple("Blud",1990,"modelB");
		carArray[2]= new Apple("Red",2005,"modelA");
		
		System.out.println(carArray[0].equals(carArray[2]));
		System.out.println(carArray[1].equals(carArray[2]));
		System.out.println(carArray[2].equals(carArray[2]));
		System.out.println(carArray[0].toString());
		System.out.println(carArray[1].toString());
		System.out.println(carArray[2].toString());
		
		
		truckArray[0]= new Truck("Red",2008,"modelX");
		truckArray[1]= new Truck("Blud",1990,"modelY");
		truckArray[2]= new Truck("Red",2005,"modelZ");
		
		System.out.println(truckArray[0].equals(truckArray[2]));
		System.out.println(truckArray[1].equals(truckArray[2]));
		System.out.println(truckArray[2].equals(truckArray[2]));
		System.out.println(truckArray[0].toString());
		System.out.println(truckArray[1].toString());
		System.out.println(truckArray[2].toString());
		
		
		File file = new File("carinfo.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		writer.append(carArray.toString());
		writer.append(truckArray.toString());
		writer.close();
		
		
	}

}
