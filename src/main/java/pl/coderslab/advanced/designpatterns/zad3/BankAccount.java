package pl.coderslab.advanced.designpatterns.zad3;

public class BankAccount {
    private final String number;
    private int balance;

    public BankAccount(String number, int initialBalance) {
        this.number = number;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public int payOut(int amount) {
        if(this.balance>=amount){
            this.balance -= amount;
            return amount;
        }

        throw new IllegalArgumentException("Balance not sufficient");
    }

    public String getNumber() {
        return number;
    }
}
