package mid;
public class ETE extends University {
	 private String stdName;
	 private int age;
	 private int stdId;
	 private int marks;
	 
	 
	  public ETE() {
	}
	 public ETE(String stdName, int age, int stdId, int marks) {
		super();
		this.stdName = stdName;
		this.age = age;
		this.stdId = stdId;
		this.marks = marks;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public double evenAverage(ETE arr[]) {
		 int count=0;
		 double average=0;
		 int sum=0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i].getAge()%2==0) {
		 		 sum=sum+arr[i].getAge();
				count++;
			 }
		 }
		  average=sum/count;
		  System.out.println("SUM IS " + sum);
		  return average;
	 }
	 public ETE minScore(ETE arr[]) {
		 int min=0;
		 for(int i=1;i<arr.length;i++) {
			 if(arr[i].getMarks()<arr[min].getMarks()) {
				 min=i;
			 }
		 }
			 if(arr[min].getMarks()%2!=0) {
				 System.out.println(arr[min].getMarks());
			 }
			return arr[min];
		
	 }
	  public String toString() {
		  return stdName+" "+age+ " "+ stdId+ " "+ marks;
	  }
	}