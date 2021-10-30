
public class ExceptionHandeling extends Exception {

	public static void main(String[] args) {

		/*here we are dividing 100/0 which is an 
		 * Arithmatic exception
		 * 
		 * */
		try {

			int num = 100 / 0;
		} catch (Exception e) {
			System.out.println("Exception1 :" + e);
		}

		/*
		 * here we are putting 5 in out of bound of the array
		 * 
		 * */
		try {

			int num[] = new int[4];

			num[10] = 5;
			System.out.println(num[10]);

		} catch (Exception e) {
			System.out.println("Exception2 :" + e);
		}
		/*
		 * we are formating invalid thing in the integer variable
		 * 
		 * */
		
		try {
			
			String name="akash";
			
			int var=Integer.parseInt(name);
			System.out.println(var);
			
		} catch (Exception e) {
			System.out.println("Exception3 :" + e);
		}

	}

}
