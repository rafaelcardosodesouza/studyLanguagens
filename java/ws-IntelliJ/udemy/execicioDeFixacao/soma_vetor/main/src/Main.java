//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < numeros.length; i++) {
            sum += numeros[i];
        }
        System.out.println("\n");
        System.out.print("Numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "   ");
        }
        System.out.println("\n");
        System.out.println("Soma: " + sum);
        System.out.print("Media: " + sum / n);

        sc.close();
    }
}