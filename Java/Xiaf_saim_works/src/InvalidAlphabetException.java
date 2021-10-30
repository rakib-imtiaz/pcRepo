
public class InvalidAlphabetException  extends Exception{

	String character;

	public InvalidAlphabetException(String character) {
		super();
		this.character = character;
	}

	@Override
	public String toString() {
		return "InvalidCharacterException [character=" + character + "]";
	}
	
	
	
	
}

