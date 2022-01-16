package labfinal;

import java.util.Scanner;

public class Shwapno {

	private String name;

	private double productWeight;
	private int age;
	

	public Shwapno(String name, double productWeight, int age) {
		super();
		this.name = name;
		this.productWeight = productWeight;
		this.age = age;
	}

	void checkName() throws InvalidNameException {
		int flag = 0;
		char arr[] = name.toCharArray();

		if (arr[0] == 'S' || arr[arr.length-1] == 'o') {
			throw new InvalidNameException(name);
		} else {

			System.out.println("will receive a gift which contains 1 kg miniket rice and 1 litre soyabean oil.");
		}
	}

	void checkproductWeight() throws InvalidWeightException {

		if (productWeight > 1.50) {
			throw new InvalidWeightException(productWeight);
		} else {
			System.out.println("Shwapno will give all the products to the customer for free");
		}

	}

	void checkAge() throws InvalidAgeException {

		if (age > 15) {

			throw new InvalidAgeException(age);

		}
		else {
			
			System.out.println("will receive chocolates");
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter name ");
		String name=in.nextLine();
		
		System.out.println("Enter product weight ");
		double weight=in.nextDouble();
		
		System.out.println("Enter age :");
		int age=in.nextInt();
		
		
		Shwapno obj = new Shwapno(name,weight,age);
		
		try {
			obj.checkName();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			obj.checkAge();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		try {
			obj.checkproductWeight();
		} catch (Exception e) {
			System.out.println(e);
		}
		

		
		

	}
}