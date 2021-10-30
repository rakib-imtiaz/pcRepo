
public class Mango extends Fruit {
	
	private String propagation;

	public String getPropagation() {
		return propagation;
	}

	public void setPropagation(String propagation) {
		this.propagation = propagation;
	}
	
	
	public void setSeason(String season) {
		super.setSeason(season);
	}
	
	public String getSeason() {
		return super.getSeason();
	}
	

	public String toString() {
		return "Mango [propagation =  "+propagation+"    Color()  ="
				+ getColor() + "     Seed()  =" + getSeed() + "   Season()  =  " + getSeason()+"]";
	}
	
	
	
	

}