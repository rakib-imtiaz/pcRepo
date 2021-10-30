package final_xm;
import java.util.*;
public class main {
public static void main(String[] args) {
	
	Scanner inpupt = new Scanner(System.in);
	System.out.println("Frog number: ");
	int size = inpupt.nextInt();
	

	Frog[] array = new Frog[size];

	
	String name;
	String type;
	boolean position;
	for (int i = 0; i < size; i++) {

		System.out.println("Name: ");
		 name = inpupt.nextLine();
		name = inpupt.nextLine();
		System.out.println("Type: ");
		 type = inpupt.nextLine();
		System.out.println("Postion: ");
		 position = inpupt.hasNext();

		Frog obj = new Frog();
		obj.setName(name);
		obj.setPosition(position);
		obj.setType(type);
		array[i]=obj;

	}
	for (int i = 0; i < size; i++) {
		
		System.out.println(array[i]);
		
	}
	
	
}
}
