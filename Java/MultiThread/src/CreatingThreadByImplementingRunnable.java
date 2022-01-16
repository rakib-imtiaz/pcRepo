
public class CreatingThreadByImplementingRunnable implements Runnable{

	@Override
	public void run() {
		
		System.out.println("System is working....");
		
	}
	
	public static void main(String[] args) {
		CreatingThreadByExtendingThread a = new CreatingThreadByExtendingThread();
		
		Thread t = new Thread(a);
		
		t.start();
		
		
	}

}
