package mid;

public class University {
	 private String uniName;
	 private int estYear;
	 private int totalStudent;
	public String getUniName() {
		return uniName;
	}
	public void setUniName(String uniName) {
		this.uniName = uniName;
	}
	public int getEstYear() {
		return estYear;
	}
	public void setEstYear(int estYear) {
		this.estYear = estYear;
	}
	public int getTotalStudent() {
		return totalStudent;
	}
	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}
	@Override
	public String toString() {
		return "University [uniName=" + uniName + ", estYear=" + estYear + ", totalStudent=" + totalStudent + "]";
	}
	}
