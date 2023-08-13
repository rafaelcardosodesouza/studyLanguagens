package applicantion;

import entitie.Employes;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employes person = new Employes();

        System.out.print("name: ");
        person.name = sc.nextLine();

        System.out.print("Gross salary: ");
        person.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        person.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee " + person);
        System.out.println();
        System.out.print("Which percent to increase salary? ");
        person.IncreaseSalary(sc.nextDouble());

        System.out.printf("Updated data: %s, R$ %.2f", person.name, person.grossSalary);


        sc.close();
    }
}