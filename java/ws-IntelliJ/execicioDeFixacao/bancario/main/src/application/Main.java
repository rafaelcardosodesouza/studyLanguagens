package application;

import entites.Account;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Account account;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int tempNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String tempHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char tempDeposit = sc.next().charAt(0);
        sc.nextLine();

        if (tempDeposit == 'y'){
            System.out.print("enter valuer: ");
            double tempMoney = sc.nextDouble();
            account = new Account(tempNumber, tempHolder, tempMoney);
        }else{
            account = new Account(tempNumber, tempHolder);
        }

        System.out.println("\n");
        System.out.println("Account data:");
        System.out.print(account);

        System.out.println("\n");
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.print("Updated account data");
        System.out.print(account);
        System.out.println("\n");

        System.out.print("Enter a withdraw value: ");
        account.removeAmount(sc.nextDouble());
        System.out.println("\n");

        System.out.print("Updated account data");
        System.out.print(account);

        /*debug*/
        System.out.println("\n****debug****\n");
        System.out.println("*  " + account.getCount());
        System.out.println("*  "+account.getName());
        System.out.println("*  "+account.getMoney());
        System.out.println("\n****debug****\n");

        sc.close();
    }
}