package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

/*Uma empresa de consultoria deseja avaliar a performance de produtos,
funcion�rios, dentre outras coisas. Um dos c�lculos que ela precisa � encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles*/
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
