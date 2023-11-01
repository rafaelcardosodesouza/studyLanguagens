//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
package application;


import resurces.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();


        Pessoas[] pessoa = new Pessoas[n];



        for (int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            System.out.printf("dados da %d° pessoa: \n", i + 1);
            System.out.print("nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            pessoa[i] = new Pessoas(nome, idade, altura);


        }
        System.out.println("\n");
        double mediaAltura = 0;


        for (int i = 0; i < pessoa.length; i++) {
            mediaAltura += pessoa[i].getAltura();
        }
        mediaAltura = mediaAltura / pessoa.length;

        double menor = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                menor++;
            }
        }
        menor = menor / n;
        System.out.printf("altura media: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos %.1f\n", menor*100);
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getNome());
            }
        }


        sc.close();
    }
}