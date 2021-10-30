package finalxm;

public class NegativeValueException extends Exception{
	
private int num;

	

	public NegativeValueException(double  area) {
		super();
		this.num = (int) area;
	}


	

	@Override
	public String toString() {
		return "NegativeValueException "+num + "]";
	}


}
