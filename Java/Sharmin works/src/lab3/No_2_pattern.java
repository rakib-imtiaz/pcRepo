package lab3;

public class No_2_pattern {
	public static void main(String[] args) {
		
		int n=5;
		for(int i=n;i>=0;i--)
		{
			if(i==2||i==4)
			{
				System.out.println();
			}
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		
	}

}
