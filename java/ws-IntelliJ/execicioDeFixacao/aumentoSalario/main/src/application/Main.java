package application;

import entities.Employee;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees wil be registered? ");
        int qtd = sc.nextInt();
        espace();
        List<Employee> employesList = new ArrayList<>();

        for (int i = 0; i < qtd; i++) {

            System.out.println("Employee #" + i);
            System.out.print("ID: ");
            Integer id = sc.nextInt();

            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employesList.add(employee);
            System.out.println(" ");
            for(int x = 0; x<qtd; x++){
                if(employee.getId() == id){
                    System.out.print("ID repetido");
                }
            }

        }
        espace();
        System.out.print("Enter the employee id that will have salary increase: ");

        int searchId = sc.nextInt();
        boolean found = false;
        for (Employee employee : employesList) {
            if (employee.getId() == searchId) {
                System.out.println("Employee found: " + employee.getName());
                System.out.print("Enter the percentage: ");
                double promo = sc.nextInt();
                promo /= 100;
                employee.setSalary(promo);
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found");
        }

        espace();
        for (Employee x : employesList) {
            System.out.println(x);
        }

        sc.close();
    }

    public static void espace() {
        System.out.println("\n---------------------\n");
    }
}