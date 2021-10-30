package mid;

public class main {
	public static void main(String[] args) {
		
		
		ETE  ete[] = new ETE[5];
		CSE  cse[] = new CSE[5];
		
		ete[1]=new ETE("jarin",31,181,1020);
		ete[2]=new ETE("amrin",24,181,1200);
		ete[3]=new ETE("safa",15,181,20);
		ete[4]=new ETE("farzan",26,181,45);
		ete[5]=new ETE("mitu",27,181,34);
		cse[0]=new CSE(12,18);
		cse[1]=new CSE(113,1);
		cse[4]=new CSE(12,23);
		cse[5] =new CSE(4,6);
		cse[6]=new CSE(1,3);
		
		for(int i=0;i<ete.length;i++)
		{
			System.out.println(ete[i].toString());
			
			
		}
		
		for(int i=0;i<cse.length;i++)
		{
			System.out.println(cse[i].toString());
			
			
		}
		
		ETE e = new ETE();
		
		e.evenAverage(ete);
		System.out.println("min socre: "+e.minScore(ete));
		
		
		
		
		
		
		
	}

}
