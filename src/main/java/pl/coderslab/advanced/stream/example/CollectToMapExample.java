package pl.coderslab.advanced.stream.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectToMapExample {
    public static void main(String[] args) {
        List<String> fruits =
                Arrays.asList("orange", "lemon", "peach", "banana", "plum",
                        "cherry", "apple", "pomelo");
        Map<Integer, String> collect = fruits.stream()
                .collect(Collectors.toMap(s -> s.length(), s -> s));
    }
}
