package pl.coderslab.advanced.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Zad1 {
    public static void main(String[] args) {
        final List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo", "strawberry", "lemon", "as");

        System.out.println("ad 1");
        //- wypisze na ekranie wielkimi literami wszystkie łańcuchy zaczynające się
        // na literę „a” lub „s”,
// posortowane alfabetycznie
        fruits.stream()
                .filter(s -> s.startsWith("a") || s.startsWith("s"))
                .map(String::toUpperCase) // alternative: .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

        System.out.println("ad 2");
        //        - zwróci listę, która powstanie poprzez wybranie
        //        z listy unikalnych łańcuchów o długości równej 5
        List<String> uniqueLen5 = fruits.stream()
                .filter(s -> s.length() == 5)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueLen5.toString());

        System.out.println("ad 3");
//        - utworzy obiekt typu `String`, zbudowany z posortowanych
//        elementów listy ograniczonych do 3 pierwszych znaków każdego elementu,
//        oddzielonych przecinkami
        String giantString = fruits.stream()
                .map(s -> s.substring(0, Math.min(3, s.length())))
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println(giantString);

        System.out.println("sum of lengths");
        int sum = Stream.of("a", "bc")
                .map(s -> s.length())
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(sum);

        int sum2 = Stream.of("a", "bc")
                .mapToInt(s -> s.length())
                .sum();

        System.out.println(sum2);
    }
}
