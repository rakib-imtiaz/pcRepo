package def;

public class AccountHolder {
	public int acc_num;
	public String name;
	int balance;
	int age;
	Loan l;
	Nominee n;

	AccountHolder() {
		acc_num = 0;
		name = null;
		balance = 0;
		age = 0;

	}

	AccountHolder(int acc_num, int balance, int ag, String name) {
		this.acc_num = acc_num + 1;
		this.balance = balance;
		age = ag;
		this.name = name;
	}

	public void checkBalance() {
		System.out.println("your balance is: " + balance);
	}

	public void deposit(int dep_amt) {
		balance = balance + dep_amt;
	}

	// added one method using the loan class

	public void checkLoanStatus() {

		System.out.println("Loan Balancec : " + l.balance);

	}

	public void withdraw(int withAmount) {
		if (balance > withAmount) {
			balance = balance - withAmount;
		} else {
			System.out.println("you donot have sufficient balnce");
		}
	}

	public void printInfo() {
		System.out.println("the name of accountholder is: " + name + ", age is: " + age + " account number is: "
				+ acc_num + " and balance is: " + balance);
	}

	public String toString() {
		return name + " " + acc_num + " " + balance;
	}

}
