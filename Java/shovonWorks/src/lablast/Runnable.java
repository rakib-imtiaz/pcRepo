package lablast;


 class InputWrongException extends Exception{
	int id;
	

	public InputWrongException(int  id) {
		super();
		this.id = id;
	}


	@Override
	public String toString() {
		return "InputWrongException: ]";
	}

	

}

public interface Runnable {
	
	public abstract void  HowToRun();


}
