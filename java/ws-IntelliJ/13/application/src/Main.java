/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron): */


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC, xCalcule, yCalcule, p;

        System.out.print("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.print("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA + xB + xC) / 2;
        xCalcule =(double) Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        yCalcule =(double) Math.sqrt(p* (p - yA)* (p - yB)* (p - yC));


        if (yCalcule < xCalcule) {
            System.out.printf("the first triangle is bigger with the area of:  %.4f%n", xCalcule);
        } else {
            System.out.printf("the second triangle is bigger with the area of:  %.4f%n", yCalcule);

        }
        sc.close();
    }


}