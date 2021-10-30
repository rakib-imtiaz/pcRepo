package lab3;

public class no_1_randomNumber {
	public static void main(String[] args) {
		
		
		int min=5;
		int max=20;
		
		int range=(max-min)+1;
		
		int rand=(int)(min+Math.random()*range);
		
		System.out.println("Random Integer: "+ rand);
		
		for(int i=0;i<=rand;i++)
		{
			System.out.print(i+" ");
			
		}
		
	}

}
