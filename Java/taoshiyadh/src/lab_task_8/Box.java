package lab_task_8;

public class Box {
	
	private double width,height,depth;
	
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

	public Box(double len) {
		this.width=len;
		
	}
	
	public Box(double width,double height,double depth) {
	}

	public Box(Box box) {
		width=box.width;
		height=box.height;
		depth=box.depth;
	}
	public Box() {
		// TODO Auto-generated constructor stub
	}
	public void setDim(double width,double height,double depth)
	{	
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	public boolean equalTo(Box o)
	{
		if(width==o.width && height==o.height && depth==o.depth)
			return true;
		else
			return false;
		
		
	}
	public double volume()
	{
		return width*height*depth;
		
		
	}

	@Override
	public String toString() {
		return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
	}
	

}
