package mid;

public class MyNumber {
	private int whole;
	private int fraction;

	public MyNumber(int whole, int fraction) {

		this.fraction = fraction;
		this.whole = whole;
	}

	public MyNumber(double x) {
		int whole = (int) x;

		String s = ("" + (x - whole)).substring(2, 6);

		int frac = Integer.valueOf(s);

		this.whole = whole;
		this.fraction = frac;

	}

	static int getLength(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}

		return count;

	}

	public double add(double a) {

		int len = getLength(fraction);

		double decimalValue = fraction / (int) Math.pow(10, len);

		double total = a + this.whole + decimalValue;

		return total;

	}

	public MyNumber add(MyNumber a) {

		double w = this.whole + a.whole;
		double f = this.fraction + a.fraction;

		int len = getLength(fraction);

		double decimalValue = fraction / (int) Math.pow(10, len);

		double total = w + decimalValue;

		MyNumber s = new MyNumber(total);

		return s;

	}

}
