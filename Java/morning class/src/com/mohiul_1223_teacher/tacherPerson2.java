package com.mohiul_1223_teacher;

public class tacherPerson2 {
	
	

	 private String name=null;
	 private String id;
	 private int age;
	 private double salary;
	 
	 

	 public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getAge() {
		
		
		return age;
	}


	public void setAge(int age) {
		
		if(this.age>18)
		{
		this.age = age;

		}
		else {
			
			this.age=0;
			this.name=null;
			this.salary=0;
			this.id=null;
			System.out.println("You cant Register the user");
		}
		
	}
	
	int add(int a, int b)
	{

	return a+b;

	}

	int  add(int a, int b,int c)
	{

	return a+b+c;

	}



	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	 
	 public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	
	
	
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}

}
