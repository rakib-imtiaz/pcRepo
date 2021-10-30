public class main {

	public static void main(String[] args) {
		ITdepartment a=new ITdepartment();
		ITdepartment b=new ITdepartment();
		ITdepartment c=new ITdepartment();
		ITdepartment d=new ITdepartment();
		ITdepartment e=new ITdepartment();
		
		HRdepartment f=new HRdepartment();
		HRdepartment g=new HRdepartment();
		HRdepartment h=new HRdepartment();
		HRdepartment i=new HRdepartment();
		HRdepartment j=new HRdepartment();
		
		ITdepartment crr[]=new ITdepartment[5];
		crr[0]= new ITdepartment();
		crr[1]=b;
		crr[2]=c;
		crr[3]=d;
		crr[4]=e;
		
		HRdepartment hrr[]=new HRdepartment[5];
		hrr[0]=f;
		hrr[1]=g;
		hrr[2]=h;
		hrr[3]=i;
		hrr[4]=j;
		
		for(int k=0;k<crr.length;k++) {
			System.out.println(crr[k]);
		}
		for(int k=0;k<hrr.length;k++) {
			System.out.println(hrr[k]);
		}
		
      
		
		
		
	}

}