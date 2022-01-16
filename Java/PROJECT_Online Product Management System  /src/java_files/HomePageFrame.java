package java_files;
import java.io.File;
import java.io.IOException;

public class HomePageFrame {

	static String currentWorkingDirectory = getCurrentWorkingDirectory();

	static File file = new File(currentWorkingDirectory + "/src/DataFiles");

	public static void main(String[] args) throws IOException {

		fileInitialiser();

	}

	static void fileInitialiser() throws IOException {
		file.mkdir();

		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		System.out.println(currentWorkingDirectory);

	}

	static String getCurrentWorkingDirectory() {
		String s = System.getProperty("user.dir");
		System.out.println(s);

		return s;

	}

}
