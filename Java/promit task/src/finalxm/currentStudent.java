package finalxm;

public class currentStudent {
	
	
	Student s = new Student() {
		
		@Override
		public void fees(double totalfees) {
			
			if(s.getCgpa()>3.90)
			{
				totalfees=0;
			}
			else if(s.getCgpa()<3.90 && s.getCgpa()>3.50)
			{
				totalfees=totalfees-totalfees*0.5;
			}
			else {
				
				totalfees=totalfees;
			}
			
			
		}
	};
	
	

}
