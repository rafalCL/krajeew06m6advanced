package pl.coderslab.advanced.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zad5 {
    public static void main(String[] args) {
        Map<String, String> ourMap = Stream.of("ala", "ma", "kota")
                .collect(Collectors.toMap(s -> s, s -> new StringBuffer(s).reverse().toString()));

        ourMap.entrySet().stream()
                .map(e -> e.getKey() + " : "+e.getValue())
                .forEach(System.out::println);
    }
}
