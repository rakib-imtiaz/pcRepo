package lab_09_task_1;

public class main {
	public static void main(String[] args) {

		Stack obj1 = new Stack(10);

		obj1.push(5);
		obj1.push(2);
		obj1.push(2);
		obj1.push(1);
		obj1.push(2);

		Stack obj2 = new Stack(10);

		obj1.push(6);
		obj2.push(4);
		obj2.push(7);
		obj1.push(10);
		obj1.push(4);
		obj2.push(8);

		int max = 0;
		for (int i = 0; i < 10; i++) {
			if (obj1.pop() > max) {
				max = obj1.pop();
			}
		}

		for (int i = 0; i < 10; i++) {
			if (obj2.pop() > max) {
				max = obj2.pop();
			}
		}

		for (int i = 0; i < 10; i++) {

			int poped = obj1.pop();
			if (poped > max) {
				max = obj1.pop();
			}
			obj1.push(poped);
		}

		for (int i = 0; i < 10; i++) {
			int poped = obj1.pop();
			if (poped > max) {
				max = obj1.pop();
			}
			obj1.push(poped);
		}
		int min = 0;
		for (int i = 0; i < 10; i++) {
			if (obj1.pop() < min) {
				min = obj1.pop();
			}
		}

		for (int i = 0; i < 10; i++) {
			if (obj2.pop() < min) {
				min = obj2.pop();
			}
		}

		for (int i = 0; i < 10; i++) {

			int poped = obj1.pop();
			if (poped > min) {
				min = obj1.pop();
			}
			obj1.push(poped);
		}

		for (int i = 0; i < 10; i++) {
			int poped = obj1.pop();
			if (poped > min) {
				min = obj1.pop();
			}
			obj1.push(poped);
		}

		System.out.println("Lowset : " + min);
		System.out.println("Highest : " + max);

		Stack obj3 = new Stack(10);
		obj3.push(max);
		obj3.push(min);

	}

}
