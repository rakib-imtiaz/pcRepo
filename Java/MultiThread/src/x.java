
public class x implements Runnable {

	@Override
	public void run() {
		System.out.println("x");

	}

	public static void main(String[] args) {

		X objectOne = new X();

		Thread Threadone = new Thread(objectOne);
		Threadone.start();

	}

}
