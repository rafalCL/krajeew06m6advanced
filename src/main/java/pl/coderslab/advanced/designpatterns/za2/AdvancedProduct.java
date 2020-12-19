package pl.coderslab.advanced.designpatterns.za2;

public class AdvancedProduct implements Product {
    private String advancedStuffInside;

    public AdvancedProduct(String advancedStuffInside) {
        this.advancedStuffInside = advancedStuffInside;
    }

    @Override
    public void doUsefulStuff() {
        System.out.println("I am an advanced product, I do things so complicated that almost noone knows how. But "+this.advancedStuffInside);
    }
}
