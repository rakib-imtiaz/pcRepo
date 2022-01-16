package Assingment2;

import java.util.GregorianCalendar;

public class Driver {
	
	public static void main(String[] args) {
		
		GregorianCalendar date = new GregorianCalendar();
		date.set(2002, 3, 2);
		
		Person p = new Person("Ratri","dhaka","adsd","ratri@gmail.com");
		Employee e = new Employee("abc", "dhaka", "adsa", "asd@mail.com", "dhaka", 12000, date);
		Student s = new Student("asfsaf", "dhaka", "asdsad", "asds@gmail..com", "FReshman");
		Staff st = new Staff("adsa", "dhaka", "adsad", "asdsa@gmail.com", "dhaka", 2300, date, "aasds");
		Faculty f = new Faculty("asdasd", "dhaka", "asdsa", "asdasds", "asdas", 234444, date, "12:50", "asdsa");
		
		
		System.out.println(p);
		System.out.println(e);
		System.out.println(s);
		System.out.println(st);
		System.out.println(f);
	
	
	}

}
