package mid;

public class Office {
	
	private String companyName;
	private String loaction;
	private int totalExperience;
	
	public Office() {
		// TODO Auto-generated constructor stub
	}
	public Office(String name, String loaction, int totalExperience) {
		super();
		companyName = name;
		this.loaction = loaction;
		this.totalExperience = totalExperience;
	}
	
	
	


	@Override
	public String toString() {
		return "Office [companyName=" + companyName + ", loaction=" + loaction + ", totalExperience=" + totalExperience
				+ "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
