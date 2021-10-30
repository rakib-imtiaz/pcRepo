package labfinal;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setAge(23);
		emp1.setDesignation("manager");
		emp1.setName("employee 1");
		emp1.setSalary(12300);

		Employee emp2 = new Employee();
		emp2.setAge(23);
		emp2.setDesignation("manager");
		emp2.setName("employee 1");
		emp2.setSalary(12300);

		Employee emp3 = new Employee();
		emp3.setAge(23);
		emp3.setDesignation("manager");
		emp3.setName("employee 1");
		emp3.setSalary(12300);

		Employee emp4 = new Employee();
		emp4.setAge(23);
		emp4.setDesignation("manager");
		emp4.setName("employee 1");
		emp4.setSalary(12300);

		Employee emp5 = new Employee();
		emp5.setAge(23);
		emp5.setDesignation("manager");
		emp5.setName("employee 1");
		emp5.setSalary(12300);

		Employee[] emplist = new Employee[10];

		emplist[0] = emp1;
		emplist[1] = emp2;
		emplist[2] = emp3;
		emplist[3] = emp4;
		emplist[4] = emp5;

		Employee obj = new Employee();
		obj.avgSalary(emplist);

		obj.avgAge(emplist);
		obj.seniorEmployee(emplist);

	}

}
