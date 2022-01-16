
public class Task1_2111650642 {
	
	public static void main(String[] args) {
		
		
		int array[][]= {
				{99,42,74,83},
				{57,81,69,67},
				{88,61,79,84},
				{93,75,78,87}
		};
		
		
		int totalMarks=0;
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[0].length;j++)
			{
				totalMarks=totalMarks+array[i][j];
				
			}
			
			
		}
		
		System.out.println("Class Total : "+totalMarks);
		
		System.out.println("Class Average : "+totalMarks/(double)array.length);
		
		
	}

}
