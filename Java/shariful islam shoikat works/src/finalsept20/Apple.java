package finalsept20;

public class Apple extends  Fruit implements Comparable<Apple>{
	
	public Apple(double weight, String color) {
		super(weight, color);
	}


	private String type;
	
	

	@Override
	public int compareTo(Apple a) {
		
		if(this.getWeight()>a.getWeight())
		{
		return 1;
		}
		else if(this.getWeight()<a.getWeight())
			return -1;
		
	return 0;
	}



	@Override
	public String howtoEat() {
		// TODO Auto-generated method stub
		return "eating";
	}
	

}
