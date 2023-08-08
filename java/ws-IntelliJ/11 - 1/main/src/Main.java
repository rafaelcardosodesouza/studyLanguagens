//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String original = "abcde ABCDE ABC abc DEFG     ";
        String ex1 = original.toLowerCase();
        String ex2 = original.toUpperCase();
        String ex3 = original.trim();
        String ex4 = original.substring(2);
        String ex5 = original.substring(2, 8);
        String ex6 = original.replace('a', 'X');
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc"); //busca a ultima string


        System.out.println("original  -" + original);
        System.out.println("toLowerCase - " + ex1);
        System.out.println("toUpperCase - " + ex2);
        System.out.println("trim - " + ex3);
        System.out.println("substring - " + ex4);
        System.out.println("substring X - Y" + ex5);
        System.out.println("replace X por Y" + ex6);
        System.out.println("indexOf 'bc' " + i);
        System.out.println("lastIndexOf 'bc' " + j);


        //split
        System.out.printf("\nSplit\n\n");
        String s = "banana tomate melão";
        String[] vect = s.split(" "); //aqui posso definir a regra para fazer split

        for (int x = 0; x < 3; x++) {
            System.out.println(vect[x]);
        }


    }
}