package quiz_aug1;


public class Burger {
	private String burgerSize;
	private int numberOfCheeseSlices;
	private int numberOfPatties;
	private int numberOfPastaramies;


	@Override
	public String toString() {
		return "Burger [burgerSize=" + burgerSize + ", numberOfCheeseSlices=" + numberOfCheeseSlices
				+ ", numberOfPatties=" + numberOfPatties + ", numberOfPastaramies=" + numberOfPastaramies + "]";
	}

	public Burger(String burgerSize, int numberOfCheeseSlices, int numberOfPatties, int numberOfPastaramies) {
		super();
		this.burgerSize = burgerSize;
		this.numberOfCheeseSlices = numberOfCheeseSlices;
		this.numberOfPatties = numberOfPatties;
		this.numberOfPastaramies = numberOfPastaramies;
	}

	public String getBurgerSize() {
		return burgerSize;
	}

	public void setBurgerSize(String burgerSize) {
		this.burgerSize = burgerSize;
	}

	public int getNumberOfCheeseSlices() {
		return numberOfCheeseSlices;
	}

	public void setNumberOfCheeseSlices(int numberOfCheeseSlices) {
		this.numberOfCheeseSlices = numberOfCheeseSlices;
	}

	public int getNumberOfPatties() {
		return numberOfPatties;
	}

	public void setNumberOfPatties(int numberOfPatties) {
		this.numberOfPatties = numberOfPatties;
	}

	public int getNumberOfPastaramies() {
		return numberOfPastaramies;
	}

	public void setNumberOfPastaramies(int numberOfPastaramies) {
		this.numberOfPastaramies = numberOfPastaramies;
	}

	public double calcCost(Burger burger) {
		double total_bill = 0;

		int bun = 0;

		if (burger.getBurgerSize().equalsIgnoreCase("small") ) {
			bun = 3;

		} else if (burger.getBurgerSize().equalsIgnoreCase("medium") )
			bun = 4;

		else if (burger.getBurgerSize().equalsIgnoreCase("large") )
			bun = 5;
		
		int cheese= burger.getNumberOfCheeseSlices() * 2;
		int pastarami= burger.getNumberOfPastaramies() * 3;
		int patty=burger.getNumberOfPatties() * 10;

		total_bill = bun+cheese+pastarami+patty ;

		return total_bill;

	}

	void getDescription() {
		System.out.println("Bun size of the Burger  : " + this.getBurgerSize());
		System.out.println("Burger patties: " + this.getNumberOfPatties());
		System.out.println("Burger Cheese: " + this.getNumberOfCheeseSlices());
		System.out.println("Burger pastarami: " + this.numberOfPastaramies);
		System.out.println("Burger cost: " + this.calcCost(this));

	}

}
