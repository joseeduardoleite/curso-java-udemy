package estruturas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicional {
	public static void Ex1()
    {
        //Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
        int nmr;
        Scanner sc = new Scanner(System.in);

        nmr = sc.nextInt();

        if (nmr >= 0)
            System.out.println("NAO NEGATIVO");
        else
            System.out.println("NEGATIVO");

        sc.close();
    }

    public static void Ex2()
    {
        //Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
        int nmr;

        Scanner sc = new Scanner(System.in);

        nmr = sc.nextInt();

        if (nmr % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }

    public static void Ex3()
    {
        //Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem crescente ou decrescente.

        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }

    public static void Ex4()
    {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
        //come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.

        Scanner sc = new Scanner(System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }

    public static void Ex5()
    {
        //Com base na tabela abaixo, escreva um programa que leia o c�digo de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = quantidade * 4.0;
        }
        else if (codigo == 2) {
            total = quantidade * 4.5;
        }
        else if (codigo == 3) {
            total = quantidade * 5.0;
        }
        else if (codigo == 4) {
            total = quantidade * 2.0;
        }
        else {
            total = quantidade * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }

    public static void Ex6()
    {
        //Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o estiver em
        //nenhum destes intervalos, dever� ser impressa a mensagem �Fora de intervalo�.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        }
        else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }

    public static void Ex7()
    {
        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
        //A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem �Origem�.
        //Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a situa��o.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x >= 0.0 && y >= 0.0) {
            System.out.println("Q1");
        }
        else if (x <= 0.0 && y >= 0.0) {
            System.out.println("Q2");
        }
        else if (x <= 0.0 && y <= 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }
    }

    public static void Ex8()
    {
        //Em um pa�s imagin�rio denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        //que nele n�o existem pol�ticos corruptos e os recursos arrecadados s�o utilizados em benef�cio da popula��o, sem
        //qualquer desvio. A moeda deste pa�s � o Rombus, cujo s�mbolo � o R$.
        //Leia um valor com duas casas decimais, equivalente ao sal�rio de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        //Lembre que, se o sal�rio for R$ 3002.00, a taxa que incide � de 8% apenas sobre R$ 1000.00, pois a faixa de
        //sal�rio que fica de R$ 0.00 at� R$ 2000.00 � isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa �
        //de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double imposto;
        if (salario <= 2000.00) {
            imposto = 0.0;
        }
        else if (salario <= 3000.00) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
