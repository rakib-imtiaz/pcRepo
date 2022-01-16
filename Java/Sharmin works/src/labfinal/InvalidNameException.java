package labfinal;


public class InvalidNameException extends Exception {

	private String name;

	

	public InvalidNameException(String  name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Name : "+name+ "Does start with s or Ends with o";
	}

}
