
public class AI extends Player {
	int option;

	public AI() {

		option = 1 + (int) (Math.random() * 3);
		

		switch (option) {
		case 1: {
			setRock(true);

			break;
		}
		case 2: {
			setPaper(true);

			break;
		}
		case 3: {
			setScissor(true);

			break;
		}
		}

	}
	

	int option_ret()
	{
		return option;
	}
}