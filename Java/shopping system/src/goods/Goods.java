package goods;

public class Goods {
	
	private String goods_id;
	private String Good_name;
	private double Quantity;
	private double price_per_unit;
	public Goods(String goods_id, String good_name, double quantity, double price_per_unit) {
		super();
		this.goods_id = goods_id;
		Good_name = good_name;
		Quantity = quantity;
		this.price_per_unit = price_per_unit;
	}
	
	public Goods() {
		// TODO Auto-generated constructor stub
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public String getGood_name() {
		return Good_name;
	}
	public void setGood_name(String good_name) {
		Good_name = good_name;
	}
	public double getQuantity() {
		return Quantity;
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	

}
