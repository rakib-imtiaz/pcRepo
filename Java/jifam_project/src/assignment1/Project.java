package assignment1;
public class Project {

	private String programming_language;
	private int total_no_of_engineers;
	private int project_manager_id;
	private String project_manager_name ;
	private int managerExperience;
	
	public Project() {
		
	}
	
	public Project(String programming_language, int total_no_of_engineers, int project_manager_id,
			String project_manager_name, int managerExperience2) {
		super();
		this.programming_language = programming_language;
		this.total_no_of_engineers = total_no_of_engineers;
		this.project_manager_id = project_manager_id;
		this.project_manager_name = project_manager_name;
		this.managerExperience = managerExperience2;
	}






	public String getProgramming_language() {
		return programming_language;
	}
	public void setProgramming_language(String programming_language) {
		this.programming_language = programming_language;
	}
	public int getTotal_no_of_engineers() {
		return total_no_of_engineers;
	}
	public void setTotal_no_of_engineers(int total_no_of_engineers) {
		this.total_no_of_engineers = total_no_of_engineers;
	}
	public int getProject_manager_id() {
		return project_manager_id;
	}
	public void setProject_manager_id(int project_manager_id) {
		this.project_manager_id = project_manager_id;
	}
	public String getProject_manager_name() {
		return project_manager_name;
	}
	public void setProject_manager_name(String project_manager_name) {
		this.project_manager_name = project_manager_name;
	}
	public int getManagerExperience() {
		return managerExperience;
	}
	public void setManagerExperience(int managerExperience) {
		this.managerExperience = managerExperience;
	}

	@Override
	public String toString() {
		return "Project [programming_language=" + programming_language + ", total_no_of_engineers="
				+ total_no_of_engineers + ", project_manager_id=" + project_manager_id + ", project_manager_name="
				+ project_manager_name + ", managerExperience=" + managerExperience + "]";
	}
	
	
	
	
	
}

