package xm;

public class ExceptionCreation {
	
	
	int radius;
	double Area() throws InvalidRadius
	{
		
		if(radius<0)
		{
			throw new InvalidRadius(radius);
		}
		else {
			
			return radius*3.1416*radius;
		}
		
	}

}
