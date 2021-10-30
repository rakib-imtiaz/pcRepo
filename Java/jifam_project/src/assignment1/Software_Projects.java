package assignment1;

public class Software_Projects extends Project{

	private String projectName;
	private int duration;
	
	
	public Software_Projects() {
		
	}
	

	
	public Software_Projects(String projectName, int duration,String programming_language, int total_no_of_engineers, int project_manager_id,
			String project_manager_name, int managerExperience) {
		super(programming_language,total_no_of_engineers, project_manager_id,
				 project_manager_name,managerExperience);
		this.projectName = projectName;
		this.duration = duration;
	}






	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}



	@Override
	public String toString() {
		return "Software_Projects [projectName=" + projectName + ", duration=" + duration
				+ ", getProgramming_language()=" + getProgramming_language() + ", getTotal_no_of_engineers()="
				+ getTotal_no_of_engineers() + ", getProject_manager_id()=" + getProject_manager_id()
				+ ", getProject_manager_name()=" + getProject_manager_name() + ", getManagerExperience()="
				+ getManagerExperience() + ", toString()=" + super.toString() + "]";
	}
	
	
}



