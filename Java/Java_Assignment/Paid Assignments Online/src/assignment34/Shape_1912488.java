package assignment34;

public class Shape_1912488 {
	
	protected String  color;

	protected boolean filled;
	
	public Shape_1912488(boolean filled ,String color)
	{
		
		this.color=color;
		this.filled=filled;
		
		
		
	}

	@Override
	public String toString() {
		return "Shape [Color:" + color + ", Is Filled:" + filled + "]";
	}


	
}
