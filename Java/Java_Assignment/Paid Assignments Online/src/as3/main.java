package as3;
import java.util.*;
public class main {
	
	public static void main(String[] args) {
		
		System.out.println("PLease type 1 for First class");
		System.out.println("PLease type 2 for Economy ");
		System.out.println("PLease type 0 for exit ");
		
		
		boolean [] seats= new boolean[10];
		
		
		for(int i=0;i<seats.length;i++)
		{
			seats[i]=false;
			
			
		}
		
		
		
		
		int option;
		Scanner scan =new Scanner(System.in);
		
		
		do {
		 option=scan.nextInt();

			if(option==1)
			{
				
				
				firstClass objClass= new firstClass();
				objClass.assignFirstClass(seats);
				
			}
			else if(option==2)
			{
				

				Economy objClass= new Economy();
				objClass.assigneconomy(seats);
			}
			
			
			
			
		}
		
while(option!=0);

				
		
		
		
				
		
		
	}
	
	
}

