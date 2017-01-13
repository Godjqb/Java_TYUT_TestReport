import Common.Account;

/**
 * Created by godjqb on 16-11-30.
 */
public class account {
    public static void main(String[] args) {
        Account a = new Account(10000);
        a.deposit(1000);
        a.getbalance();
    }
}
