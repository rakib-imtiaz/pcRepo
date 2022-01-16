import java.io.File;

public class FilePaths {

	static final String UsersDirectoryPath = "./src/Data_Files/UserDirectory";
	static final String ProductsDirectoryPath = "./src/Data_Files/ProductsDirectory";
	static final String CustomersDirectoryPath = "./src/Data_Files/CustomersDirectory";

	private File UsersDirectory = new File(UsersDirectoryPath);
	private File ProductsDirectory = new File(ProductsDirectoryPath);
	private File CustomersDirectory = new File(CustomersDirectoryPath);

	public FilePaths() {

		UsersDirectory.mkdir();
		ProductsDirectory.mkdir();
		CustomersDirectory.mkdir();
	}

}
