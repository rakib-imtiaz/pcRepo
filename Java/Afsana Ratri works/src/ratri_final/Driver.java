package ratri_final;

class InvalidInput extends Exception {
	@Override
	public String toString() {
		return "invalid input";
	}
}

abstract  class Vehicle {

    private int id;
    private  String color;
    private String model;

    public Vehicle(int id, String color, String model) throws InvalidInput {
        if(id<0){
            throw new InvalidInput();
        }
        this.id = id;
        this.color = color;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    abstract void wheels();
    abstract  void howTorun();

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }


}
abstract class Vehicle {

	private int id;
	private String color;
	private String model;

	public Driver(int id, String color, String model) throws InvalidInput {
		if (id < 0) {
			throw new InvalidInput();
		}
		this.id = id;
		this.color = color;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	abstract void wheels();

	abstract void howTorun();

	@Override
	public String toString() {
		return "{" + "id=" + id + ", color='" + color + '\'' + ", model='" + model + '\'' + '}';
	}

}

 class Car extends Vehicle {

	public Car(int id, String color, String model) throws InvalidInput {
		super(id, color, model);
	}

	@Override
	void wheels() {
		System.out.println("a car  has 4 wheels");
	}

	public boolean equals(Car obj) {
		return this.getModel().equals(obj.getModel());
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	void howTorun() {
		System.out.println("a car runs with disel");
	}
}

 class Cycle extends Vehicle {
	public Cycle(int id, String color, String model) throws InvalidInput {
		super(id, color, model);
	}

	@Override
	void wheels() {
		System.out.println("a cycle runs with 2 whells");
	}

	@Override
	void howTorun() {
		System.out.println("a cycle runs with energy");
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Car obj) {
		return this.getModel().equals(obj.getModel());
	}
}

public class Driver {
	public static void main(String[] args) throws InvalidInput {
		Vehicle[] v = new Vehicle[1];
		for (int i = 0; i < v.length; i++) {
			if (i % 2 == 0) {
				v[i] = new Car(1000, "red", "3foo");
				System.out.println(v[i]);
			}

			else {
				v[i] = new Cycle(1002, "cean", "model101");
				System.out.println(v[i]);
			}
		}
	}
}