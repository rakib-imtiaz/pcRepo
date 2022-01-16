package labfinal;

public class InvalidAgeException  extends Exception{
	private int age;

	public InvalidAgeException(int  age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Age is greater than 15,no offer will be recieved\n";
	}

}
