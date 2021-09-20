package demos;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
	
	public static void Exemplo() {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}
