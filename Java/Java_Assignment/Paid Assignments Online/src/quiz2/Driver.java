package quiz2;

import java.math.*;

public class Driver {

	public static void main(String[] args) {
		
		LargeNumberCalculator calc = new LargeNumberCalculator();
		
		
		BigInteger addint1 = new BigInteger("12345678912345");
		BigInteger addint2 = new BigInteger("45345678912345");
		
		System.out.println("The Sum of Big Integer "+addint1+" and " +addint2+  "  is:  "+ calc.add(addint1,addint2));
		
		BigInteger subint1 = new BigInteger("8232323212122");
		BigInteger subint2 = new BigInteger("87645678912345");
		
		System.out.println("\nThe Sub of Big Integer "+subint1+" and " +subint2+  "  is:  "+ calc.subtract(subint1,subint2));
		
		BigInteger mulint1 = new BigInteger("987676678912345");
		BigInteger mulint2 = new BigInteger("5678978912345");
		
		System.out.println("\nThe Multiplication of Big Integer "+mulint1+" and " +mulint2+  "  is:  "+ calc.multiply(mulint1,mulint2));
		
		BigInteger divint1 = new BigInteger("12345678912345");
		BigInteger divint2 = new BigInteger("45345678912345");
		
		System.out.println("\nThe Division of Big Integer "+divint1+" and " +divint2+  "  is:  "+ calc.divide(divint1,divint2));
		
		BigDecimal adddec1 = new BigDecimal("8765435912345");
		BigDecimal adddec2 = new BigDecimal("8232323212122");
		
		System.out.println("The Sum of Big Decimal "+adddec1+" and " +adddec2+  "  is:  "+ calc.add(adddec1,adddec2));
		
		BigDecimal subdec1 = new BigDecimal("87654912345");
		BigDecimal subdec2 = new BigDecimal("312343434342");
		
		System.out.println("\nThe Sub of Big Integer "+subdec1+" and " +subdec2+  "  is:  "+ calc.subtract(subdec1,subdec2));
		
		BigDecimal muldec1 = new BigDecimal("2987676678912345");
		BigDecimal muldec2 = new BigDecimal("235678978912345");
		
		System.out.println("\nThe Multiplication of Big Integer "+muldec1+" and " +muldec2+  "  is:  "+ calc.multiply(muldec1,muldec2));
		
		BigDecimal divdec1 = new BigDecimal("2453648454542");
		BigDecimal divdec2 = new BigDecimal("2");
		
		System.out.println("\nThe Division of Big Integer "+divdec1+" and " +divdec2+  "  is:  "+ calc.divide(divdec1,divdec2));
		
		BigInteger[] arrayint = new BigInteger[5];
		
		arrayint[0] = new BigInteger("232323212122");
		arrayint[1] = new BigInteger("43232321097");
		arrayint[2] = new BigInteger("68764523232967712345");
		arrayint[3] = new BigInteger("87645678912345");
		arrayint[4] = new BigInteger("78942312345");
		System.out.println("\n\nThe Big Integers are: \n");
		for(int i=0;i<arrayint.length;i++)
		{
			System.out.println("Element No: "+i+": "+arrayint[i]);
			
		}
		
		System.out.println("\nMax Number is "+calc.max(arrayint));
		System.out.println("\nMin Number is "+calc.min(arrayint));
		
		
		BigDecimal[] arraydec = new BigDecimal[5];
		
		arraydec[0] = new BigDecimal("232323212122.32323");
		arraydec[1] = new BigDecimal("43232321097.323323");
		arraydec[2] = new BigDecimal("687645.23232967712345");
		arraydec[3] = new BigDecimal("8764567.8912345");
		arraydec[4] = new BigDecimal("78942312345.23232323232");
		System.out.println("\n\nThe Big Decimals are: \n");
		for(int i=0;i<arraydec.length;i++)
		{
			System.out.println("Element No: "+i+": "+arraydec[i]);
			
		}
		
		System.out.println("\nMax Number is "+calc.max(arraydec));
		System.out.println("\nMin Number is "+calc.min(arraydec));
		
		
		
		BigInteger p = new BigInteger("3121132324354644");
		
		System.out.println("is "+p+" prime? : "+calc.isPrime(p));

		BigInteger o = new BigInteger("3121132324354644");
		
		System.out.println("is "+p+" ODD? : "+calc.isOdd(p));
		
		BigDecimal G = new BigDecimal("232323232323212121.2121212121");
		
		System.out.println("\nThe Mulplied value of "+ G+" with the Hermite–Ramanujan constant is " +calc.multiply(G,calc.HRC));
		
		
		
		BigDecimal Golden = new BigDecimal("8765433212121.2654212121");
		
		System.out.println("\nThe Divider value of "+ Golden+" with the Golden ratio constant is " +calc.PHI.multiply(Golden));
		
		BigDecimal a=calc.multiply(calc.PI,calc.E);
		
		BigDecimal b = new BigDecimal("3.14159265358979323846");
		
		BigDecimal x=  b.divide(calc.E,2,RoundingMode.CEILING);
		
		x=x.pow(23);
		
		BigDecimal c=calc.E.divide(calc.PI,2,RoundingMode.CEILING);
		
		BigDecimal g=calc.add(a, b);

		BigDecimal result =calc.subtract(g, c);
		

		
				
		System.out.println("The sum of the equation is : "+result);
		
		

	}

}
