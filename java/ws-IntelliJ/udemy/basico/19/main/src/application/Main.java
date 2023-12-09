package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Enter off name for product: ");
            sc.nextLine();
            String tempName = sc.nextLine();

            System.out.print("Enter off price for product: ");
            double tempPrice = sc.nextDouble();
            System.out.println("\n");
            vect[i] = new Product(tempName, tempPrice);


        }
        double sum =0.0;
        for(int i=0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }



        System.out.printf("the average value of the products is: %.2f\n", sum/n);
        System.out.println("DEBUG");
        for(int i=0; i< vect.length; i++){
            System.out.println(vect[i].getName());
        }

        sc.close();

    }
}