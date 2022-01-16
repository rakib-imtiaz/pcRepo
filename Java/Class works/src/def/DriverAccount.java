package def;
import java.util.Scanner;
public class DriverAccount {

	public static void main(String[] args) {
		AccountHolder[] bank = new AccountHolder[2];
		
		/*AccountHolder Raiyan = new AccountHolder();
		bank[0]= Raiyan;
		*/
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		int ac_n, age, balance;
		String name;
		for(int iter=0; iter<bank.length;iter++)
		{
			System.out.println("please enter account number:");
			ac_n = in.nextInt();
			System.out.println("please enter your age");
			age = in.nextInt();
			System.out.println("please enter your balance");
			balance = in.nextInt();
			System.out.println("please enter your name: ");
			name = in1.nextLine();
			//name = in.nextLine();
			bank[iter]= new AccountHolder(ac_n, balance, age, name);
		}
		
		for(AccountHolder a:bank)
		{
			System.out.println(a);
		}

	}

}