package mid;

public class Car {
	double weight, speed_per_gear , no_of_gears;
	

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	 public Car(double weight, double speed_per_gear, double no_of_gear) {
		super();
		this.weight = weight;
		this.speed_per_gear = speed_per_gear;
		this.no_of_gears = no_of_gears;
	}
	 public double  calculate_maximum_speed()
	 {
		 
		 double sum=(0.025*this.weight*this.speed_per_gear*no_of_gears);
		 
		System.out.println("The maximum speed is given by:"+sum);
		return sum; 
		 
	 }
	
	void compare(Car obj)
	{
		
		double a=this.calculate_maximum_speed();
		double b=obj.calculate_maximum_speed();
		if(a>b)
		{
			
			
		}
		else {
			System.out.println("second car has maximum speed");	

			
		}
		
		
	}
	
}
