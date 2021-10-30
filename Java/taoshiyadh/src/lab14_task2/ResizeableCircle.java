package lab14_task2;

public class ResizeableCircle extends Circle implements Resizeable  {

	
	public ResizeableCircle(double radius) {
	
		super(radius);
	}

	@Override
	public void resize(int percent) {
		radius=radius+(radius+(percent/100.0));
		
	}
	

}
