package mid;

public abstract class Employee {
	private String id;
	private String name;

	abstract double salary();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}