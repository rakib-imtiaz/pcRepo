package quiz_aug3;

public class main {
	public static void main(String[] args) {
		
		Student obj1= new Student();
		obj1.setActive(true);
		obj1.setName("Linag");
		obj1.setId(2100042);
		obj1.setCredit(3);
		obj1.setStatus(Student.getFresher());
		System.out.println(obj1);
		
		Student obj2= new Student();
		obj2.setActive(false);
		obj2.setName("Herbert");

		obj2.setStatus(Student.getFresher());
		System.out.println(obj2);
	}

}
