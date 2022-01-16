package FinalTheory;

public class Modifier {
	int x;
	int y;
	public Modifier() {
		// TODO Auto-generated constructor stub
	}
	
	public  void change(int x, int y) {
		this.x = x - 10;
		this.y = y + 10;
	}

	public static void main(String[] args) {

		int x = 40;
		int y = 20;
		
		Modifier modifier = new Modifier();
		modifier.x=x;
		modifier.y=y;
		modifier.change(x, y);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
