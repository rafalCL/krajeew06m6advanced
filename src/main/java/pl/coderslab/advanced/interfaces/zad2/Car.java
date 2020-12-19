package pl.coderslab.advanced.interfaces.zad2;

public class Car implements Moveable {
    @Override
    public void start() {
        System.out.println("Car jedzie");
    }

    @Override
    public void stop() {
        System.out.println("Car się zatrzymuje");
    }
}
