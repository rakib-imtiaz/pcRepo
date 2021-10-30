package sep_16.task2;

public class AgeOutOfRangeException  extends Exception{
	
	
	 private int age;
	public AgeOutOfRangeException(int age) {
		this.age=age;
		
	}
	
	@Override
	public String toString() {
		return "You are older than the requested age (25 years), you are "+ age +" !!!”.";
	}
	
	

}
