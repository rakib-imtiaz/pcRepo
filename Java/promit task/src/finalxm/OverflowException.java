package finalxm;

public class OverflowException extends Exception{

private int num;

	

	public OverflowException(double  area) {
		super();
		this.num = (int) area;
	}


	

	@Override
	public String toString() {
		return "OverflowException "+num + "]";
	}


}
