package application;

public class Program {
	
	public static void main(String[] args) {
		HashCodeExemplo();
		System.out.println();
		EqualsExemplo();
	}
	
	public static void HashCodeExemplo() {
		// Método que retorna um número inteiro representando um código gerado a partir das informações do objeto
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
	
	public static void EqualsExemplo() {
		// Método que compara se o objeto é igual a outro, retornando true ou false.
		
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
	}
}
