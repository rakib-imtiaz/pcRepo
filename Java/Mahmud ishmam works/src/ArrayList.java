
class student implements Comparable<student> {

	String name;
	double hieght;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHieght() {
		return hieght;
	}

	public void setHieght(double hieght) {
		this.hieght = hieght;
	}

	public student(String name, double hieght) {
		super();
		this.name = name;
		this.hieght = hieght;
	}

	@Override
	public int compareTo(student e) {

		if (e.getHieght() > this.hieght) {
			return 1;
		} else {
			return 0;
		}

	}

}

public class ArrayList {

	public static void main(String[] args) {
		student st1 = new student("A", 6.0);
		student st2 = new student("B", 5.0);
		student st3 = new student("C", 5.0);
		student st4 = new student("D", 3.0);
		student st5 = new student("E", 5.5);

		ArrayList<student> list = new ArrayList();

		list.add(st1);

		list.add(st2);

		list.add(st3);

		list.add(st4);

		list.add(st5);

	}

}
