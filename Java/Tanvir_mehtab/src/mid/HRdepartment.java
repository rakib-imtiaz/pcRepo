package mid;

public class HRdepartment extends ITdepartment {
	private String address;
	private String designation;

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

	public void minSalary(HRdepartment hrarray[], ITdepartment itarray[])

	{

		double minsalary = 0;
		int position = 0;
		for (int i = 0; i < itarray.length; i++) {
			for (int j = 0; j < itarray.length; j++) {
				
				String itname=itarray[i].getEmpName();
				String hrname=hrarray[i].getEmpName();

				if (itname==hrname)
					if (minsalary < itarray[i].getSalary()) {

						minsalary = itarray[i].getSalary();
						position = i;

					}

			}

		}
		
		System.out.println("\nInformation of Lowest paid salary : ");
		System.out.println("Name                  : "+hrarray[position].getEmpName());
		System.out.println("age                   : "+hrarray[position].getAge());
		System.out.println("salary                : "+hrarray[position].getSalary());
		System.out.println("Designation           : "+hrarray[position].getDesignation());

	}

}


