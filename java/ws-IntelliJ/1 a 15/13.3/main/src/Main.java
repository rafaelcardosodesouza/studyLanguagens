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

        double resultX = x.area();
        double resultY = y.area();

        if (resultX < resultY) {
            System.out.printf("Triangle A is bigger than triangle B with area %.4f", resultX);
        } else {
            System.out.printf("Triangle B is bigger than triangle A with area %.4f", resultY);
        }
        sc.close();
    }
}