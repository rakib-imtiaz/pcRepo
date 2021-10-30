package finalxm;

 class Shape<T> {
	private T shapinfo;
	private double area;
	private double volume;
	
	
	
	public Shape(T shapinfo, double area, double volume) {
		super();
		this.shapinfo = shapinfo;
		this.area = area;
		this.volume = volume;
	}
	public T getShapinfo() {
		return shapinfo;
	}
	public void setShapinfo(T shapinfo) {
		this.shapinfo = shapinfo;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) throws NegativeValueException, OverflowException {
		
		if(area<0)
		{
			throw new NegativeValueException(area); 
		}
		else if(area> Double.MAX_VALUE)
		{
			
			throw new OverflowException(area);
		}
		else{
			this.area = area;
		}
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) throws NegativeValueException, OverflowException {
		
		if(volume<0)
		{
			throw new NegativeValueException(volume); 
		}
		else if(volume>Double.MAX_VALUE)
		{
		throw new OverflowException(volume);
			
		}
	}
	@Override
	public String toString() {
		return "Shape [shapinfo=" + shapinfo + ", area=" + area + ", volume=" + volume + "]";
	}
	
	
	
	
	
	
	

}
