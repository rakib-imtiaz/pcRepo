public class Addition implements Runnable {

	int num1 = 10, num2 = 20;

	Addition() {
		Thread thNum1 = new Thread() {
			public void run() {
				System.out.println(num1+num2);
			}
		};
		thNum1.start();

		Thread thNum2 = new Thread() {
			public void run() {
				System.out.println(num1+num2);
				}
			}
		
		thNum2.start();

		Thread thSum = new Thread() {
			// run method from runnable interface
			public void run() {
				// sum of 2 random numbers
				int sum = num1 + num2;
				System.out.println("The sum of " + num1 + " +" + num2 + " =" + sum);
			}
		};
		thSum.start();
	}

	public static void main(String[] arguement) {
		RandomThread rt = new RandomThread();
	}

	
}