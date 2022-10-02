import src.Account;
import src.SpecialAccount;

public class App {
    public static void main(String[] args) {
        Account joao = new Account(1, "João Victor Morais");
        SpecialAccount talles = new SpecialAccount(2, "Talles Cavalleiro");

        joao.deposit(50f);
        talles.deposit(50f);

        joao.withdrawal(20f);
        talles.withdrawal(20f);

        System.out.println(joao);
        System.out.println(talles);
    }
}