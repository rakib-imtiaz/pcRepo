package dec7_Assignment1;

public class test {
	
	public static void main(String[] args) {
		
		Box box1 = new Box(12,34,45);
		Box box2 = new Box();
		box2.setDim(23, 2, 43);
		
		System.out.println("Volume     : "+box1.volume());
		System.out.println("Equals to  : "+box1.equalTo(box2));
		System.out.println(box1);
		System.out.println(box2);
		
		
	}

}
