package finalxm;

public class Threadtwo extends Thread {

	@Override
	public void run() {
		NumberComputator n = new NumberComputator();
		n.printPrime(100);

	}

}
