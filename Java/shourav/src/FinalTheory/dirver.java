/*
 * The process of converting one 
 * type of object and variable into 
 * another type is referred to as Type casting. 
 * When the conversion automatically performs by 
 * the compiler without the programmer's 
 * interference, it is called implicit type
 *  casting or widening casting.*/


class Animal {
	public void eat() {
		System.out.println("eat");
	}
}

class Tiger extends Animal {
	public void sleep() {
		System.out.println("sleep");
	}

	public void walk() {
		System.out.println("walk");
	}
}

public class dirver {

	public static void main(String[] args) {

		Animal animal = new Tiger();
		animal.eat(); //impicit

		((Tiger) animal).walk(); //explicit
	}

}

public class Car extends Vehicle implements Cloneable {
    private Tyre tyres[] = new Tyre[4];   
    public Car(){  
        for (int i = 0; i < 4; i++) {
            tyres[i] = new Tyre();
        }
    }  
      
    public Object clone() throws CloneNotSupportedException {  
        Car c = new Car();
        int i=0;
	while (i < 4) {
            c tyres[i] = super.clone();
            i++;
        }
        return c;
    }  
}