package nov26;

public class Products {

	private int id;
	private String name;
	private double price;
	private double discountrate;

	public Products() {

	}

	public Products(int id, String name, double price, double discountrate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discountrate = discountrate;
	}

	public String getProductDetails() {

		return "Product ID     :" + this.id + "\n" + "Name           :" + this.name + "\n" + "price          :"
				+ this.price + "\n" + "Discount rate  :" + this.getDiscountedPrice();

	}

	public double getDiscountedPrice() {
		double price = this.price - this.price * (discountrate / 100.0);

		return price;

	}

	public static void main(String[] args) {

		Products milk = new Products(10012, "Milk", 154.75, 20);
		Products fabric = new Products(10013, "Fabric Conditioner",250, 23.5);

		System.out.println(milk.getProductDetails());
		System.out.println();
		System.out.println(fabric.getProductDetails());

	}

}
