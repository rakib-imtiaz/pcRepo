package homework2;

public class Helper {

	String generateNidNumber() {

		double max = 999999999;
		double min = 100000000;
		double range = max - min + 1;

		int rand = (int) ((int) (Math.random() * range) + min);
		String str1 = Integer.toString(rand);

		// System.out.println(str1);

		max = 9999;
		min = 1000;
		range = max - min + 1;

		int rand2 = (int) ((int) (Math.random() * range) + min);

		String str2 = Integer.toString(rand2);
		// System.out.println(str2);

//		System.out.println(str1+str2);

		return str1 + str2;

	}

	String generateFacultyInnitial(String name) {
		char newName[] = name.toCharArray();

		StringBuilder builder = new StringBuilder();
		builder.append(newName[0]);
		builder.append(newName[1]);
		builder.append(newName[2]);

		String newString = new String(builder);

		return newString;

	}

}
