import java.util.Scanner;

import intites.triangle;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("type the three sides of triangle A");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("type the three sides of triangle B");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double resultA = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double resultB = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        if (resultB < resultA) {
            System.out.printf("Triangle A is bigger than triangle B with area %.4f", resultA);
        } else {
            System.out.printf("Triangle B is bigger than triangle A with area %.4f", resultB);
        }
        sc.close();
    }
}