package herancaepolimorfismo.polimorfismo.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler os dados de N
produtos (N fornecido pelo usu�rio). Ao final,
mostrar a etiqueta de pre�o de cada produto na
mesma ordem em que foram digitados.
Todo produto possui nome e pre�o. Produtos
importados possuem uma taxa de alf�ndega, e
produtos usados possuem data de fabrica��o.
Estes dados espec�ficos devem ser
acrescentados na etiqueta de pre�o conforme
exemplo (pr�xima p�gina). Para produtos
importados, a taxa e alf�ndega deve ser
acrescentada ao pre�o final do produto.
*/
public class Executar {
	public static void exe() throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> productList = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + i+1 + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char result = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (result == 'c') {
				productList.add(new Product(name, price));				
			}
			else if (result == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				productList.add(new UsedProduct(name, price, date));
			}
			else {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : productList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();
	}
}
