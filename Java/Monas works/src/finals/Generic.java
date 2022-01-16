package finals;

public class Generic <datatype> {
	
	
	private datatype data;
	
	
	void initialiseArray(datatype length)
	{
		datatype[] genericArray = (datatype[]) new Object[(int) length];
		
	}
	
	public static void main(String[] args) {
		
		Generic integer= new Generic();
		
		integer.initialiseArray(10);
		
		
	}

}
