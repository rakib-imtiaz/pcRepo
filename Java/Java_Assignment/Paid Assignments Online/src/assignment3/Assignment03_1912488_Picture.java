package assignment3;

import java.awt.image.BufferedImage;

public class Assignment03_1912488_Picture {
	
	private static int width=40;
	private static int height=50;
	static BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

	
	 static BufferedImage getPicture()
	{
			
		int p = 0;
		
	for(int i=0;i<height;i++)
	{
		for(int j=0;i<width;j++)
		{
			
			int a= (int)(Math.random()*256);
			int red= (int)(Math.random()*256);
			int green= (int)(Math.random()*256);
			int blue= (int)(Math.random()*256);
			
			
			 p=(a<<24)|(red<<16)|(green<<8)|blue;
			
			
			
		}
		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		 
		
		
	}
	return img;
	}
	

}
