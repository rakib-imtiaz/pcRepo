package as3;

public class firstClass {
	
	int count=5;
	
	  void assignFirstClass(boolean seats[])
	 {
		 
		 for(int i=0;i<5;i++)
		 {
	 
		if(seats[i]==false)
		{
			seats[i]=true;
			count--;
			System.out.println("First class Seat booked! at seat No :"+i+1);
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
