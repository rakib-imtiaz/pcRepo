package as3;

public class Economy {
	
	int count=5;
	  void assigneconomy(boolean seats[])
	 {
		 
		  for(int i=5;i<10;i++)
		 {
	 
		if(seats[i]==false)
		{
			seats[i]=true;
			System.out.println("Economy Seat booked! at seat No :"+i);

			count--;
			break;
			
		}
		else if(seats[i]==true && count==0)
		{
			System.out.println("reserved\n");
			
		}
		else {
			continue;
		}
	 }
		 
	 }
	

}
