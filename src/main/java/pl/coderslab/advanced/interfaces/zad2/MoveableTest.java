package pl.coderslab.advanced.interfaces.zad2;

public class MoveableTest {
    public static void main(String[] args) {
        Moveable[] moveables = {new Person(), new Car()};
// todo add Cat class
        for (Moveable m: moveables) {
            m.start();
            m.stop();
        }
    }
}
