package pl.coderslab.advanced.designpatterns.zad3;

public class PhoneCard {
    private final String number;
    private int balance;

    public PhoneCard(String number, int initialBalance) {
        this.number = number;
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public String getNumber() {
        return number;
    }
}
