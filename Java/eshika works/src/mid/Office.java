package mid;

public class Office {
	
	private String Name;
	private String loaction;
	private int totalExperience;
	
	public Office() {
		// TODO Auto-generated constructor stub
	}
	public Office(String name, String loaction, int totalExperience) {
		super();
		Name = name;
		this.loaction = loaction;
		this.totalExperience = totalExperience;
	}
	
	
	@Override
	public String toString() {
		return "Office [Name=" + Name + ", loaction=" + loaction + ", totalExperience=" + totalExperience + "]";
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLoaction() {
		return loaction;
	}
	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}
	public int getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}
	
	

}