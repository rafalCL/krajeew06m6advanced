package pl.coderslab.advanced.designpatterns.zad3;

public class AtmTest {
    public static void main(String[] args) {
        AtmApi atmKoloZabki = new EuronetAtm();
        atmKoloZabki.withdrawMoney("2", 1600);
    }
}
