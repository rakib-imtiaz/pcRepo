package lablast;

public abstract class Vehicle {

	private String color;
	private int IDnumber;
	private String model;

	
	
	public Vehicle(String color, int iDnumber, String model) {
		super();
		this.color = color;
		IDnumber = iDnumber;
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(int iDnumber) throws InputWrongException {

		if (iDnumber < 0) {
			throw new InputWrongException(iDnumber);
		}
		IDnumber = iDnumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", IDnumber=" + IDnumber + ", model=" + model + "]";
	}

	abstract void wheels();

}
