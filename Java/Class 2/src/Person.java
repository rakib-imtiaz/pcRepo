import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private int password;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}


	Person(String name,int age,int password)
	{
		
		this.name=name;
		this.age=age;
		this.password=password;
		
		
		
		
		
	}
	
	
	

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", password=" + password + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPassword() {
		
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	

}
