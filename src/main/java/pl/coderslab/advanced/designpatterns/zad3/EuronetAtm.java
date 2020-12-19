package pl.coderslab.advanced.designpatterns.zad3;

import java.util.ArrayList;
import java.util.List;

public class EuronetAtm implements AtmApi {
    private List<BankAccount> account = new ArrayList<>();

    public EuronetAtm() {
        this.account.add(new BankAccount("1234", 1000));
        this.account.add(new BankAccount("2345", 2000));
    }

    @Override
    public int withdrawMoney(String accountNumber, int amount) {
        for (BankAccount ba : this.account){
            if(ba.getNumber().equals(accountNumber)){
                try {
                    int money = ba.payOut(amount);
                    System.out.println("ekran bankomatu: wyciagnij karte i pobierz pieniadze");
                    return money;
                } catch (IllegalArgumentException e){
                    System.out.println("ekran bankomatu: "+e.getMessage());
                }
                return 0;
            }
        }

        System.out.println("ekran bankomatu: Not supported account number");

        return 0;
    }
}
