package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	
	int code;
	String name;
	String description;
	int price;
	int iva = 20;
	
	public Prodotto(String name, String description, int price) {
		
		Random rnd = new Random();
		
		this.name = name;
		this.description = description;
		this.price = price;
		this.code = rnd.nextInt(99999);
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getPriceIva() {
		return price + (price * iva / 100);
	}
}
