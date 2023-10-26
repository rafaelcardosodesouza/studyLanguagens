package entites;

public class User {

    private int count;
    private String name;
    private Double money = 0.0;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
    public void Deposit(int reply, double amount){
        if(reply == 'y'){
            setMoney(amount+getMoney());
        }
    }

    public void removeAmount(double cashWithdrawal){
       setMoney(getMoney()-cashWithdrawal);
    }

public String toString(){
        return "Account " + getCount() + ", Holder:" + getName() + ", balance: R$ " + getMoney();
}

}
