package dec7_Assignment1;

public class Box {
	private double width;
	private double height;
	private double depth;

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box(Box box) {

		this.depth = box.depth;
		this.width = box.width;
		this.height = box.height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public void setDim(double width,double height, double depth ) {
		this.height = height;
		this.width = width;
		this.depth =depth;
	}
	
	public boolean equalTo(Box o)
	{
		if(this.depth==o.depth && this.width==o.width && this.height==o.height)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public double volume()
	{
		return this.depth*this.height*this.width;
		
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	public static void main(String[] args) {
		
		
		
	}
	


}
