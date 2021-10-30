package labfinal;

public abstract class office  {

	private String name;

	public office() {
		super();
	}

	public office(String name, String designation, int age) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String designation;
	private int age;

	public abstract void seniorEmployee(Employee[] emp);

	public Employee salary(Employee[] emp) {
	
		Employee e = null;

		int min = emp[0].getSalary();

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getSalary() < min) {

				min = emp[i].getSalary();
				e = emp[i];

			}

		}

		return e;

	}

}
