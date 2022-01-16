package labfinal;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0;i<3;i++)
		{
			System.out.println("Name : Sharmin Zaman Mou");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}

}
