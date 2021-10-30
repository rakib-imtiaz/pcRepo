package final_sept17;

public class ChargerLight extends  ElectricAppliance implements Rechargeable {
	
	private int numOfBulbs;
	

	public ChargerLight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChargerLight(int voltage, int power) {
		super(voltage, power);
		// TODO Auto-generated constructor stub
	}

	public int getNumOfBulbs() {
		return numOfBulbs;
	}

	public void setNumOfBulbs(int numOfBulbs) {
		this.numOfBulbs = numOfBulbs;
	}

	@Override
	public String howToOperate() {
		// TODO Auto-generated method stub
		return "clicking on the switch";
	}

	@Override
	public String howToCharge() {
		// TODO Auto-generated method stub
		return "pluging the charger";
	}

	@Override
	public String toString() {
		return "ChargerLight [numOfBulbs=" + numOfBulbs + ", getNumOfBulbs()=" + getNumOfBulbs() + ", howToOperate()="
				+ howToOperate() + ", howToCharge()=" + howToCharge() + ", getVoltage()=" + getVoltage()
				+ ", getPower()=" + getPower() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

}
