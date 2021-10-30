
public class InvalidPromoCodeException extends Exception {

	 String  promocode;
	double price;

	

	public InvalidPromoCodeException(String  promocode,double price) {
		super();
		this.promocode = promocode;
		this.price=price;
	
	}
	

	@Override
	public String toString() {
		return promocode+" cannot ne applied  for "+price;
	}

}
