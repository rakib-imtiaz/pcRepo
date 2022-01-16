import java.util.ArrayList;

import javax.swing.JLabel;

public class Customer {

	private String name, gender, age, address, email, number, password;
	private ArrayList<Product> prdouctList;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String gender, String age, String address, String email, String number,
			String password, ArrayList<Product> prdouctList) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.address = address;
		this.email = email;
		this.number = number;
		this.password = password;
		this.prdouctList = prdouctList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Product> getPrdouctList() {
		return prdouctList;
	}

	public void setPrdouctList(ArrayList<Product> prdouctList) {
		this.prdouctList = prdouctList;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", address=" + address + ", email="
				+ email + ", number=" + number + ", password=" + password + ", prdouctList=" + prdouctList + "]";
	}

}
