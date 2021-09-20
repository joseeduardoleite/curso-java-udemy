package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import services.CalculationService;

/*Uma empresa de consultoria deseja avaliar a performance de produtos,
funcion�rios, dentre outras coisas. Um dos c�lculos que ela precisa � encontrar
o maior dentre um conjunto de elementos. Fazer um programa que leia um
conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
mostre o mais caro deles*/
public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		String path = "C:in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				list.add(Integer.parseInt(line));
				line = br.readLine();
			}
			
			Integer x = CalculationService.max(list);
			System.out.println("Max:");
			System.out.println(x);

		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
