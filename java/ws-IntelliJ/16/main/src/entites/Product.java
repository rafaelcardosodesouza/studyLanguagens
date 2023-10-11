package entites;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public double totalValueStock() {
        return getPrice() * getQuantity();
    }

    public void addProduct(int quantity) {
        this.setQuantity(this.getQuantity() + quantity);
    }

    public void removeProducts(int quantity) {
        this.setQuantity(this.getQuantity() - quantity);
    }


    public String toString() {
        return getName()
                + ", $ "
                + String.format("%.2f", getPrice())
                + ", "
                + getQuantity()
                + " units, Total: "
                + String.format("%.2f", totalValueStock());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
