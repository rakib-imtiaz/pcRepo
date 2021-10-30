package finalxm;

public abstract class Student {
	
	private String name;
	private int id;
	private double cgpa;
	private double totalfees;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getCgpa() {
		return cgpa;
	}


	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}


	public double getTotalfees() {
		return totalfees;
	}


	public void setTotalfees(double totalfees) {
		this.totalfees = totalfees;
	}

	

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", cgpa=" + cgpa + ", totalfees=" + totalfees + "]";
	}


	abstract public void fees(double totalfees);
}
