
public class main {
	
	public static void main(String[] args) {
	
		Fan fan1 = new Fan();
		fan1.setSpeed(3);
		fan1.setColor("yellow");
		fan1.setRadius(10);
		fan1.setOn(true);
		
		Fan fan2 = new Fan();
		fan2.setSpeed(2);
		fan2.setColor("blue");
		fan2.setRadius(5);
		fan2.setOn(false);
		
		
		System.out.println("Fan1 : ");
		System.out.println(fan1);
		
		System.out.println("Fan2 : ");
		System.out.println(fan2);
		
	}

}
