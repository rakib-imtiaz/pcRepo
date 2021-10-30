package customer;

public class Customer {

	private String name;
	private String Customer_pass;
	private String email;
	

	private String phone_number;
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Customer_pass=" + Customer_pass + ", email=" + email + ", phone_number="
				+ phone_number + "]";
	}


	public String getName() {
		return name;
	}

	public Customer(String name, String customer_pass, String email, String phone_number) {
		super();
		this.name = name;
		Customer_pass = customer_pass;
		this.email = email;
		this.phone_number = phone_number;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setCustomer_id(String customer_id) {
	}

	public String getCustomer_pass() {
		return Customer_pass;
	}

	public void setCustomer_pass(String customer_pass) {
		Customer_pass = customer_pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

}
