//formatação de string
public class Main {
    public static void main(String[] args) {


        String original = "abcde ABCDE ABC abc DEFG     ";
        String ex1 = original.toLowerCase(); //  .toLowerCase() deixa tudo minusculo
        String ex2 = original.toUpperCase(); //  .toUpperCase() deixa tudo maisculo
        String ex3 = original.trim();        //  .trim remove os espaços vazio
        String ex4 = original.substring(2);// substring vai usar só os caracteres da posição X em diante
        String ex5 = original.substring(2, 8); //vai exibir da posição x até a posição y
        String ex6 = original.replace('a', 'X'); // vai substituir os caracteres X por Y
        int i = original.indexOf("bc"); //vai exbir a pociração referenciada



        System.out.println("original  -" + original);
        System.out.println("toLowerCase - " + ex1);
        System.out.println("toUpperCase - " + ex2);
        System.out.println("trim - " + ex3);
        System.out.println("substring - " + ex4);
        System.out.println("substring X - Y" + ex5);
        System.out.println("replace X por Y" + ex6);
        System.out.println("indexOf bc " + i);

    }
}