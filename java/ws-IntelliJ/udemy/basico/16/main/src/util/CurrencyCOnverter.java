package util;

public class CurrencyCOnverter {
    public static double quotationValue;
    public static double cost;
    public static double dollar(){
        return cost * quotationValue + (quotationValue*cost*0.06);
    }

}
