package finals;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {

		Animal[] animals = new Animal[3];

		Cat Persian = new Cat("white", 2, "Persian");
		Cat Abyssinian = new Cat("gry", 2, "Abyssinian");
		Cow cowObject = new Cow("Ash", 3, "Black angus");

		animals[0] = Abyssinian;
		animals[1] = Persian;
		animals[2] = cowObject;

		File file = new File("animal.txt");

		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		
		writer.write(animals[0].toString());
		writer.write(animals[1].toString());
		writer.write(animals[2].toString());

	}

}
