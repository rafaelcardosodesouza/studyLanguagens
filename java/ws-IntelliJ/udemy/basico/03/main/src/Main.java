import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char x;
        System.out.print("Digite uma palavra :  ");
        x = sc.next().charAt(0);

        System.out.printf("A primeira letra é \n" + x);
        // varias entradas numa unica linha
        String a;
        int b;
        Double c;

        System.out.printf("\nnome, int e double%n");
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();

        System.out.println("Os dados digitados foram:");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        sc.close();
    }
}