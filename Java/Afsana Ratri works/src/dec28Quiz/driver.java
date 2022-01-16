package dec28Quiz;

public class driver {

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
