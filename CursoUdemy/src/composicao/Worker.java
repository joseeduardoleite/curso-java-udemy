package composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// Ler os dados de um trabalhador com N contratos (N fornecido pelo usu�rio). 
// Depois, solicitar do usu�rio um m�s e mostrar qual foi o sal�rio do funcion�rio nesse m�s, conforme exemplo.
public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() { }

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	// Getters e Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}
	// Fim Getters e Setters

	// M�todos
	public void addContract(HourContract contract) { 
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());;
			int c_year = cal.get(Calendar.YEAR);
			// acrescentando +1 pq o mes do calendar comeca com 0
			int c_month = 1 + cal.get(Calendar.MONTH);
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	// Fim M�todos
}
