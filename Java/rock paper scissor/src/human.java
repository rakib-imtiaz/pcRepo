
public class human extends Player {

	public human(int option) {
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

}
