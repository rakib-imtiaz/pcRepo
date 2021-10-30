package mid;

public class ITdepartment extends Office {

	private String empName;
	private int age;
	private int empid;
	private double salary;
	

	public ITdepartment(String empName, int age, int empid, double salary) {
		super();
		this.empName = empName;
		this.age = age;
		this.empid = empid;
		this.salary = salary;
	}

	public ITdepartment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ITdepartment(String name, String loaction, int totalExperience) {
		super(name, loaction, totalExperience);
		// TODO Auto-generated constructor stub
	}

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

	
	

	double averageAge(ITdepartment arr[]) {

		double sumOfAge = 0;
		for (int i = 0; i < arr.length; i++) {
			sumOfAge = sumOfAge + arr[i].getAge();

		}
		double person=arr.length;
		double avrg=age /(double) person;
		System.out.println("Sum of age : "+sumOfAge);
		return avrg;

	}

	@Override
	public String toString() {
		return "ITdepartment [empName=" + empName + ", age=" + age + ", empid=" + empid + ", salary=" + salary
				+ ", getEmpName()=" + getEmpName() + ", getAge()=" + getAge() + ", getEmpid()=" + getEmpid()
				+ ", getSalary()=" + getSalary() + ", toString()=" + super.toString() + ", getLoaction()=" + getLoaction() + ", getTotalExperience()="
				+ getTotalExperience() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	ITdepartment highestSalary(ITdepartment arr[])

	{
		double max = 0;
		ITdepartment person = null;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i].getAge()>=25 && arr[i].getAge()<=39)
			
				{
				if (max > arr[i].salary) {
				

				max = arr[i].getSalary();
				person = arr[i];
			}
				

		}
		}
		return person;

	}

}
