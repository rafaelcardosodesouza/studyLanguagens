package aplication;

import java.util.Scanner;
import util.CurrencyCOnverter;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the dollar price? ");
        CurrencyCOnverter.cost =sc.nextDouble();
        System.out.print("How many dollars will be bought: ");
        CurrencyCOnverter.quotationValue = sc.nextDouble();
        System.out.printf("Amount to be paid is reais = %.2f",CurrencyCOnverter.dollar());

    }
}