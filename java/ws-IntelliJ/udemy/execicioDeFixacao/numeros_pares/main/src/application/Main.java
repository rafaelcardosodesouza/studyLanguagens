package application;

import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar?: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];
        int i, j = 0;
        for (i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o numero %d°: ", i + 1);
            numeros[i] = sc.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
                j++;
            }
        }
        System.out.print("QUANTIDADE DE PARES: " + j);
        sc.close();
    }
}