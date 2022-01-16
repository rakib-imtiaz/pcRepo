

public class Bachelor extends Engineering{
	
	private double courseCount;
	public Bachelor() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Bachelor(int id, String name,double courseCount) {
		super(id, name);
		this.courseCount=this.courseCount;
		// TODO Auto-generated constructor stub
	}


	public double getCourseCount() {
		return courseCount;
	}
	public void setCourseCount(double courseCount) {
		this.courseCount = courseCount;
	}
	
	@Override
	public double tuition() {
		
		double fee=this.courseCount*16500;
		return fee;
	}
	@Override
	public String toString() {
		return "Bachelor [courseCount=" + courseCount + ", getCourseCount()=" + getCourseCount() + ", tuition()="
				+ tuition() + ", getId()=" + getId() + ", getName()=" + getName() + ", print()=" + print()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	

}
