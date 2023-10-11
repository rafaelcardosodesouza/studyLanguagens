//praticanco um pouco
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op, soma = 0;
        int ac;
        do {
            System.out.print("Digite a quantidade de vezes que vai repetir: ");
            op = sc.nextInt();
            for (int i = 1; i < op + 1; i++) {
                System.out.println("Estou no numero: " + i);
                soma += i;
            }
            System.out.print("A soma total de todos os numeros é: " + soma);
            System.out.printf("%nDeseja sair? %n 1 -> sair %n 0 -> não%n");
            ac = sc.nextInt();
        } while (ac != 1);

        sc.close();

    }
}
// :)