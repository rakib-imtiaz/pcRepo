package nov16;

public class main {
	
	public static void main(String[] args) {
		
		FullTimeEmployee fulltime = new FullTimeEmployee(90000,30);
		
		PartTimeEmployee parttime = new PartTimeEmployee(750,30);
		
		
		
		System.out.println("Fulltime salary : "+fulltime.salary());
		System.out.println("part time salary : "+parttime.salary());
		
		
		
	}

}
