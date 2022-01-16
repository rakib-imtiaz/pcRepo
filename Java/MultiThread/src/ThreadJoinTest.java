
public class ThreadJoinTest extends Thread {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(i);
		}

	}
	
	public static void main(String[] args) {
		
		ThreadJoinTest t1 =new ThreadJoinTest();
		ThreadJoinTest t2 =new ThreadJoinTest();
		ThreadJoinTest t3 =new ThreadJoinTest();
		
		t1.start();
		
		
		try {
			t1.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		
		
		t3.start();
		
		
		
	}

}
