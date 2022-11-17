package generation.italy.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto product1 = new Prodotto("Computer portatile", "Notebook PC Portatile da 15,6 Pollici", 300);
		System.out.println(product1.toString());
		
		Prodotto product2 = new Prodotto("Basso elettrico", "Basso elettrico a 4 corde, con amplificatore e jack", 700);
		System.out.println("\n" + product2.toString());

	}

}
