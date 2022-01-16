package quiz;

public class Surgeon extends Doctor {
	
	private String operate;
	private int timeHour;
	
	
	
	public Surgeon(String name, int age, String specialization, double hourlyRate, String operate, int timeHour) {
		super(name, age, specialization, hourlyRate);
		this.operate = operate;
		this.timeHour = timeHour;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	public int getTimeHour() {
		return timeHour;
	}
	public void setTimeHour(int timeHour) {
		this.timeHour = timeHour;
	}
	
	public double getSalary()
	{
		
		return getHourlyRate()*this.timeHour;
		
	}

}
