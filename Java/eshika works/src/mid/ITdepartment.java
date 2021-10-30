package mid;

public class ITdepartment extends Office {

	private String empName;
	private int age;
	private int empid;
	private double salary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ITdepartment [empName=" + empName + ", age=" + age + ", empid=" + empid + ", salary=" + salary + "]";
	}

	double averageAge(ITdepartment arr[]) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i].getAge();

		}
		return age / arr.length;

	}

	ITdepartment highestSalary(ITdepartment arr[])

	{
		double max = 0;
		ITdepartment obj = null;
		for (int i = 0; i < arr.length; i++) {
			if (max > arr[i].salary) {

				max = arr[i].getSalary();
				obj = arr[i];
			}

		}
		return obj;

	}

}
