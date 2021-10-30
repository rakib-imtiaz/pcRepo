package quiz2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumberCalculator {

	final BigDecimal PHI = new BigDecimal("1.61803398874989484820");
	final BigDecimal E = new BigDecimal("2.71828182845904523536");
	final BigDecimal PI = new BigDecimal("3.14159265358979323846");
	final BigDecimal HRC = new BigDecimal("262537412640768743.999999999999250073");

	public BigInteger add(BigInteger num1, BigInteger num2) {

		BigInteger sum = num1.add(num2);

		return sum;

	}

	public BigInteger subtract(BigInteger num1, BigInteger num2) {

		BigInteger sum = num1.subtract(num2);

		return sum;

	}

	public BigInteger multiply(BigInteger num1, BigInteger num2) {

		BigInteger sum = num1.multiply(num2);

		return sum;

	}

	public BigInteger divide(BigInteger num1, BigInteger num2) {

		BigInteger sum = num1.divide(num2);

		return sum;

	}

	public BigDecimal add(BigDecimal num1, BigDecimal num2) {

		BigDecimal sum = num1.add(num2);

		return sum;

	}

	public BigDecimal subtract(BigDecimal num1, BigDecimal num2) {

		BigDecimal sum = num1.subtract(num2);

		return sum;

	}

	public BigDecimal multiply(BigDecimal num1, BigDecimal num2) {

		BigDecimal sum = num1.multiply(num2);

		return sum;

	}

	public BigDecimal divide(BigDecimal num1, BigDecimal num2) {

		BigDecimal sum = num1.divide(num2);

		return sum;

	}

	public BigInteger max(BigInteger numbers[]) {
		
		BigInteger maxnumbers=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
			int compare=numbers[i].compareTo(maxnumbers);
			
			if(compare>=1)
			{
				
			maxnumbers=numbers[i];	
				
			}
			
			
		}
		return maxnumbers;
		
		
	}
	public BigDecimal max(BigDecimal numbers[]) {
		
		BigDecimal maxnumbers=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
			int compare=numbers[i].compareTo(maxnumbers);
			
			if(compare>=1)
			{
				
				maxnumbers=numbers[i];	
				
			}
			
			
		}
		return maxnumbers;
		
		
	}
	public BigInteger min(BigInteger numbers[]) {
		
		BigInteger minnumbers=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
			int compare=numbers[i].compareTo(minnumbers);
			
			if(compare<=-1)
			{
				
				minnumbers=numbers[i];	
				
			}
			
			
		}
		return minnumbers;
		
		
	}
	public BigDecimal min(BigDecimal numbers[]) {
		
		BigDecimal minnumbers=numbers[0];
		
		for(int i=0;i<numbers.length;i++)
		{
			int compare=numbers[i].compareTo(minnumbers);
			
			if(compare<=-1)
			{
				
				minnumbers=numbers[i];	
				
			}
			
			
		}
		return minnumbers;
		
		
	}

	public Boolean isPrime(BigInteger number) {


		return number.isProbablePrime(0);

	}
	public Boolean isOdd(BigInteger number) {
		
		
	    
		boolean isODD=number.mod(number).equals(BigInteger.ZERO);
		if(isODD)
		{
			return true;
			
		}
		else {
			
			return false;
		}
		
		
	}



}
