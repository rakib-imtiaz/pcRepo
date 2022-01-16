import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Record {

	ArrayList<Family> FamilyArrayList = new ArrayList<Family>();

	public Record() {

	}

	void add(Family family) {

		FamilyArrayList.add(family);

	}

	void readData() throws IOException {

		FileReader fr = new FileReader("Shahnila_1610450042.txt");
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
		fr.close();

	}

	void Edit(String searchTerm, Family family) {

		for (int i = 0; i < FamilyArrayList.size(); i++) {
			if (FamilyArrayList.get(i).getFamilySurName().contentEquals(searchTerm)) {
				FamilyArrayList.remove(i);
				FamilyArrayList.add(family);
			}

		}

	}

	void Search(String searchTerm) {

		for (int i = 0; i < FamilyArrayList.size(); i++) {
			if (FamilyArrayList.get(i).getFamilySurName().contentEquals(searchTerm)) {
				System.out.println(FamilyArrayList.get(i).toString());

			}

		}

	}

	void view() {
		for (int i = 0; i < FamilyArrayList.size(); i++) {

			System.out.println(FamilyArrayList.get(i).toString());

		}

	}

	public void saveToFile() throws IOException {

		try (FileWriter fileWriter = new FileWriter("Shahnila_1610450042.txt")) {

			for (int i = 0; i < FamilyArrayList.size(); i++) {

				fileWriter.write(FamilyArrayList.get(i).toString());

			}

		}

	}

}
