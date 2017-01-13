package Common;

/**
 * Created by godjqb on 16-11-30.
 */
public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        this.balance -= balance;
    }

    public void getbalance() {
        System.out.print("￥"+this.balance);
    }

}
