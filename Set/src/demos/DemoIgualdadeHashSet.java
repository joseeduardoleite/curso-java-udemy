package demos;

import java.util.HashSet;
import java.util.Set;

import entities.ProductHashSet;

/*Como as cole��es Hash testam igualdade
 * Se hashCode e equals estiverem implementados:
� Primeiro hashCode. Se der igual, usa equals para confirmar.
� Lembre-se: String, Integer, Double, etc. j� possuem equals e hashCode

 * Se hashCode e equals N�O estiverem implementados:
� Compara as refer�ncias (ponteiros) dos objetos.*/
public class DemoIgualdadeHashSet {
	
	public static void exe() {
		
		Set<ProductHashSet> set = new HashSet<>();
		
		set.add(new ProductHashSet("TV", 900.0));
		set.add(new ProductHashSet("Notebook", 1200.0));
		set.add(new ProductHashSet("Tablet", 400.0));
		
		ProductHashSet prod = new ProductHashSet("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
	}
}
