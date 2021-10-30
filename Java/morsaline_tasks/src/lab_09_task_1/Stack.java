package lab_09_task_1;

public class Stack {
	
	private int stck[];
	private int tos;
	


	public int[] getStck() {
		return stck;
	}

	public void setStck(int[] stck) {
		this.stck = stck;
	}

	public Stack(int size) {
		
		 stck = new int [size];
	}
	
	public void push(int item)
	{
		
		stck[tos]=item;
		tos++;
		
		
	}
	public int  pop()
	{
		int it=stck[tos];
		tos--;
		return it;
		
	}
	

}
