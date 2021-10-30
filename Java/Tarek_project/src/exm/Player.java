package exm;

public class Player {
	private String name;
	private double time;
	private double speed;
	private String event;

	public Player(String name, double time) {
		this.name = name;
		this.time = time;
	}

	public Player() {
		name = null;
		time = 1;
		speed = 0;
		event = null;

	}

	public Player(String name, double time, double speed, String event) {
		super();
		this.name = name;
		this.time = time;
		this.speed = speed;
		this.event = event;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void addTime(double time) {
		this.time += time;
	}

	public String toString() {
		return "Player [name=" + name + ", time=" + time + ", speed=" + speed + ", event=" + event + "]";
	}

}