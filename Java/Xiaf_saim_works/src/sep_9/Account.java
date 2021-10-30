package sep_9;

public class Account {
	private String id;
	private String name;
	private int balance=0;
	
	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public  int credit(int amount)
	{
		balance=balance+amount;
		
		return balance;
	}
	public  int debit(int amount)
	{
		
		if(amount<=balance)
		{
			balance=balance-amount;

		}
		else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public void transferto(Account another,int amount)
	{
		
		another.setBalance(another.balance+amount);
	
		
		
	}
	

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
}
