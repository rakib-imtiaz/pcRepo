package sep_16;

public class main {
	
	public static void main(String[] args) {
		
		Shape circ = new Circle(23.56);
		circ.setColor("red");
		circ.setFilled(true);
		Shape rec = new Rectangle(12,23);
		rec.setColor("yellow");
		rec.setFilled(false);
		
		System.out.println(circ);
		System.out.println(rec);
		
	
		
	}

}
