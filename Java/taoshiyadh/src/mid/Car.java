package mid;

public class Car {
	private double weight;
	private double speed_per_gear;
	private double no_of_gears;

	public Car() {
	}

	public Car(double weight, double speed_per_gear, double no_of_gear) {
		super();
		this.weight = weight;
		this.speed_per_gear = speed_per_gear;
		this.no_of_gears = no_of_gear;
	}

	public double calcMaxSpeed() {

		double maxSpeed = (0.025 *weight * speed_per_gear * no_of_gears);

		return maxSpeed;

	}

	void compare(Car carObject) {

		double a = this.calcMaxSpeed();
		double b = carObject.calcMaxSpeed();
		if (a > b) {
			System.out.println("Car 1 is faster than car 2");

		} else {
			System.out.println("car 2 is faster than car 1");

		}

	}

}
