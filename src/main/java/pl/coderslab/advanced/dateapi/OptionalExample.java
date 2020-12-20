package pl.coderslab.advanced.dateapi;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> animal = Optional.ofNullable("cat");

        animal.filter(name -> name.equals("cat")).ifPresent((n) ->
                System.out.println("It's a " + n));


        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "John");
        System.out.println(name); // John
//        Optional<Optional<String>> wrappedValue = Optional.of("Ala").map(s -> s);
// in the implementation of Optional.map() you will see that value is wrapped
// into a newly created optional object
//        Optional<String> notWrappedValue = Optional.of("Ala").flatMap();
// in the implementation of Optional.map() you will see that value is NOT wrapped
// into a newly created optional object, it's only casted assuming that it is
// an optional object already
    }
}
