
public class Account {
	
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private String date;
	public Account() {
		id=0;
		balance=0;
		annualInterestRate=0;
		date=null;
	}
		
		 Account(int id,double balance)
		{
			this.id=id;
			this.balance=balance;
			
			
		}
		
		
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public String getDate() {
		return date;
	}
	
	double getMonthlyInterestRate()
	{
		
		double amount=annualInterestRate/12;
		return amount;
		
		
	}
	void withdrawAmount(double tk)
	{
		
		balance=balance-tk;		
		
		
	}
	void deposite(double tk)
	{
		
		balance=balance+tk;		
		
		
	}

	
}



class main
{
	public static void main(String[] args) {
		
		Account account =new Account(1122,20000);
		account.setAnnualInterestRate(4.5);
		account.withdrawAmount(2500);
		account.deposite(3000);
		
		
		System.out.println("Balance: "+account.getBalance());
		System.out.println("Monthly : "+account.getMonthlyInterestRate());
		System.out.println("Date : "+account.getMonthlyInterestRate());
		
		
	}


}

