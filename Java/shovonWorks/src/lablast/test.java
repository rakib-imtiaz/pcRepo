package lablast;

import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {

		Vehicle[] array = new Vehicle[4];

		Car car1 = new Car("yellow", 1234, "model1");
		Car car2 = new Car("black", 662, "modelX");

		Cycle cycle1 = new Cycle("Ash", 1234, "model Y");
		Cycle cycle2 = new Cycle("Light sky", 456, "model z");

		array[0] = car1;
		array[1] = car2;
		array[2] = cycle1;
		array[3] = cycle2;

		for (int i = 0; i < array.length; i++) {
			try (FileWriter fileWriter = new FileWriter("info.txt")) {
				fileWriter.write(array[i].toString());

			}
		}

	}

}
