package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private Double salary;
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	public void exe() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will registered? ");
		int employeesRegistered = sc.nextInt();
		
		List<Employee> employeeList = new ArrayList<>();
		
		for (int i = 0; i < employeesRegistered; i++) {
			System.out.println();
			System.out.printf("Emplyoee #%d:%n", i+1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			while (hasId(employeeList, id)) {
				System.out.print("Id already taken. Try again");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();			
			employeeList.add(new Employee(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (employee == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage");
			double percentage = sc.nextDouble();
			employee.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees");
			
		for (Employee obj : employeeList) {
			System.out.println(obj);
		}
		

		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
}
