
public class Fan {

	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;

	public Fan() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	private int speed=SLOW;
	boolean on = false;
	private double radius = 5;
	
	
	private String color = "blue";
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		
		if(this.on==true)
		{
			return "speed=" + speed + ", on=" + on + ", radius=" + radius + ", color=" + color + "]";
			
		}
		else
		return "Fan is off"  + ", radius=" + radius + ", color=" + color + "]";
	}

	
	
	
}
