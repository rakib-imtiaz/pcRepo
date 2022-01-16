
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

		BankA a = new BankA(7, 1000, 3);
		BankB b = new BankB(7.5, 1500, 3);
		BankC c = new BankC(8, 2000, 3);

		Bank arr[] = new Bank[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;

		double max = arr[0].getInterest();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getInterest() > max) {
				max = arr[i].getInterest();
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
		
		double interest=super.principal*getPercentage()*super.term;
		return interest;
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
		
		double interest=super.principal*getPercentage()*super.term;
		return interest;
	}
}


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


