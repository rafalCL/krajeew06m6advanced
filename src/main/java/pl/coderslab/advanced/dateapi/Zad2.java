package pl.coderslab.advanced.dateapi;

//1. Napisz program, który wypisze na standardowym wyjściu aktualną godzinę
// we wszystkich europejskich strefach czasowych
//        Wykorzystaj `getAvailableZoneIds()` z klasy `ZoneId`
//        - filtruj sprawdzając czy strefa czasowa
//        zawiera słowo `Europe`.

import java.time.LocalTime;
import java.time.ZoneId;

public class Zad2 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()
                .stream()
                .filter(s -> s.startsWith("Europe"))
                .map(s -> s+" : "+ LocalTime.now(ZoneId.of(s)))
                .forEach(System.out::println);
    }
}
