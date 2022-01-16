package practice;

public class main {
	
	public static void main(String[] args) {
		
		
		int array[]= {10,20,30,40};
		int array2[]=array.clone();
		
		array2[1]=5400;
		array[1]=2300;
		
		for(int i=0;i<array.length;i++)
		{
			array[i]=array[i]*2;
			array2[i]=array2[i]*2;
		}
		
		
		System.out.println(array[1]);
		System.out.println(array2[1]);
		
		
		
	}
	

	

	
	

}
