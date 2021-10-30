package assignment1;

import java.math.BigDecimal;

public class main {
	public static void main(String[] args) {

		BigDecimal bigArray_1[][] = { 
				{ new BigDecimal("11111111111111111111"),new BigDecimal("2222222222222222"),new BigDecimal("333333333333333") }
				,{ new BigDecimal("4444444444444444444"),new BigDecimal("5555555555555555"),new BigDecimal("666666666666666") }
				,{ new BigDecimal("7777777777777777777"),new BigDecimal("8888888888888888"),new BigDecimal("999999999999999") }
		};

	
		BigDecimal bigArray_2[][] = { 
				{ new BigDecimal("99999999999999999999"),new BigDecimal("2322424242525252"),new BigDecimal("424242252524224") }
				,{ new BigDecimal("4444444444444444444"),new BigDecimal("5555555555555555"),new BigDecimal("454646352342442") }
				,{ new BigDecimal("2452553636453422422"),new BigDecimal("4242424242424422"),new BigDecimal("4646463442424242") }
		};
		
		
	
		
		
		BigDecimalMatrix bigObject1 = new BigDecimalMatrix(bigArray_1);
		BigDecimalMatrix bigObject2 = new BigDecimalMatrix(bigArray_2);
		
		BigDecimal  arr[][] = new BigDecimal[bigObject1.getNumberOfRows()+10][bigObject1.getNumberOfColumns()+10];
		arr=bigObject1.getMatrix();
		BigDecimal  arr2[][] = new BigDecimal[bigObject1.getNumberOfRows()+10][bigObject1.getNumberOfColumns()+10];
		arr=bigObject2.getMatrix();

		
		System.out.println("Matrix :1");
		System.out.println(bigObject1);
		System.out.println();
		System.out.println("Matrix :2");
		System.out.println();
		System.out.println(bigObject2);
		System.out.println("Add");
		System.out.println(bigObject1.add(bigObject2));
		System.out.println();
		System.out.println("Subtract");
		System.out.println();
		System.out.println(bigObject1.subtract(bigObject2));
		System.out.println();
		System.out.println("Multiply");
		System.out.println();
		System.out.println(bigObject1.multiply(3));
		System.out.println();
		System.out.println("Divide");
		System.out.println();
		System.out.println(bigObject1.divide(4));
		System.out.println();

		System.out.println("pow");
		System.out.println(bigObject1.pow(3));
		
		System.out.println();
		
		System.out.println("primary   : "+bigObject1.primaryDigonal(bigObject2));
		System.out.println("secondary : "+bigObject1.primaryDigonal(bigObject2));
		System.out.println();
	

}
	}
