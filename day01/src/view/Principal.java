package view;

import model.Item;

public class Principal {

	public static void main(String[] args) {
		
		Item milk = new Item("dayry-11", "1 Gallon Milk", 2, 2.5);
		Item yogurt = new Item("dayry-032", "Peach Yorgut", 4, 0.68);
		Item bread = new Item("bakery-023", "Sliced Bread", 1, 2.55);
		Item soap = new Item("household-21", "6 Pack Soap", 1, 4.51);
		
		//aplica cupons de desconto
		milk.setDisount(0.15);
		
		//obtém preços ajustado por desconto
		double milke_price = milk.getAdjustedTotal();
		double yogurt_price = yogurt.getAdjustedTotal();
		double bread_price = bread.getAdjustedTotal();
		double soap_price = soap.getAdjustedTotal();
		
		System.out.println("Tank You For Your Puchase.");
		System.out.println("Please Come Again!");
		System.out.println(milk.getDescription() + "\t $" + milke_price);
		System.out.println(yogurt.getDescription() + "\t $" + yogurt_price);
		System.out.println(bread.getDescription() + "\t $" + bread_price);
		System.out.println(soap.getDescription() + "\t $" + soap_price);
		
		//calcula e imprime total
		double total = milke_price + yogurt_price + bread_price + soap_price;
		System.out.println("Total Price \t $" + total);
	}

}
