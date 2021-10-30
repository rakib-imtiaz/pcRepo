package lab_9_task_1;

public class main {
	public static void main(String[] args) {

		Stack obj1 = new Stack(5);
		Stack obj2 = new Stack(8);

		obj1.push(345);
		obj1.push(2342);

		obj1.pop();
		obj1.pop();

		obj2.push(232);
		obj2.push(224);
		obj2.push(2323);

		obj2.pop();

	}
}
