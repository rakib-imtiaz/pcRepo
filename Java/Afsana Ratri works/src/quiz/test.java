package quiz;

public class test {
	
	public static void main(String[] args) {
		
		Surgeon a = new Surgeon("A", 21, "abc", 237, "cde", 5);
		Surgeon b = new Surgeon("A", 21, "abc", 177, "cde", 7);
		
		
		System.out.println(a.getSalary());
		System.out.println(b.getSalary());
		
		System.out.println(a);
		System.out.println(b);
	}

}
