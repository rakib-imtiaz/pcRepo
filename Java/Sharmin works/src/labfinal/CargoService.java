package labfinal;

public class CargoService implements Courier{
	private double cargoFee;
	private double weight;
	
	public CargoService() {
		// TODO Auto-generated constructor stub
	}

	public CargoService(double cargoFee, double weight) {
		super();
		this.cargoFee = cargoFee;
		this.weight = weight;
	}
	
	

	public double getCargoFee() {
		return cargoFee;
	}

	public void setCargoFee(double cargoFee) {
		this.cargoFee = cargoFee;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public void payment() {
		
		
		double s;
		double total = 0;

		if(this.weight>5)
		{
			s=weight%5;
			total=total+(s*100);
			
		}
		
		total=total+cargoFee*.15;
		
		System.out.println("Total payment : "+total);
		
	}

	@Override
	public void displayinfo() {
		payment();
		
		System.out.println("cargoo fee: "+this.cargoFee);
		System.out.println("Weight fee: "+this.weight);
		
	}
	
	
	
	
	

}
