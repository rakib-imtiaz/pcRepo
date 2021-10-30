package sep_16.task2;

public class LowGpaException extends Exception {
	public LowGpaException() {
		System.out.println("Your GPA is not sufficient to apply for this job (2.5)");
	}
	
}
