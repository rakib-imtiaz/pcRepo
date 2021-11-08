public class num3 {
	public static void main(String[] args) {
		
		int lineCount=0;
		for(int i=40;i<122;i++)
		{
			if(lineCount==20)
			{
				System.out.println();
				lineCount=0;
			}
			System.out.print((char)(i));
			lineCount++;
		}
		
		
		
		}
	}
