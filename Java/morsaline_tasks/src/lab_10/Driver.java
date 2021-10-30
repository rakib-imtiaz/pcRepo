
public class Driver {
	
	public static void main(String[] args) {
		
		
		Account a1 = new Account(132, "Abdul", 5000);
		Account a2 = new Account(142, "Kader", 1000);
		Account a3 = new Account(152, "Sumit", 1500);
		Account a4 = new Account(162, "Shakib", 5000);
		Bank scb = new Bank(5);
		
		scb.addAccount(a1);
		scb.addAccount(a2);
		scb.addAccount(a3);
		scb.addAccount(a4);
		
		System.out.println("Information of account 132\n\n");
		scb.printAccountinfo(132);
		
		System.out.println("\n\nBankers Information: ");

		Account infoArray[]=scb.getAccounts();
		for(int i=0;i<4;i++)
		{
			System.out.println(infoArray[i].toString());
			
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Total A/c: "+scb.getNumOfAccount());
		
		
		
		
		
	}

}
