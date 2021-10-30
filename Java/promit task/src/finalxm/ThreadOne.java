package finalxm;

public class ThreadOne extends Thread{
	
	@Override
	public void run() {
		NumberComputator n = new NumberComputator();
		n.printPrime(100);
		
	}
	
	

}
