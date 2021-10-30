
import java.util.Arrays;

public class Bank {
	private Account accounts[];
	private int numOfAccount = 0;

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(int size) {
		accounts = new Account[size];

	}

	public Bank(Account[] accounts, int numOfAccount) {
		super();
		this.accounts = accounts;
		this.numOfAccount = numOfAccount;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public int getNumOfAccount() {
		return numOfAccount;
	}

	public void addAccount(Account account) {
		this.accounts[numOfAccount++] = account;

	}

	public void printAccountinfo(int accountNumber) {

		Account accountInfo[] = getAccounts();

		for (int i = 0; i < this.getNumOfAccount(); i++) 
		{
			int fetchedData=accountInfo[i].getAccountNumber();
			
			
			

			if (fetchedData == accountNumber) {
				
				int number=accountInfo[i].getAccountNumber();
				String name=accountInfo[i].getAccountName();
				double balance=accountInfo[i].getBalance();
				System.out.println("A/C no               :" + number);
				System.out.println("Account Holder Name : " + name);
				System.out.println("Balance             :" + balance);

			}
		}

	}

	@Override
	public String toString() {
		return "Bank [accounts=" + Arrays.toString(accounts) + ", numOfAccount=" + numOfAccount + "]";
	}

}
