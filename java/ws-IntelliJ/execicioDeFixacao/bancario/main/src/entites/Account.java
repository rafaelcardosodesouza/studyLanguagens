package entites;

public class Account {

    private int count;
    private String name;
    private Double money = 0.0;



    public Account(int count, String name){
        this.count = count;
        this.name = name;
    }
    public Account(int count, String name, double money){
        this.count = count;
        this.name = name;
        this.money = money;
    }

    public int getCount() {
        return count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void deposit(double value){
        money += value;
    }
    public void removeAmount(double cashWithdrawal){
       setMoney(getMoney()-cashWithdrawal);
    }

public String toString(){
        return "Account " + getCount() + ", Holder:" + getName() + ", balance: R$ "  + String.format("%.2f",getMoney());
}

}
