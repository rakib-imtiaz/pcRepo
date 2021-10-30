
public class main {
	
	public static void main(String[] args) throws InvalidPromoCodeException {
		
		
		CartManager manage = new CartManager();
		String promo="ENJOY50";
		
		if (manage.getTotalprice()>250 && manage.items.equals("ENJOY50"))
		{
			System.out.println("Promo code applied successfully!");
			
		}else if (manage.getTotalprice()>500 && manage.items.equals("HELLO200"))
		{
			System.out.println("Promo code applied successfully!");

		}
		else {
			
			throw new InvalidPromoCodeException(promo,manage.getTotalprice());

		}
		
	}

}
