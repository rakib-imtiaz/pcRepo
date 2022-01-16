package dec28Quiz;

public class BankC extends Bank{
	
	

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
		
		double interest=super.principal*getPercentage()*super.term;
		return interest;
	}

}
