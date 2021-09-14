package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

/*
Fa�a um programa para ler um arquivo contendo nomes de pessoas (um nome por
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
Maria Brown
Alex Green
Bob Grey
Anna White
Alex Black
Eduardo Rose
Willian Red
Marta Blue
Alex Brown
*/
public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void problema2() {
		/*
		 * Fa�a um programa para ler um arquivo contendo funcion�rios (nome e sal�rio)
		 * no formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por
		 * nome e mostrar o resultado na tela. Nota: o caminho do arquivo pode ser
		 * informado "hardcode". 
		 * Maria Brown,4300.00
		 * Alex Green,3100.00
		 * Bob Grey,3100.00
		 * Anna White,3500.00
		 * Alex Black,2450.00
		 * Eduardo Rose,4390.00
		 * Willian Red,2900.00
		 * Marta Blue,6100.00
		 * Alex Brown,5000.00
		 */

		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
