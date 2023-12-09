import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //01-Fazer um programa para ler um número inteiro, e depois
        // dizer se este número é negativo ou não

        int number1;
        System.out.print("Digite um numero: ");
        number1 = sc.nextInt();
        if(number1 < 0){
            System.out.println("O numero é negativo");
        } else{
            System.out.println("O numero é positivo");
        }






        sc.close();
    }
}