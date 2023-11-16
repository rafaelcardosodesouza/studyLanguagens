import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas linhas vai ter? ");
        int linha = sc.nextInt();
        System.out.print("Quantas colunas vai ter? ");
        int coluna = sc.nextInt();
        int[][] mat = new int[linha][coluna];


        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.print("Qual numero voce quer consultar?? ");
        int x = sc.nextInt();


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("A localização é " + i + "," + j);
                    if (j > 0) {
                        System.out.println("O numero a esquerda: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("O numero em cima: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("O numero a direita: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("O numero a baixo : " + mat[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }
}