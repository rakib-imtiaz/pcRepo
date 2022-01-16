package oop;

import java.util.Scanner;

public abstract class Person {
	
	
	
	private int age;
	private String name;
	
	
	
	
	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		
		if(age>18)
		this.age = age;
		else {
			
			age=0;
			System.out.println("you arent adult");
		}
	}




	public String getName() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter passowrod");
		int pass=scan.nextInt();
		
		if(pass==1234)
		{
			
			return name;
		}
		
		else {
			
			System.out.println("You arent autheticate user");
		}
		return null;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
