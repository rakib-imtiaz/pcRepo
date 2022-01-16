package taskDec13;

public class test {

public static void main(String[] args) {
		
		Student obj1 = new Student("Raihan Ahmed", "Mirpur");
		System.out.println(obj1);
		
	obj1.addCourseGrade("CSE115", 89);
	obj1.addCourseGrade("CSE215", 57);
	obj1.addCourseGrade("CSE225", 96);
		obj1.printGrades();
	
	System.out.println("Average GRade: "+obj1.getAverageGrade());
		
		
	}
}
