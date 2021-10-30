package quiz_aug3;

public class Student {
	private static final int FRESHER = 1;
	private static final int JUNIOR = 2;
	private static final int SENIOR = 3;
	private int status=FRESHER;
	private int id=123;
	private int credit=12;
	private boolean active=false;
	private String name=null;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getFresher() {
		return FRESHER;
	}
	public static int getJunior() {
		return JUNIOR;
	}
	public static int getSenior() {
		return SENIOR;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		
		if(this.active==true)
		{
			return "Student [status=" + status + ", id=" + id + ", credit=" + credit + ", active=" + active + ", name="
					+ name + "]";
	
		}
		else {
			return "Student [status=" + status + ", id=" + id + ", name="
					+ name + "student has dropped this semester"+ "]";

			
		}
	}
	
	


}
