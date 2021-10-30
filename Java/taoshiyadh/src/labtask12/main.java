package labtask12;

public class main {
	
	public static void main(String[] args) {
		PartTimeEmployee parttime = new PartTimeEmployee("Rahim", 25, "dhaka", "CSE", "Manager", 12, 80);
		FullTimeEmployee fulltime = new FullTimeEmployee("Rahim", 25, "dhaka", "CSE", "Manager", 15000, 25);
		System.out.println(parttime);
		System.out.println("Salary: "+parttime.salary());
		System.out.println(fulltime);
		System.out.println("Salary: "+fulltime.salary());

	}
	
	

}
