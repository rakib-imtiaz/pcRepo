package final_sept14;


public class InputNotCorrectException extends Exception {

	private int a;

	

	public InputNotCorrectException(int  a) {
		super();
		this.a = a;
	}


	@Override
	public String toString() {
		return "InputNotCorrectException :" + "year "+a + " is less than 1900]";
	}

}
