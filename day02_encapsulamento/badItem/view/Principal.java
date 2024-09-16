package view;

import model.BadItem;

public class Principal {

	public static void main(String[] args) {
		
		BadItem milk = new BadItem("dayry-11", "1 Gallon Milk", 2, 2.50);
		
		
		//aplica cupons de desconto
		milk.setDisount(0.15);
		
		//obtém preços ajustado por desconto
		double milk_price = milk.getQuantity() * milk.getUnitPrice();
		double milk_discount = milk.getDiscount() * milk_price;
		milk.setAdjustedPrice(milk_price - milk_discount);
		
		System.out.println("Your milk costs:\t $" + milk.getAdjustedPrice());
	}

}
