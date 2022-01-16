package labfinal;

public class Driver {
	public static void main(String[] args) {

		MailService mailService = new MailService(1200, "Dhaka ,Bangladesh");

		CargoService cargoService = new CargoService(1230, 110);
		mailService.displayinfo();
		cargoService.displayinfo();

	}

}
