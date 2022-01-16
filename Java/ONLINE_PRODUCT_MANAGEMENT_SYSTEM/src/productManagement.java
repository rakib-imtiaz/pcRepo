
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class productManagement {
	private File file;
	ArrayList<Product> productList = new ArrayList<Product>();

	BufferedReader reader;
	BufferedWriter writer;

	public productManagement() throws IOException {

		fileInitialiser();
	}

	public void fileInitialiser() throws IOException {
		file = new File(FilePaths.ProductsDirectoryPath + "/productsinfo.txt");
		if (!file.exists()) {
			System.out.println("new file created at" + file.getAbsolutePath());
			file.createNewFile();
		}

	}

	public ArrayList<Product> getData() throws IOException {
		fetchDataFromFile();
		return productList;
	}

//
//	public static void addProduct(Product product) {
//
//		productlist[numberOfProduct] = product;
//		numberOfProduct++;
//
//	}
//
//	public static  void removeProduct(int productID) {
//
//		int index = 0;
//		for (int i = 0; i < productlist.length; i++) {
//			if (productlist[i].getProductID() == productID) {
//				index = i;
//				break;
//			}
//
//		}
//
//		for (int i = index; i < productlist.length; i++) {
//			productlist[i] = productlist[i + 1];
//
//		}
//
//	}
//
//	public static void DisplayProducts() {
//		for (int i = 0; i < numberOfProduct; i++) {
//
//			System.out.println(productlist[i].toString());
//		}
//	}
//
//	public static void searchProduct(int productID) {
//		for (int i = 0; i < productlist.length; i++) {
//			if (productlist[i].getProductID() == productID) {
//
//				System.out.println(productlist[i]);
//			}
//
//		}

	void addProduct(Product product) throws IOException {

		productList.add(product);

	}

	void saveData() throws IOException {
		writer = new BufferedWriter(new FileWriter(file));

		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i).toString());
			writer.append(productList.get(i).toString());
			writer.append("\n");

		}
		writer.close();

	}

	void fetchDataFromFile() throws IOException {

		String fetchedData;
		reader = new BufferedReader(new FileReader(file));

		for (int i = 0; (fetchedData = reader.readLine()) != null; i++) {

			String array[] = new String[fetchedData.length()];

			array = fetchedData.split(",");
			Product tempProduct = new Product(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[3]),
					Double.parseDouble(array[3]), Boolean.parseBoolean(array[4]));
			addProduct(tempProduct);

		}
		reader.close();

	}

	void Edit(int productID, Product product) throws IOException {

		//fetchDataFromFile();
		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductID() == productID) {
				productList.remove(i);
				productList.add(product);
			}

		}

	}

	void delete(int productID) {

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductID() == productID) {
				productList.remove(i);
			}

		}

	}

	boolean Search(int productId) {

		boolean flag = false;

		for (int i = 0; i < productList.size(); i++) {
			if (productList.get(i).getProductID() == productId) {
				flag = true;
				System.out.println(productList.get(i).toString());

			}

		}
		return flag;

	}

	void view() throws IOException {
		fetchDataFromFile();
		for (int i = 0; i < productList.size(); i++) {

			System.out.println(productList.get(i).toString());

		}

	}

}
