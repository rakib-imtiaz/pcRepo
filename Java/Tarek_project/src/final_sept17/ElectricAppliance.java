package final_sept17;

public abstract class   ElectricAppliance {
	
	private int voltage;
	private int power;
	
	
	
	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public ElectricAppliance() {
		super();
	}

	public ElectricAppliance(int voltage, int power) {
		super();
		this.voltage = voltage;
		this.power = power;
	}
	
	public abstract String  howToOperate();

	@Override
	public String toString() {
		return "ElectricAppliance [voltage=" + voltage + ", power=" + power + "]";
	} 
	
	

}
