package shoykotIslam;

import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {

		Animal[] array = new Animal[9];

		Cat cat1 = new Cat("white", 34, "speice1");
		Cat cat2 = new Cat("black", 33, "speice2");

		Cow cow1 = new Cow("Ash", 23, "speice1");
		Cow cow2 = new Cow("Ash", 23, "speice1");

		array[0] = cat1;
		array[1] = cat2;
		array[2] = cow1;
		array[3] = cow2;

		for (int i = 0; i < array.length; i++) {
			try (FileWriter fileWriter = new FileWriter("info.txt")) {
				fileWriter.write(array[i].toString());

			}
		}

	}

}
