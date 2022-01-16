package java_files;

import java.io.File;
import java.io.IOException;

public class productManagement {
	private String storeName;
	private String address;
	private Product[] productlist;
	private static int numberOfProduct = 0;
	private static File file;

	public static void main(String[] args) throws IOException {
		productManagement a = new productManagement();
	}
	public productManagement() throws IOException {

		fileInitialiser();
	}

	public void fileInitialiser() throws IOException {
		file = new File(getab+"./src/productsInfo.txt");
		System.out.println(file);
		
//		if (!file.exists()) {
//			System.out.println(file.getAbsolutePath());
//			file.createNewFile();
//		}

	}

	public productManagement(String storeName, String address) {
		this.storeName = storeName;
		this.address = address;
		productlist = new Product[100];

	}

	public String getStoreName() {
		return storeName;
	}

	public String getAddress() {
		return address;
	}

	public String setStoreName() {
		this.storeName = storeName;
		return storeName;
	}

	public String setAdress() {
		this.address = address;
		return address;
	}

	public void addProduct(Product product) {

		productlist[numberOfProduct] = product;
		numberOfProduct++;

	}

	public void removeProduct(int productID) {

		int index = 0;
		for (int i = 0; i < productlist.length; i++) {
			if (productlist[i].getProductID() == productID) {
				index = i;
				break;
			}

		}

		for (int i = index; i < productlist.length; i++) {
			productlist[i] = productlist[i + 1];

		}

	}

	public void DisplayProducts() {
		for (int i = 0; i < numberOfProduct; i++) {

			System.out.println(productlist[i].toString());
		}
	}

	public void searchProduct(int productID) {
		for (int i = 0; i < productlist.length; i++) {
			if (productlist[i].getProductID() == productID) {

				System.out.println(productlist[i]);
			}

		}

	}

	@Override
	public String toString() {
		return "DepartmentStore[" + "storeName=" + storeName + ", address=" + address + ", productlist=" + productlist
				+ ", numberOfProduct=" + numberOfProduct + "]";
	}

}
