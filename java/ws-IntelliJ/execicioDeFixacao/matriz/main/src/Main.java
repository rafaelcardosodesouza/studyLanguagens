import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual vai ser a dimensão da matriz:");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
        int negativo = 0;
        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i]);
        }
        System.out.println(" ");


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    negativo++;
                }
            }
        }
        System.out.print("Existete " + negativo + " numeros negativos");


        sc.close();
    }
}