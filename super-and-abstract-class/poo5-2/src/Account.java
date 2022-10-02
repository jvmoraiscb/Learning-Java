package src;

public class Account {
    private int id;
    private String name;
    private float balance;

    public Account(int id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0f;
    }

    public float getBalance(){
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean withdrawal(float amount){
        float realAmount = amount + amount*0.05f;

        if (this.balance >= realAmount) {
            this.balance -= realAmount;
            return true;
        }
        return false;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public String toString(){
        return String.format("ID: %d | Name: %s | Balance: %.2f", this.id, this.name, this.balance);
    }
}
