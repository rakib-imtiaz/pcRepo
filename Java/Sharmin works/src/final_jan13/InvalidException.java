package final_jan13;

public class InvalidException extends Exception{
	
	int a;

	public InvalidException(int number) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InvalidException [a=" + a + "]";
	}
	
	

}
