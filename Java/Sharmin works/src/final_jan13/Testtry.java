package final_jan13;

public class Testtry {
	public static void main(String[] args) {

		int a = 0;
		String name[] = { "Rahim", "karim", "shuvo" };
		while (a < 4) {
			try {
				System.out.println(name[a]);
				a++;
			} catch (Exception e) {
				System.out.println("Nothing");
				// TODO: handle exception
			} finally {
				System.out.println("Must execute");
				if (a < 3)
					;
				else {
					System.out.println("wrong");
					break;
				}
			}
		}

	}

}
