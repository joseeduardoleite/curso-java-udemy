package Demos;

import java.util.Set;
import java.util.TreeSet;

import entities.ProductTreeSet;

/*Como TreeSet compara os elementos
 * Principais implementações:
• HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
• TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTo do objeto (ou Comparator)
• LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados*/
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
