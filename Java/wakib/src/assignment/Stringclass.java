package assignment;

public class Stringclass {


	public static void main(String[] args) {
		final String[] columnNames = { "ID", "First Name", "Last Name ", "Email", "Gemder" };
		final String[][] data = { { "1", "Giulio", "Doerren", "gdoerren0@amazon.co.jp", "Male" },
				{ "2", "Vickie", "Doncom", "vdoncom1@abc.net.au", "Male" },
				{ "3", "Ameline", "Kill", "akill2@amazonaws.com", "Male" },
				{ "4", "Riley", "Densumbe", "rdensumbe3@blogspot.com", "Male" },
				{ "5", "Webster", "Chilvers", "wchilvers4@boston.com", "Male" },
				{ "6", "Grover", "Pendergast", "gpendergast5@ox.ac.uk", "Male" },
				{ "7", "Tally", "Gregoletti", "tgregoletti6@jimdo.com", "Male" },
				{ "8", "Sherlocke", "Wicklen", "swicklen7@moonfruit.com", "Male" },
				{ "9", "Vail", "Clelle", "vclelle8@prnewswire.com", "Female" },
				{ "10", "Mead", "Waggett", "mwaggett9@wordpress.org", "Female" } };

	String[][] mSTRING = new String[20][20];
	
	Stringclass s_obj = new Stringclass();
	mSTRING=s_obj.filter(data);
	
		
		
		for(int i=0;i<columnNames.length;i++)
		{
			System.out.print(columnNames[i]+"\t");
			
		}
		
		System.out.println(mSTRING);
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				
				System.out.println(mSTRING[i][j]);
			}
			
		}
		

	}
	
	
	public String[][] filter(String[][] data) {
		int i=0;
		int j=0;
		String arr[][]=new String[data.length+20][data.length+20];
		for(i=0;i<data.length;i++) {
			for(j=0;j<data[i].length;j++) {
				for(int k=0;k<data[i][1].length();k++){
				if(data[i][1].charAt(i)=='v' || data[i][3].endsWith(".com")==true) {
					arr[i][j]=data[i][j];
				}
			}
			}
		}
		
		return arr;
	}

}
