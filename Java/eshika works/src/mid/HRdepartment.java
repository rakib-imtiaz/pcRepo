package mid;

public class HRdepartment extends ITdepartment {
	private String address, designation;

	public String getAddress() {
		return address;
	}

	public HRdepartment() {
		// TODO Auto-generated constructor stub
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public HRdepartment(String address, String designation) {
		super();
		this.address = address;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "HRdepartment [address=" + address + ", designation=" + designation + "]";
	}

	public void minSalary(HRdepartment arr[], ITdepartment arr2[])

	{

		double min = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr[i].getName().contentEquals(arr2[i].getName()))
					if (min < arr[i].getSalary()) {

						min = arr[i].getSalary();
						index = i;

					}

			}

		}

		System.out.println("Lowest paid employee  : \n" + arr[index].toString());

	}

}
