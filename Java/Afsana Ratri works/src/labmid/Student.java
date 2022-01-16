package labmid;



public class Student {
	
	private String name,status="JUNIOR" ;;
	private int id=1,marks=0;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Student(String name, int id, int marks, String status) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.status = status;
	}

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		
		this.status = status;
	}
	
	
	 public void addMarks(int marks)
	 {
		 this.marks=marks;
	 }

	@Override
	public String toString() {
		return "Student [name=" + name + ", status=" + status + ", id=" + id + ", marks=" + marks + "]";
	}
	
	 

}