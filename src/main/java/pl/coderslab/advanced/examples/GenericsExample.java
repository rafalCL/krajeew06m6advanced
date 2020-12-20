package pl.coderslab.advanced.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Box <T extends Number> {
    private T element;

}

@FunctionalInterface
interface FunctionalInterfaceExample {
    void doSomething();
}

public class GenericsExample {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
//        Box<String> box2 = new Box<>(); // compilator will not allow

        List list = new ArrayList<>(); // no type checking :/ (before java 5)
        list.add("ala");
        list.add("ola");
        list.add(42); // oh no!

        String myName = (String) list.get(0); // ugly (before java 1.5)
    }
}
