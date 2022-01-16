
public class Driver {
	

public static void main(String[] args) {
		
		Bachelor a = new Bachelor(23232,"Neoo",10.0);
		a.setCourseCount(120);
		
		System.out.println("Fee of bachelor : "+a.tuition());
		
		Masters masters = new Masters(3223,"Abbas","Dta science",11200);
		
		System.out.println("MAster fee: "+masters.tuition());
		
	}
	

}
