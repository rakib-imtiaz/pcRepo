

public class Engineering {
	private int id;
	private String name;
	public Engineering() {
		// TODO Auto-generated constructor stub
	}
	public Engineering(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double tuition ()
	{
		return 0.0;
	}
	public String print()
	{
		return "Name : "+this.name+"Id : "+this.id;
		
	}

}
