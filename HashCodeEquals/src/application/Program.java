package application;

public class Program {
	
	public static void main(String[] args) {
		HashCodeExemplo();
		System.out.println();
		EqualsExemplo();
	}
	
	public static void HashCodeExemplo() {
		// M�todo que retorna um n�mero inteiro representando um c�digo gerado a partir das informa��es do objeto
		
		String a = "Maria";
		String b = "Alex";
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
	
	public static void EqualsExemplo() {
		// M�todo que compara se o objeto � igual a outro, retornando true ou false.
		
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
	}
}
