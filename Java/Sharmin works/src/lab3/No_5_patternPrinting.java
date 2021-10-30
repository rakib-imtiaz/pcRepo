package lab3;

public class No_5_patternPrinting {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) 
			{
				if(i%2!=0)
				{
					if(i==3||i==7)
					System.out.print("+");
					else {
						System.out.print("*");
					}
				}

			}
			System.out.println();

		}

	}

}
