package quiz;


public class main {
	public static void main(String[] args) {
		
		Cellphone[] objArray= new Cellphone[3];
		objArray[0]=new Cellphone(20);
		objArray[1]=new Cellphone(19);
		objArray[2]=new Cellphone(23);
			
		double ag=0;
		double sum=0;
		for(int i=0;i<objArray.length;i++)
		{
			sum=sum+objArray[i].getCall_duration();
			
		}
		
		System.out.println("Avregae: "+sum/objArray.length);
		
	}

}
