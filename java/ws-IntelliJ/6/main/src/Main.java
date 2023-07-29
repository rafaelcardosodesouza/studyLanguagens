
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //expreção condição ternaria

        //int num1;

        //System.out.print("Digite um numero: ");
        //num1 = sc.nextInt();
        //System.out.print((num1 < 10) ? "numero menor que 10":"Numero maior que 10");
        //sc.close();


        //OPERADOR TERNARIO:
        Scanner sc = new Scanner(System.in);
        double price;
        double discount;

        System.out.print("Enter the product value: ");

        price = sc.nextDouble();
        discount= (price > 200.00) ? price * 0.1 : 0 ;

        System.out.print(discount);


    }
}