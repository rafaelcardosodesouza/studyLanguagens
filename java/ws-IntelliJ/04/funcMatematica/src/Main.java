import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        //Exercício 01
        //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, soma1, pi, c, area,d,e,f,g,diferenca;
        pi = 3.14159;

        System.out.printf("Digite o primeiro valor %n");
        a = sc.nextDouble();
        System.out.printf("Digite o segundo valor %n");
        b = sc.nextDouble();
        soma1 = a + b;
        System.out.printf("A soma de " + a + " + " + b +" é: " + soma1);

        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π. raio2
        //Considere o valor de π = 3.14159


        System.out.printf("%nValor de area de um circulo:%n");
        System.out.printf("Qual o raio do circulo?%n");
        c = sc.nextDouble();
        area = pi * (Math.pow(c, 2));
        System.out.printf("O valor da area é de %.4f%n", area);


        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        System.out.printf("%na diferença do produto de D e F pelo produto de G e H");
        System.out.printf("Digite todos os valores separado por espaço%n");
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        g = sc.nextDouble();

        diferenca = (d*e) - (f*g);
        System.out.printf("a diferença é de %.0f\n", diferenca);

    }
}