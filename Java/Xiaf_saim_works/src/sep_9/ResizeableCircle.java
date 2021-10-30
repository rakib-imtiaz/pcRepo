package sep_9;

public class ResizeableCircle extends Circle implements Resizeable  {

	
	public ResizeableCircle(double radius) {
	
		super(radius);
	}

	@Override
	public void resize(int percent) {
		radius=radius+(radius+(percent/100.0));
		
	}
	

}
