package arquivos;

import java.io.File;
import java.util.Scanner;

public class InformacoesCaminhoArquivo {
	public static void exe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");

		String strPath = sc.nextLine();
		File path = new File(strPath);

		System.out.println("getPath: (pega a rota/caminho completo)" + path.getPath());
		System.out.println("getParent: (pega o nome da rota/caminho) " + path.getParent());
		System.out.println("getName: (pega o nome do arquivo) " + path.getName());
		sc.close();
	}
}
