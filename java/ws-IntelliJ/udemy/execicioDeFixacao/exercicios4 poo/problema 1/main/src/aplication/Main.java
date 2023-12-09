package aplication;

import entites.Rectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        System.out.print(rectangle.toString());
        sc.close();
    }
}