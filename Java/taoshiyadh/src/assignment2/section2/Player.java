package assignment2.section2;

public class Player implements Salary {
	
	private String name;
	private int age;
	private double experience;
	private double salary;
	private String joining_date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public double getSalary() {
		
		return calcSalary();
	}
	
	public String getJoining_date() {
		return joining_date;
	}
	public void setJoining_date(String joining_date) {
		this.joining_date = joining_date;
	}
	public Player(String name, int age, double experience, double salary, String joining_date) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
		this.joining_date = joining_date;
	}
	public Player() {
		super();
	}
	
	@Override
	public String toString() {
		return "Player [\nName=" + name + "\nAge=" + age + "\nExperience=" + experience + "\nSalary=" + this.getSalary()
				+ "\nJoining_date=" + joining_date + "]\n\n";
	}
	@Override
	public double calcSalary() {
		
		return this.experience*1250;
	}
	

}
