import car.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car carro = new Car();


        System.out.print("Entre com o nome do carro: ");
        carro.nome = sc.nextLine();

        System.out.print("Entre com o ano de fabricação: ");
        carro.ano = sc.nextInt();

        System.out.print("Entre com o tempo de uso: ");
        carro.tempoUso = sc.nextInt();

        sc.nextLine();
        System.out.print("Entre com o modelo: ");
        carro.modelo = sc.nextLine();

        sc.nextLine();
        System.out.print("Ligar carro? \n 1- sim \n 0- não\nR: ");
        carro.ligado = sc.nextInt();


        carro.ligadoDesligado();
        System.out.println("+-------------------+");

        System.out.println("+-------------------+");
        carro.detalhes();

        sc.close();
    }
}
