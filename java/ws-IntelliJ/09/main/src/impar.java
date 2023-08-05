import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberUser;
        System.out.print("Insira um numero: ");
        numberUser = sc.nextInt();
        for (int i = 0; i < numberUser; i++) {
            if (i % 2 != 0) {
                System.out.println("O numero, " + i + " é impar");
            }
        }
    }
}