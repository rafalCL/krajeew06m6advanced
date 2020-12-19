package pl.coderslab.advanced.designpatterns.za2;

public class VirtualProduct implements Product {
    @Override
    public void doUsefulStuff() {
        System.out.println("I am a virtual product, I do nothing, cause I'm virtual.");
    }
}
