package application;
import entites.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        user.setCount(sc.nextInt());
        sc.nextLine();

        System.out.print("Enter account holder: ");
        user.setName(sc.nextLine());

        System.out.print("Is there na initial deposit (y/n)? ");
        char tempDeposit = sc.next().charAt(0);
        sc.nextLine();
        if (tempDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            double amount = sc.nextDouble();
            user.initialDeposit(tempDeposit,amount);
        }


        System.out.print(user);

        /*debug*/
        System.out.println("\n****debug****\n");
        System.out.println(user.getCount());
        System.out.println(user.getName());
        System.out.println(user.getMoney());


        sc.close();
    }
}