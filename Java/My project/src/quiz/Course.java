package quiz;


public class Course {
	
	private int courseCode;
	private String courseName;
	private int secNo;
	private Exam exams;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseCode, String courseName, int secNo) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.secNo = secNo;
	}

	public Exam getExams() {
		return exams;
	}

	public void setExams(Exam exams) {
		this.exams = exams;
	}

	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getSecNo() {
		return secNo;
	}

	public void setSecNo(int secNo) {
		this.secNo = secNo;
	}
	
	
	
	
	
	
	
	
	
	

}
