package pl.coderslab.advanced.designpatterns.za2;

public class SingleThreadedProductFactory implements ProductFactory {
    @Override
    public Product getProduct(String kind) {
        if(kind.equals("simple")){
            return new SimpleProduct();
        } else if(kind.equals("advanced1")){
            return new AdvancedProduct("42");
        } else if(kind.equals("advanced2")){
            return new AdvancedProduct("123");
        } else if(kind.equals("virtual")){
            return new VirtualProduct();
        }

        throw new IllegalArgumentException("Unknown product kind: "+kind);
    }
}
