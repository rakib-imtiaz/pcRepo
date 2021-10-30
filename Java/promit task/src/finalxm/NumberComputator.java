package finalxm;

public class NumberComputator {
	
	
	
	void printPrime(int n)
	{
		for(int i=0;i<n;i++)
			
		{
			
			if(isPrime(n)==true)
			{
				
				System.out.println(i);
			}
		}
	}
	
	 static boolean isPrime(int n){
	        boolean result=true;
	        if(n <= 1) return false;
	        for(int i = 2; i <= n/2; i++){
	            if(n % i == 0){
	                result = false;
	                break;
	            }
	        }
	        return result;
	    }
	

}
