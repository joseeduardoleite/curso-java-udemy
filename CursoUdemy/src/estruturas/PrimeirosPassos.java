package estruturas;

import java.util.Locale;

public class PrimeirosPassos {
	public static void primeiro() {
		double x = 13.459867856;
        //Locale.setDefault(Locale.US);
        System.out.println(x);
        System.out.printf("%.2f%n", x);

        /*
         * %f = ponto flutuante
         * %d = inteiro
         * %s = texto
         * %n = quebra de linha
         */
        String nome = "José";
        int idade = 20;
        double renda = 3200;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n%n", nome, idade, renda);
    }

    public static void segundo() {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 20;
        int code = 1201;
        char gender = 'M';

        double price1 = 2000;
        double price2 = 3000;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and genter: %s%n%n", age, code, gender);
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
