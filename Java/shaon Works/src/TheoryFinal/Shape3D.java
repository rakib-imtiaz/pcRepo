package TheoryFinal;

public abstract class Shape3D implements Comparable<Shape3D> {

	private boolean filled;

	public Shape3D(boolean filled) {
		super();
		this.filled = filled;
	}

	@Override
	public int compareTo(Shape3D arg0) {
		// TODO Auto-generated method stub
		return arg0.compareTo(arg0);
	}
}
