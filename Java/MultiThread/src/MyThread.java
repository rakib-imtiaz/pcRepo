
public class MyThread extends Thread {
	
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.run();
		
		
	}
	@Override
	public void run() {
		for(int i=1;i<3;++i)
		{
			System.out.println(i +"..");
		}
		
	}

}

