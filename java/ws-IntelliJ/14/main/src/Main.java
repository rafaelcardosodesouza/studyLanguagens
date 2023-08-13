import entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Product product = new Product();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product Data: " + product);
        System.out.println();

        System.out.print("Enter the number of product to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println("Update Data: " + product);

        System.out.println();
        System.out.print("Enter the number of product to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.printf("Update Data: " + product);

        sc.close();
    }
}