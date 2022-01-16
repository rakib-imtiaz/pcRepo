package mid_215;

public class Masters extends Engineering{
	private String thesisField;
	private double researchAmount;
	public Masters() {
		// TODO Auto-generated constructor stub
	}
	

	
	public Masters(int id, String name,String thesisField,double researchAmount) {
		super(id, name);
		this.researchAmount=researchAmount;
		this.thesisField=thesisField;
		// TODO Auto-generated constructor stub
	}



	@Override
	public double tuition() {
		
		double fee=researchAmount+researchAmount*1.0;
		return fee;
	
	
	

}
}