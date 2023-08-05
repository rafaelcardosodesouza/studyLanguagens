import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 89; //0101 1001
        int b = 60; //0011 1100

        // & | ^ eles fazem a comparação de bit a bit, ou seja,
        // ela vai comparar o valor de bit com outro bit
        // se verdadeiro é 1 se não é 0
        // Normalmente é usado em programação de baixo nivel como arduino
        // ou verificação de bit especifico

        System.out.println(a & b); //0001 1000
        System.out.println(a | b); //0111 1101
        System.out.println(a ^ b); //0110 0101

        //exemplo de aplicação:
        int mask = 0b100000;
        System.out.println("enter the value to be checked: ");
        int n = sc.nextInt();

        if ((n & mask) != 0) {
            System.out.print("6th bit is true");
        } else {
            System.out.print("6th bit is false");
        }
    }
}
