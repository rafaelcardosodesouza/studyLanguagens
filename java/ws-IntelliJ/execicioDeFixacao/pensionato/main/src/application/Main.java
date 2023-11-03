package application;

import resources.Guest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        int i;
        Guest[] user = new Guest[n];
        for (i = 0; i < user.length; i++) {
            System.out.printf("\nRent # %d :\n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("room: ");
            int number = sc.nextInt();

            user[i] = new Guest(name, email, number);
        }

        System.out.println("Busy rooms\n");
        for (i = 0; i < user.length; i++) {
            System.out.println(user[i]);
        }
        sc.close();
    }
}