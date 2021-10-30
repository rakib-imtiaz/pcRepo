package Homework_1.problem1;

public class Engineers1 {
	public double averageOfEngineers(Software_Projects arr[]) {

		double avrg = 0;
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i].getTotal_no_of_engineers();

		}
		avrg = sum / 10;
		return avrg;

	}

	public void seniorManager(Software_Projects arr[]) {
		int max = 0;
		
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getManagerExperience() > max) {
				max = arr[i].getManagerExperience();
				index=i;

			}
			
			System.out.println("senior project manager : "+arr[index].getProject_manager_name());

			
		}

	}

}
