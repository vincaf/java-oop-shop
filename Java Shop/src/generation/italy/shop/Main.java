package generation.italy.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto product1 = new Prodotto("Computer portatile", "Notebook PC Portatile da 15,6 Pollici", 300);
		System.out.println(product1.toString());
		
		int product1Price = product1.getPrice();
		int product1Iva = product1.getPriceIva();
		System.out.println("\nPrezzo: " + product1Price + "€ - Prezzo con IVA: " + product1Iva + "€");

	}

}
