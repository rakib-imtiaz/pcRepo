package work;

public class Person {
public String name;
public int age;
public String dateOfBirth;
public int phonenumber;
public Person(String name, int age, String dateOfBirth, int phonenumber) {
	this.name = name;
	this.age = age;
	this.dateOfBirth = dateOfBirth;
	this.phonenumber = phonenumber;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", dateOfBirth=" + dateOfBirth + ", phonenumber=" + phonenumber
			+ "]";
}



}