package estruturas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {
	public static void Ex1()
    {
		//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma mensagem explicativa, conforme exemplos.
        Scanner sc = new Scanner(System.in);

        int primeiroNumero, segundoNumero, soma;

        primeiroNumero = sc.nextInt();
        segundoNumero = sc.nextInt();

        soma = primeiroNumero + segundoNumero;

        System.out.println(soma);

        sc.close();
    }
    public static void Ex2()
    {
        // Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea deste c�rculo com quatro casas decimais conforme exemplos.
        // F�rmula da �rea: area = PI . raio2
        // Considere o valor de PI = 3.14159

        Locale.setDefault(Locale.US);

        double raio, area;

        Scanner sc = new Scanner(System.in);

        raio = sc.nextDouble();

        area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("%.4f", area);

        sc.close();
    }

    public static void Ex3()
    {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
        //de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).

        int a = 0, b = 0, c = 0, d = 0;
        double diferenca;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferenca = (a * b - c * d);
        System.out.printf("%.0f", diferenca);

        sc.close();
    }

    public static void Ex4()
    {
        //Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
        //hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salario;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        numeroFuncionario = sc.nextInt();
        horasTrabalhadas = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f", salario);

        sc.close();
    }

    public static void Ex5()
    {
        //Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
        //c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qte1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qte2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }

    public static void Ex6()
    {
        //Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e mostre:
        //a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
        //b) a �rea do c�rculo de raio C. (pi = 3.14159)
        //c) a �rea do trap�zio que tem A e B por bases e C por altura.
        //d) a �rea do quadrado que tem lado B.
        //e) a �rea do ret�ngulo que tem lados A e B
        Locale.setDefault(Locale.US);
        double a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTrianguloRetangulo = (a * c) / 2;
        areaCirculo = pi * Math.pow(c, 2);
        areaTrapezio = (a + b) * c / 2;
        areaQuadrado = Math.pow(b, 2);
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
    }
}
