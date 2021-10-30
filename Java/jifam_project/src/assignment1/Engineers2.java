package assignment1;


public class Engineers2 {

	int highestDuration(Hardware_Projects arr[]) {
		int max = 0;

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getDuration() < max) {
				max = arr[i].getDuration();
				index = i;

			}


		}
		return index;

	}

	

	void juniorManager(Hardware_Projects arr[]) {
		int min = 0;

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getDuration() > min) {
				min = arr[i].getDuration();
				index = i;

			}

			System.out.println("junior project manager : " + arr[index].getProject_manager_name());

		}

	}

}
