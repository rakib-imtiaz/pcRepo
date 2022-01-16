package TheoryFinal;

public class Complex {

	private double a;
	private double b;

	public Complex() {
		// TODO Auto-generated constructor stub
	}

	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Complex(Complex t) {

		this.a = t.a;
		this.b = t.b;
	}

	public Complex add(Complex t) {

		Complex sum = null;

		sum.a = this.a + t.a;
		sum.b = this.b + t.b;

		return sum;

	}
	public Complex Multiply(Complex t) {
		
		Complex sum = null;
		
		sum.a = (this.a * t.a)-(this.b*t.b);
		sum.b = (this.a * t.a)+(this.b*t.b);
		
		return sum;
		
	}

	@Override
	public String toString() {
		return "Complex [a=" + a + ", b=" + b + "]";
	}
	
	

}
