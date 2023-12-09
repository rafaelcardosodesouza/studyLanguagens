/*vetores pt1*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i =0; i<n; i++){
            System.out.print("enter for number: ");
            vect[i]=sc.nextDouble();
        }

        double tempValue =0;
        for(int i=0; i<n;i++){
            tempValue += vect[i];
        }

        System.out.printf("The media of the values entered is: %.2f", tempValue/n);

        sc.close();
    }
}