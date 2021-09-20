package Demos;

import java.util.Set;
import java.util.TreeSet;

import entities.ProductTreeSet;

/*Como TreeSet compara os elementos
 * Principais implementa��es:
� HashSet - mais r�pido (opera��es O(1) em tabela hash) e n�o ordenado
� TreeSet - mais lento (opera��es O(log(n)) em �rvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
� LinkedHashSet - velocidade intermedi�ria e elementos na ordem em que s�o adicionados*/
public class DemoIgualdadeTreeSet {

	public static void exe() {
		
		Set<ProductTreeSet> set = new TreeSet<>();
		
		set.add(new ProductTreeSet("TV", 900.0));
		set.add(new ProductTreeSet("Notebook", 1200.0));
		set.add(new ProductTreeSet("Tablet", 400.0));
		
		for (ProductTreeSet p : set) {
			System.out.println(p);	
		}
	}
}
