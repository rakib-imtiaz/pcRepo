package quiz;


public class Exam {

	private String examType;
	private String ExamName;
	private double totalMarks;
	private String attemptingStudents;

	public Exam(String examType, String examName, double totalMarks) {
		examType = examType;
		ExamName = examName;
		this.totalMarks = totalMarks;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		examType = examType;
	}

	public String getExamName() {
		return ExamName;
	}

	public void setExamName(String examName) {
		ExamName = examName;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getAttemptingStudents() {
		return attemptingStudents;
	}

	public void setAttemptingStudents(String attemptingStudents) {
		this.attemptingStudents = attemptingStudents;
	}
	
	

}
