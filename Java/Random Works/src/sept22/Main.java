package sept22;

import java.util.Scanner;

class calculator {
	private static double value;
	{
		value = 0.0;
	}

	public void add(int n) {
		value = value + n;
	}

	public void subtract(int n) {
		value = value - n;
	}

	public void multiply(int n) {
		value = value * n;
	}

	public void divide(int n) {
		value = value = n;
	}

	public void clear() {
		value = 0.0;
	}

	public double getValue() {
		return value;
	}

}

public class Main {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner keyboard = new Scanner(System.in);
		double num1 = keyboard.nextDouble();
		double num2 = keyboard.nextDouble();

		System.out.println(calc.getValue());
		calc.add((int) num1);
		System.out.println(calc.getValue());
		calc.multiply(3);

		System.out.println(calc.getValue());
		calc.subtract((int) num2);

		System.out.println(calc.getValue());
		calc.divide(2);

		System.out.println(calc.getValue());
		calc.clear();
		System.out.println(calc.getValue());
	}
}
