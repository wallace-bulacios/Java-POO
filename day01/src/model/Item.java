package model;

public class Item {

	private double unit_price;
	private double discount; //uma porcentagem de desconto que se aplica ao preço
	private int quantity;
	private String description;
	private String id;
	
	public Item(String id, String description, int quantity, double price) {
		this.id = id;
		this.description = description;
		if(quantity >= 0) {
			this.quantity = quantity;
		}
		else {
			this.quantity = 0;
		}
		
		this.unit_price = price;
	}
	
	public double getAdjustedTotal() {
		double total = unit_price * quantity;
		double total_discount = total * discount;
		double adjusted_total = total - total_discount;
		
		return adjusted_total;
	}
	
	//este método aplica uma porcentagem de disconto
	public void setDisount(double discount) {
		if(discount <= 1.00) {
			this.discount = discount;
		}
		else {
			this.discount = 0;
		}
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		if(quantity >= 0) {
			this.quantity = quantity;
		}
	}
	
	public String getProdutoID() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	
	
}
