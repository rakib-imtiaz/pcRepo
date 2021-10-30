package work;public class Player extends Person{
	 private int jerseyNumb;
	 private int numOfGoals;
	 private String position;
	 private double salary;
	 private int noOfWickets;
	 private double noOfRuns;
	 
	public int getNoOfWickets() {
		return noOfWickets;
	}
	public void setNoOfWickets(int noOfWickets) {
		this.noOfWickets = noOfWickets;
	}
	public double getNoOfRuns() {
		return noOfRuns;
	}
	public void setNoOfRuns(double noOfRuns) {
		this.noOfRuns = noOfRuns;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Player(String name, int age, String dateOfBirth, int phonenumber,int jerseyNumb,int numOfGoals,String position,int salary) {
		super(name, age, dateOfBirth, phonenumber);
		this.jerseyNumb=jerseyNumb;
		this.numOfGoals=numOfGoals;
		this.position=position;
		this.salary=salary;
	}
	public Player(String name, int age, String dateOfBirth, int phonenumber,int jerseyNumb,int numOfWickets,double noOfRuns,int salary) {
		super(name, age, dateOfBirth, phonenumber);
		this.jerseyNumb=jerseyNumb;
		this.noOfWickets=numOfWickets;
		this.noOfRuns=noOfRuns;
		this.salary=salary;
	}
	public int getJerseyNumb() {
		return jerseyNumb;
	}
	public void setJerseyNumb(int jerseyNumb) {
		this.jerseyNumb = jerseyNumb;
	}
	public int getNumOfGoals() {
		return numOfGoals;
	}
	public void setNumOfGoals(int numOfGoals) {
		if(numOfGoals>=0) {
		this.numOfGoals = numOfGoals;
		}else {
			System.out.println("GOALS CANT BE NEGATIVE");
		}
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int addGoals(int goals) {
		numOfGoals+=goals;
		return numOfGoals;
	}
	@Override
	public String toString() {
		return "Player [jerseyNumb=" + jerseyNumb + ", numOfGoals=" + numOfGoals + ", position=" + position + ", name="
				+ name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", phonenumber=" + phonenumber + "]";
	}
	public double getSalary() {
		return salary;
	}

	}