

public class question_2 {
	
	public static void main(String[] args) {
		
		int sum_ExquisiteNumber=0;
		int count=0;
		
		int result [] = new int[10000];
		
		
		for(int i=1;i<=1000000;i++)
		{
			if(isExquisiteNumber(i))
			{
				
			System.out.printf("Exquisite Number %d : %d\n",count+1,i);
			sum_ExquisiteNumber+=i;
			result[count]=i;
			count++;
			
				
				
			}
		
		
		}
		
		System.out.println();
		
		for(int i=0;i<count;i++)
		{
			
			
			System.out.print(result[i]+ "+");
			
			
		}
		System.out.println("="+sum_ExquisiteNumber);
		
		if(isExquisiteNumber(sum_ExquisiteNumber))
		{
			System.out.printf("\n%d is a Exquisite Number\n",sum_ExquisiteNumber);
			
			
		}
		else {
			System.out.printf("\n%d is not Exquisite Number\n",sum_ExquisiteNumber);

			
		}
		
		
		
		
		
		
	}
	
	public static boolean isExquisiteNumber(int number)
	{
		int sum=0;
		for(int i=1;i<number;i++)
		{
			if((number%i)==0)
			{
				sum=sum+i;
				
			}
				
			
		}
		
		if(sum==number)
		{
			return true;

			
		}
		else {
			
			return false;
		}
		
		
	}
	
	

}

