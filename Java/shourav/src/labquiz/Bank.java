package labquiz;


public abstract class Bank {
	double principal;
	double annualInterestRate;
	double term;
	
	public Bank(double principal, double annualInterestRate, double term) {
		super();
		this.principal = principal;
		this.annualInterestRate = annualInterestRate;
		this.term = term;
	}
	abstract double  getPercentage() ;
	abstract double getInterest();
	

	public static void main(String[] args) {

		BankA a = new BankA(5, 1200, 3);
		BankB b = new BankB(6.5, 1700, 3);
		BankC c = new BankC(7.5, 2100, 3);

		Bank bankArray[] = new Bank[3];
		bankArray[0] = a;
		bankArray[1] = b;
		bankArray[2] = c;

		double max = bankArray[0].getInterest();
		for (int i = 0; i < bankArray.length; i++) {
			if (bankArray[i].getInterest() > max) {
				max = bankArray[i].getInterest();
			}
		}
		
		
		System.out.println("Maximum Interest   :"+max);

	}


}

 class BankA extends Bank{

	
	

	public BankA(double principal, double annualInterestRate, double term) {
		super(principal, annualInterestRate, term);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPercentage() {
		double s=super.annualInterestRate/100;
		return s;
	}

	@Override
	double getInterest() {
		
		double compoundInterest;
		return compoundInterest=super.principal*Math.pow(1+getInterest(),super.term)-super.principal;
		
	}


}



 class BankB extends Bank{

	public BankB(double principal, double annualInterestRate, double term) {
		super(principal, annualInterestRate, term);
		// TODO Auto-generated constructor stub
	}


	@Override
	double getPercentage() {
		double s=super.annualInterestRate/100;
		return s;
	}

	@Override
	double getInterest() {
		
		double compoundInterest;
		return compoundInterest=super.principal*Math.pow(1+getInterest(),super.term)-super.principal;
		
	}
}


 class BankC extends Bank{
	
	

	public BankC(double principal, double annualInterestRate, double term) {
		super(principal, annualInterestRate, term);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getPercentage() {
		double s=super.annualInterestRate/100;
		return s;
	}

	@Override
	double getInterest() {
		
		double compoundInterest;
		return compoundInterest=super.principal*Math.pow(1+getInterest(),super.term)-super.principal;
		
	}
}


