package final_sept17;

public class CeilingFan extends ElectricAppliance {
	
	private int numOfBlades;
	



	public int getNumOfBlades() {
		return numOfBlades;
	}





	public void setNumOfBlades(int numOfBlades) {
		this.numOfBlades = numOfBlades;
	}





	public CeilingFan(int voltage, int power) {
		super(voltage, power);
		// TODO Auto-generated constructor stub
	}





	@Override
	public String toString() {
		return "CeilingFan [numOfBlades=" + numOfBlades + ", getNumOfBlades()=" + getNumOfBlades() + ", howToOperate()="
				+ howToOperate() + ", getVoltage()=" + getVoltage() + ", getPower()=" + getPower() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}





	@Override
	public String howToOperate() {
		// TODO Auto-generated method stub
		return "turning on the switch";
	}
	
	

}
