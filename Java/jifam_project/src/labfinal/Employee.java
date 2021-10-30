package labfinal;

public class Employee extends office implements AverageAge, AverageSalary {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void seniorEmployee(Employee[] emp) {

		Employee e = null;

		int min = emp[0].getAge();

		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getAge() < min) {

				min = emp[i].getAge();
				e = emp[i];

			}

		}

	}

	public void avgSalary(Employee[] emp) {
		int sum = 0;

		for (int i = 0; i < emp.length; i++) {
			sum = sum + emp[i].salary;

		}

		double avrg = sum / emp.length;

		System.out.println("Average: " + avrg);

	}

	public double avgAge(Employee[] emp) {
		int sum = 0;

		for (int i = 0; i < emp.length; i++) {
			sum = sum + emp[i].getAge();

		}

		double avrg = sum / emp.length;

		System.out.println("Average age : " + avrg);
		
		return avrg;

	}

}
