package quiz_aug3;

public class main {
	public static void main(String[] args) {

		
		Course obj1= new Course();
		obj1.setAvailable(true);
	 obj1.setName("Programming in C");
		obj1.setStatus(obj1.getMaximum());
		obj1.setCredit(3);
		System.out.println(obj1);
		
		Course obj2= new Course();
		
		obj2.setAvailable(false);
		obj2.setName("Programming in java");
		obj2.setStatus(obj2.getMinimum());
		obj2.setCredit(1.5);
		System.out.println(obj2);
	}

}
