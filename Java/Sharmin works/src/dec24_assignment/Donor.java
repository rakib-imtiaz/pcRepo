package dec24_assignment;

import java.util.Scanner;

import lab3.main;

public class Donor extends Exception {

	private int age;
	private int weight;
	private int height;
	private boolean isdonationTimeWithinthreeMonths;
	private double BMI;

	public Donor() {
		// TODO Auto-generated constructor stub
	}

	public Donor(int age, int weight, int height, boolean isdonationTimeWithinthreeMonths) {
		super();
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.isdonationTimeWithinthreeMonths = isdonationTimeWithinthreeMonths;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean isIsdonationTimeWithinthreeMonths() {
		return isdonationTimeWithinthreeMonths;
	}

	public void setIsdonationTimeWithinthreeMonths(boolean isdonationTimeWithinthreeMonths) {
		this.isdonationTimeWithinthreeMonths = isdonationTimeWithinthreeMonths;
	}

	public static double CalcBMI(int height,int weight ) {

		double bmi = weight / Math.pow(height, 2);

		return bmi;
	}
	
	



}
