import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int num, soma = 0;

        System.out.print("How many numbers will be placed? ");
        op = sc.nextInt();

        while (op != 0) {
            System.out.println("enter a number ");
            num = sc.nextInt();
            soma = soma + num;
            op -= 1;
        }
        System.out.print("The total sum of the numbers entered is: " + soma);
        sc.close();
    }
}