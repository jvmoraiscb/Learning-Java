package src;

public class SpecialAccount extends Account {
    public SpecialAccount(int id, String name){
        super(id, name);
    }

    @Override
    public boolean withdrawal(float amount){
        float realAmount = amount + amount*0.01f;
        float currentBalance = this.getBalance();

        if (currentBalance >= realAmount) {
            this.setBalance(currentBalance - realAmount);
            return true;
        }
        return false;
    }
}
