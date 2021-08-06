package herancaepolimorfismo;

public class ExecutarExemplo {
	public static void exe() {
		BusinessAccount acc = new BusinessAccount(8010, "Bob", 10.0, 500.0);
		
		System.out.println(acc.getBalance());
	}
}
