
public class CreatingThreadByExtendingThread  extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread is working....");
	
	}
	
	public static void main(String[] args) {
		
		CreatingThreadByExtendingThread m = new CreatingThreadByExtendingThread();
		m.start();
		
		
	}

}
