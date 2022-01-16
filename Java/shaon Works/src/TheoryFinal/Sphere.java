package TheoryFinal;

public class Sphere extends Shape3D {

	private double radius;

	public Sphere(boolean filled, double radius) {
		super(filled);
		this.radius = radius;
	}

	@Override
	double getArea() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	double getVolume() {
		return (4.0 / 3.0) * Math.PI * radius * radius * radius;
	}

	@Override
	public int compareTo(Shape3D o) {

		return this.getArea() == o.getArea();
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
