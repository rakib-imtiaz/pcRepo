
import java.util.ArrayList;

public class maintester {
	public static void main(String[] args) {
		
		double rent=50470*.50;
		ArrayList<FullTimeEmployee> fulllist = new ArrayList();
		ArrayList<PartTimeEmployee> partlist = new ArrayList();

		FullTimeEmployee abbas = new FullTimeEmployee(50470,900,rent);
		FullTimeEmployee kuddus = new FullTimeEmployee(50470,900,rent);
		FullTimeEmployee shafin = new FullTimeEmployee(50470,900,rent);
		PartTimeEmployee younus = new PartTimeEmployee(35000);
		PartTimeEmployee kunil = new PartTimeEmployee(35000);

		
		fulllist.add(abbas);
		fulllist.add(kuddus);
		fulllist.add(shafin);
		partlist.add(younus);
		partlist.add(kunil);
		
		double sum=0;
		for(int i=0;i<fulllist.size();i++)
		{
			sum=sum+fulllist.get(i).salary();
			
		}
		for(int i=0;i<fulllist.size();i++)
		{
			sum=sum+partlist.get(i).salary();
			
		}
	}
}
