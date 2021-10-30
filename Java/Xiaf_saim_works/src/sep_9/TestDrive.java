package sep_9;

public class TestDrive {
	public static void main(String[] args) {
		
		
		
		Account jubin = new Account("Jubin","1234",5000);
		Account arijit = new Account("arijit","5678",1000);
		
		System.out.println(jubin);

		jubin.credit(2500);
		System.out.println(jubin);
		
	
		arijit.debit(3000);
		System.out.println(arijit);
		
		jubin.transferto(arijit, 3400);
		
		System.out.println(jubin);
		System.out.println(arijit);
	}

}
