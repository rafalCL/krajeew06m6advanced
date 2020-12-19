package pl.coderslab.advanced.designpatterns.za2;

public class FactoryTest {
    private final static ProductFactory factory = new SingleThreadedProductFactory();

    public static void main(String[] args) {
        Product simple = factory.getProduct("simple");
        simple.doUsefulStuff();

        Product advanced1 = factory.getProduct("advanced1");
        advanced1.doUsefulStuff();

        Product advanced2 = factory.getProduct("advanced2");
        advanced2.doUsefulStuff();

        Product virtual = factory.getProduct("virtual");
        virtual.doUsefulStuff();
    }
}
