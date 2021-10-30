import java.util.ArrayList;

public class CartManager {

	ArrayList<CartItem> items;

	public CartManager() {

		items = new ArrayList<>();
	}
	
	public void additem(CartItem item)
	{
		items.add(item);
		
		
	}

	public double getTotalprice()
	{
		double sum=0;
		for(CartItem item: items)
		{
			sum=sum+item.price;
			
		}
		return sum;
	
		
	}
}
