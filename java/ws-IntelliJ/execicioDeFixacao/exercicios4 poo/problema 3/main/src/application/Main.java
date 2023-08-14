package application;

import entities.Student;
import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        System.out.print("Enter the student's name: ");
        newStudent.name = sc.nextLine();
        System.out.printf("Enter %s's notes: ", newStudent.name);
        newStudent.grade1 = sc.nextDouble();
        newStudent.grade2 = sc.nextDouble();
        newStudent.grade3 = sc.nextDouble();
        System.out.println(newStudent.missingGrade());

        sc.close();
    }
}