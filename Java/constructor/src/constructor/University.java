package constructor;

public class University {

	private double totalStudents;
	private double totalFaculties;
	private String pass;

	public University() {
		// TODO Auto-generated constructor stub
	}

	public University(int totalStudents, int totalFaculties, String location) {

		this.totalFaculties = totalFaculties;
		this.pass = location;
		this.totalStudents = totalStudents;

	}


	public double getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(double totalStudents) {
		this.totalStudents = totalStudents;
	}

	public double getTotalFaculties() {
		return totalFaculties;
	}

	public void setTotalFaculties(double totalFaculties) {
		this.totalFaculties = totalFaculties;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "University [totalStudents=" + totalStudents + ", totalFaculties=" + totalFaculties + ", pass=" + pass
				+ "]";
	}

	

}
