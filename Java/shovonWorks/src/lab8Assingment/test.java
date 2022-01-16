package lab8Assingment;

import java.util.GregorianCalendar;

public class test {
	
	public static void main(String[] args) {
		
		GregorianCalendar date = new GregorianCalendar();
		date.set(2020, 12, 12);
		
		Person person = new Person("shovon","dhaka","01234567","shovon@gmail.com");
		Employee emp = new Employee("emp1", "dhaka", "01234560987", "emp@mail.com", "dhaka", 12000, date);
		Student std = new Student("std1", "dhaka", "01998712345", "std@gmail..com", "FReshman");
		Staff staff = new Staff("staff", "dhaka", "0123456", "staff@gmail.com", "dhaka", 2300, date, "staff");
		Faculty faculty = new Faculty("faculty", "dhaka", "019123457", "faculty", "dhaka", 234444, date, "12:50", "lecturer");
		
		
		System.out.println(person);
		System.out.println(emp);
		System.out.println(std);
		System.out.println(staff);
		System.out.println(faculty);
	
	
	}

}
