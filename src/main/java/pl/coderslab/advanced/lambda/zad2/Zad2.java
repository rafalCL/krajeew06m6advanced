package pl.coderslab.advanced.lambda.zad2;
//
//## Zadanie 2 - rozwiązywane z wykładowcą
//
//        1. Korzystając z interfejsu funkcyjnego Predicate napisz wyrażenie lambda,
//        które będzie sprawdzało czy podany parametr jest typu znakowego (String) i jeśli tak,
//        to wypisze go na ekranie

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Zad2 {
    public static void main(String[] args) {
        Predicate isString = o -> o instanceof String;

        int intVal = 42;
        if(isString.test(intVal)){
            System.out.println(intVal);
        }

        String strVal = "to jest napis";
        if(isString.test(strVal)){
            System.out.println(strVal);
        }

        System.out.println("consumer example");
        Consumer writeIfString = o -> {if(isString.test(o)) System.out.println(o);};
        writeIfString.accept(intVal);
        writeIfString.accept(strVal);
    }
}
