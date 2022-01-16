
public class CheckPrimeandEven {

	public static void main(String[] args) throws InvalidException {

		int number = 10;

		if (number < 0) {
			throw new InvalidException(number);
		}
		else {
			checkPrime(number);
			checkEvenOrOdd(number);
		}

	}
	
	static void checkPrime(int a)
	{
		
		/*
		 * 
		 * logic to check prime*/
		
	}
	static void checkEvenOrOdd(int a)
	{
		
		/*
		 * 
		 * logic to check prime*/
		
	}

}


 class InvalidException extends Exception{
	
	int a;

	public InvalidException(int number) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InvalidException [a=" + a + "]";
	}
	
	

}



