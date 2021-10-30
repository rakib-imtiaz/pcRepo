
public class Apple extends Fruit {
	
	private String varieties;
	
	
	public void setSeason(String season) {
		super.setSeason(season);
	}
	
	
	public String getSeason() {
		return super.getSeason();
	}
	
	public String getVarieties() {
		return varieties;
	}




	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}




	public String toString() {
		return "Apple [varieties= " + varieties + "     Color()  =" + getColor()
				+ "   Seed = " + getSeed() +"   Season() = " + getSeason() +"]";
	}
	
	
	
	


	

	
	
	
	
	
	
	

}
