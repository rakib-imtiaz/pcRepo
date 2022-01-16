package dec24_assignment;

public class InvalidDonationTimeException extends Exception {
	
	

	public InvalidDonationTimeException() {
	}


	@Override
	public String toString() {
		return "InvalidDonationTimeException: You need to wait at least 3 months for next donation";
	}


}
