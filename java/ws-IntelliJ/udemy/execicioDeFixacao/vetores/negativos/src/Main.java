//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("quantos numeros voce vai digitar? ");
        int n= sc.nextInt();

        int[] numbers = new int[n];
        for(int i=0; i< numbers.length; i++){
            System.out.print("Digite o numero: ");
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i< numbers.length; i++){
            if(numbers[i] <0){
                System.out.print(numbers[i]);
            }
        }

    }
}