package pl.coderslab.advanced.interfaces.zad2;

public class Person implements Moveable {
    @Override
    public void start() {
        System.out.println("Person idzie");
    }

    @Override
    public void stop() {
        System.out.println("Person się zatrzymuje");
    }
}
