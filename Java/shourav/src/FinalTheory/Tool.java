package FinalTheory;

public class Tool {
	private int length;

	public Tool() {
		// TODO Auto-generated constructor stub
	}

	Tool(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void display() {
		System.out.println("The lenght is  :  length:" + length);
	}

	public void setLength(int length) {
		this.length = length;
	}

}