//resulmo estudado
//System.out.print
//System.out.println
//System.out.printf
//  *  %d
//  *  %f
//  *  %s
//  *  %n
//Locale
//concatenar varios elementos

import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        int x = 3;
        double y = 15.12776;

        System.out.println(x);
        System.out.println(y);
        System.out.printf("%.2f%n", y); // %.2f isso esta dizendo que quero duas casas decimas
        System.out.printf("%.4f%n", y); //%n é a quebra de linha que nem em c
        Locale.setDefault(Locale.US); //muda o padrão de saida para tipo americano "," -> "."
        System.out.printf("%.2f%n", y);
        System.out.printf("%.2f%n", y);
        System.out.printf("O resultado é = %.2f metros%n", y);

        int idade = 20;
        String nome = "maria";
        double salario = 2150.555;

        System.out.printf("%s tem %d e recebe %.2f de salario", nome, idade, salario);

    }
}