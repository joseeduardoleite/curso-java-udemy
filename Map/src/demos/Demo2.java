package demos;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Demo2 {
	
	public static void exe() {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notebook", 1200.0);
		Product p3 = new Product("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		// true porque a classe possui os m�todos hashCode e equals. 
		// se n�o o "ps" no m�todo "containsKey()" apontaria para um objeto diferente ao inv�s de usar o equals para comparar
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
	}
}
