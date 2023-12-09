package entities;
public class Product {
    public String name;
    public double price;
    public int quantity;

    /*recomendável usar sempre que você precisar inicializar os objetos de uma classe de forma consistente e garantir que eles estejam em um estado válido desde o momento em que são criados*/
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }
    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}