package labfinal;

public class Thread2 extends Thread {
	public void run() {
		for(int i=0;i<2;i++)
		{
			System.out.println(" 2013078042 \n");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
	}


}
