package dec24_assignment;

public class InvalidAgeException  extends Exception{
	

	private int age;

	

	public InvalidAgeException(int  age) {
		super();
		this.age = age;
	}


	@Override
	public String toString() {
		return "InvalidAgeException: You arent old enough to donate blood";
	}

}
