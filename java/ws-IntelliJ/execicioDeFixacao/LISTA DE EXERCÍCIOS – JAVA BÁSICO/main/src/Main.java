import java.util.Locale;
import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


//1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

        int idade, mes, dia;
        System.out.printf("Digite a sua idade em anos: ");
        idade = sc.nextInt();
        mes = idade * 12;
        dia = idade * 365 + mes * 30;
        System.out.printf("Você tem %d anos e %d meses e %d dias de vida.%n", idade, mes, dia);


//Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//números 4, 5 e 6. A soma das duas médias. A média das médias.
        double media, a, b;
        a = 8 + 9 + 7;
        b = 4 + 5 + 6;
        media = (a + b) / 2;
        System.out.println("Média aritmética dos números 8, 9 e 7, média dos números 4, 5 e 6 e média das médias: " + media);


        //Informar um saldo e imprimir o saldo com reajuste de 1%.
        double salario, salarioReajustado, diferenca;
        System.out.println("Informe o seu salário: ");
        salario = sc.nextDouble();
        diferenca = salario * 0.01;
        salarioReajustado = salario + diferenca;
        System.out.printf("O salário com reajuste de 1%% é: %.2f%n", salarioReajustado);


        //Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        //antecessor e seu sucessor.
        int newNumber, anterior, posterior;
        System.out.print("Digite um número inteiro: ");
        newNumber = sc.nextInt();
        anterior = newNumber - 1;
        posterior = newNumber + 1;
        System.out.println("O número digitado foi: " + newNumber + ", o número anterior é " + anterior + " e o próximo número é: " + posterior);

        sc.close();


    }
}