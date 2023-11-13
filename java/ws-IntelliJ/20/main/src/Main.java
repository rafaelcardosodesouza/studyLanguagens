import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Rafael");
        lista.add("Francisco");
        lista.add("Maria");
        lista.add("Joelma");
        lista.add("Maria");
        lista.add("Robson");

        lista.add(2,"Marco");


        for (String x : lista){
            System.out.println(x);
        }

       // System.out.println("------------------------");
        //lista.removeIf(x -> x.charAt(0) == 'M');


        for (String x : lista){
            System.out.println(x);
        }
        System.out.println("------------------------");

        System.out.println("Index of Marco: "+ lista.indexOf("Marco"));
        System.out.println("------------------------");

        List<String> result = lista.stream().filter(x->x.charAt(0)=='M').toList();

        for (String x : result){
            System.out.println(x);
        }
        System.out.println("------------------------");
        String name = lista.stream().filter(x->x.charAt(0)=='R').findFirst().orElse(null);

        System.out.println(name);
    }
}