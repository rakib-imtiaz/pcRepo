package Tarek_1822172642;

public class tester {
	public static void main(String[] args) {
		
	usingfor();
	usingwdpohile();
	usingwhile();
	
	}
			
	static void usingfor()
	{
		int sum=0;
		int n=100;
		for (int i = 1; i < n; i = i + 5) {

			sum = sum + i;

		}

	}
	static void usingwhile()
	{
		int i = 0;
		int n = 100;
		int sum=0;
		while (i < n) {
			sum = sum + i;
			n--;

		}
		
	}
	static void usingwdpohile()
	{
		int i=1,n=100,sum=0;
		do {
			sum = sum + i;
			n--;
		} while (i < n);

	

		
	}

}
