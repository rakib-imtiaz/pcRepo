
public class Circle {
	
	double radius=0;

	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	Circle(double newRadius)
	{
		
		radius=newRadius;
	}

	
	double getArea()
	{
		return 3.1416*radius*radius;
		
	}
	double getPerimeter()
	{
		return 2*3.1416*radius;
		
	}

	public void setRadius(double newRadius) {
		this.radius = radius;
	}
	
	
	

}
