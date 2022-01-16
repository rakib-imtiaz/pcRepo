
public class Student {
	private int id;
	private String Department;
	private double quizmarks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String department, double quizmarks) {
		super();
		this.id = id;
		Department = department;
		this.quizmarks = quizmarks;
	}
	
	void accecpt()
	{
		
	}
	void Display()
	{
		System.out.println("Total : "+this.quizmarks+);
		
	}
	

}
