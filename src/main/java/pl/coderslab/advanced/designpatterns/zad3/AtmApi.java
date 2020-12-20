package pl.coderslab.advanced.designpatterns.zad3;

public interface AtmApi {
    int withdrawMoney(String accountNumber, int amount);
    void recharge(String accountNumber, PhoneCard toRecharge, int amount);
//    void transferMoney(Transfer transfer);
}
