
public class MultiThread implements Runnable {

	String name;
	Thread t;

	public MultiThread(String threadname) {

		name = threadname;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();

	}

	@Override
	public void run() {
		
		for(int i=5;i>0;i--)
		{
			System.out.println("name :  "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(name + "Exiting .");

	}

	public static void main(String[] args) {

		new MultiThread("one");
		new MultiThread("two");
		new MultiThread("three");

	}

}
