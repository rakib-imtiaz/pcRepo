package mid;
public class CSE extends ETE {
	  private int semester;
	  private int totalCourse;
	  
	  public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getTotalCourse() {
		return totalCourse;
	}

	public void setTotalCourse(int totalCourse) {
		this.totalCourse = totalCourse;
	}

	void maxScore(CSE arr[]) {
		  int max;
		 {
			  max=0;
			  for(int i=1;i<arr.length;i++) {
				  if(totalCourse>5 && arr[i].getAge()>19 && arr[i].getAge()<26)
				  {
				  if(arr[i].getMarks()>arr[max].getMarks()) {
					  max=i;
				  }
				  }
			  }
		  }
		  System.out.println(arr[max]);
	  }
	
	

	public CSE(int semester, int totalCourse) {
		super();
		this.semester = semester;
		this.totalCourse = totalCourse;
	}

	public CSE() {
		// TODO Auto-generated constructor stub
	}
	  
	}